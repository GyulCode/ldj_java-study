package Oracle_Memo;
/*
   2023-05-19 3장정리
   
   DDL 데이터 정의어
	   CREATE
	   ALTER(ADD,MODIFY DROP RENAME )수정
	   DROP
	   RENAME
	   REUNCATE
   
   문자열 처리
      문자열 결합 : || -> SELECT ename || job ~
      별칭 SELECT ename "이름"
         SELECT ename AS 이름
      DISTINCT 컬럼 -> 2개이상 쓰면 중복제거가 취소됨
      문자, 날짜는 반드시 ''사용 -> 'YY/MM/DD'
      String sql = "SELECT * FROM emp WHERE ename = 'KING'";
      String ename = "KING";
      String sql = "SELECT * FROM emp WHERE ename ='" + ename + "'";
      String sql = "SELECT * FROM emp WHERE ename =" + ename; -> 오류남**
      name =값 sex=값 addr=값
      String sql = "INSERT INTO memeber VALUES('" +name +"', '" +sex + "','" + addr +"','"+age+"'");
      -----------------------
      오라클에서는 명령문 종료하면 ; 사용 자바에서 x
      오라클에서는 DML을 사용하면 COMMIT을 해줘야함
      자바에서는 AUTOCOMMIT 사용한다 -> ROLLBACK(트랜잭션 프로젝트)
      
      1) 형식
         SELECT * (전체데이터) | column_list (필요한 데이터)
         FROM (table_name | view_name | SELECT~)
         --------------------------------------------------- 필수조건
         [
	         WHERE 조건문(컬럼 | 함수 연산자 값)
	         GROUP BY 그룹컬럼 | 함수 ---그룹별로 따로 처리 (부서별, 입사년도별, 직위별)
	         HAVING 그룹컬럼 | 함수 -> GROUP에 대한 조건절이라 GROUP BY가 반드시 있어야함
	         ORDER BY 컬럼 | 함수:숫자(ASC,DESC) ---정렬
	         -> 이중 정렬 -> ,로 구분 -> 답변형 게시판, 대대글
	         
         ]
         ==== ORDER BY는 사용을 권장하지는 않음 SORT하는데 시간이 오래걸림
              -> 대안으로 INDEX를 권장한다. : INDEX_ASC(), INDEX_DESC()
              
      2) 조건검색 -> 연산자
         = 산술(+,-,*,/)
           ROW 단위 통계(함수로 지원하지 않는다) -> 필요에의해 제작해서 사용 FUNCTION
           '10'+1 -> TO_NUMBER('10')+1 = 11 자동변환이 된다
                      ------------ 권장하는 방법은 아님
           'A'+1 -> 오류 // ASCII('A')+1 ->66
           'A'||1 = A1
           sum, avg -> column 단위 처리
           산술연산자 -> SELECT뒤에서 처리
           
         = 비교 : =, <>(!=,^=), <,>,<=,>= =>(true/false) -> WHERE 뒤에
         
         = 논리 : AND, OR -> ||(문자열 결합), &(입력)
         
         = 데이터베이스 연산자
           NULL 처리 -> IS NULL, IS NOT NULL
           -> 조건이 NULL이면 전체데이터를 읽어온다 : NVL()이용
           -> 데이터값이 NULL값ㅇ일때 브라우저에서는 NULL출력을 한다
           NOT -> 부정 연산자
                  NOT IN() , NOT BETWEEN(예약일이 아닌), NOT LIKE
           LIKE -> 포함문자, 시작문자, 끝문자 ...글자수...
                   % : 문자의 지정 갯수 X
                   _ : 한문자
                   '%A%' : A를포함하는 문자 출력
                      -> 최근 에는 정규식함수를 사용한다 : REGEXP_LIKE()
           IN -> OR가 여러개 -> 다중조건(체크박스) -> 동적쿼리(MYBATIS, JPA)
           BETWEEN ~ AND : 기간, 범위 -> AND <=
      
      3) 오라클에서 지원하는 함수
         단일행 함수 -> ROW단위 처리
         = 문자 관련
           LENGTH() : 문자의 갯수 -> LENGTH('aaa') =3
           SUBSTR() : 문자열 자르기 -> SUBSTR(문장열, 시작위치, 자를갯수)
                      ** 단 오라클의 문자열 시작 번호는 1이다!!
           INSTR() : 문자의 위치번호 -> INSTR(문자열, 찾는 문자, 시작위치, 몇번째 위치)
                     -> INSTR('Hello','l',1,2) = 4 반환
           RPAD : RPADE(문장열, 공간, 대체할문자)
                  RPAD('admin', 10,'*') -> *****admin
         = 숫자관련
           ROUND() : 반올림 -> ROUND(75.678, 2) -> 75.68
           TRUNC() : 버림 -> TRUNC(75.678, 2) -> 75.67
           CEIL() : 올림 CEIL(75.678) -> 76 -> 총페이지 나누기
           MOD()
           
         = 날짜관련
           SYSDATE : 시스템의 시간을 읽어 온다
           MONTHS_BETWEEN : 기간의 개월수 -> 호봉/퇴직금
           MONTHS_BETWEEN(현재, 과거) -> MONTHS_BETWEEN(SYSDATE, hiredate)  
           
         = 변환
           TO_CHAR : 문자열로 변환
              SimpleDateFormat -> 날짜 변환
              TO_CHAR(hirdate,'YYYY-MM-DD')
                              -------------패턴
                              년도 : YY/YYYY RR/RRRR
                              월 : MM
                              일 : DD
                              시간 : HH/HH24
                              분 : MI
                              초 : SS
              DeciamlFormat -> 숫자변환
              TO_CHAR(10000,'999,999')
              
         = 기타
           NVL : NULL 값을 대체
               -> NVL(값, 데체값)
                     ---  ---데이터형이 동일해야 된다
               -> NVL(comm, '없음') -> 오류
                      ------NUMBER
               -> NVL(TO_CHAR(comm),'없음')
                     ---  ---데이터형이 동일해야 된다   
               decode, case -> PL/SQL(Function,Procedure, Trigger)
         집계함수 -> Column단위 처리
            sum -> 총합 -> sum(컬럼) -> sum(sal)
            avg -> 평균 -> avg(컬럼)
            max/min -> 최대값 -> max(컬럼)
            count -> row의 갯수 -> count(컬럼) -> null값 제외, count(*) - null값 포함
            CUBE / ROLLUP : 통게 (GROUP BY 에서 주로사용)
            RANK : RANK() OVER(ORDER BY 컬럼 ASC|DESC)
            1224
            DENSE_RANK : DENSE_RANK() OVER(ORDER BY 컬럼 ASC|DESC)
            1223
            GOURP BY : 그룹으로 묶어서 처리
            -> GROUP BY 컬럼/함수
            -> 이중 GROUP BY deptno, job -> 1.부서별로 그룹화 하고 이걸 다시 2.직위별로 그룹화 하여라
               조건 having 그룹함수
               집계함수와 단일행 함수는 동시에 사용이 불가능 -> group by를 이용하면 가능
               
               SELECT SUM(sal), SUBSTR()
               FROM emp; -> 오류
               
               SELECT SUBSTR(), SUM(sal) 
               FROM emp
               GROUP BY SUBSTR();
           
      4) 다른 테이블 연결 -> 정규화 : 조인, 서브쿼리
      
      
     
      
      

*/
public class test14_0519_정리 {

}
