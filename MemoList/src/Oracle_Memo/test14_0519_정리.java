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
         join -> select문장에서만 사용이 가능
         ----두개이상의 테이블을 연결해서 필요한 데이터 추출
         = select 컬럼대신 ---- 스칼라 서브쿼리(JOIN 대체)
         = from 테이블대신 사용 ---- 인라인뷰 --> 보안, 페이지나누기
         = where문장 조건값 ---- 서브쿼리
         
         조인 종류
            INNER JOIN(INTERSECT 교집합) -> NULL일 경우에 처리하지 않는다
                  -> 연산자(=, BETWEEN, 논리연산자) -> 같은 값, 포함
                  -> EQUI_JOIN(동등조인)
                  -> NON_EQUI_JOIN(비동등 조인) =외의 다른 연산자
                  -> NATURAL JOIN -> SQL문장이 간결 -> 같은 컬럼을 가지고 있다
                  -> JOIN ~USING -> SQL문장이 간결 -> 같은 컬럼을 가지고 있다
                  형식)
                     오라클 조인 (오라클, MySQL)
                     SELECT A.a, A.b, B.b, B.c -> 컬럼명마다 테이블명.컬럼명으로 구분 테이블명은 별칭도 가능
                     FROM A aa (INNER)JOIN B bb -> 테이블의 별칭
                     ON A.b = B.b
                     
					 SELECT A.a, A.b, B.b, B.c 
                     FROM A JOIN B USING(b)
                     
                     **조인시 반드시 컬럼명이 같은건 아니다
                      -> 값을 가지고 있는 컬럼이 있는 경우에 처리가 가능
                      where mgr=empno
                      
            OUTER JOIN -> inner join은 null값인 경우, 값이 없는 경우처리 불가능
                       -> 보완
                       -> intersect + minus
                       형식)
                       LEFT OUTER JOIN
                        
                        SELECT A.a, A.b, B.c
                        FROM A,B
                        WHERE A.a=B.a(+)
                        
                        SELECT A.a, A.b, B.c
                        FROM A LEFT (OUTER) JOINB
                        ON A.a=B.a
                       
                       RIGHT OUTER JOIN
                       
                        SELECT A.a, A.b, B.c
                        FROM A,B
                        WHERE A.a(+)=B.a
                        
                        SELECT A.a, A.b, B.c
                        FROM A RIGHT (OUTER) JOINB
                        ON A.a=B.a
            ----------------------------조인(조인은 데이터값을 결합)
            SQL 문장을 연결해서 -> 한번에 수행히 가능하게 만든다 : 서브쿼리
            = 서브쿼리의 종류
            ----------------------------
            1) 단일행 서브쿼리 : 컬럼1, 결과값1
            2) 다중행 서브쿼리 : 컬럼1, 결과값 여러개 -> 10,20,30
              > ANY(10,20,30) = ANY 10
              < ANY(10,20,30) = ANY 30
              > ALL(10,20,30) = ALL 30
              < ALL(10,20,30) = ALL 10
              
            ----------------------------WHERE절 뒤에
            3) 스칼라 서브쿼리 -> SELECT뒤에
            4) 인라인뷰 -> FROM 뒤에 -> ROWNUM
            ----------------------------5) 고급쿼리
            SELECT ~ -> 메인쿼리
            FROM table_name
            WHERE 컬럼 (SELECT~)
                      서브쿼리(1, 여러개)
            서브쿼리에서 결과값을 받아서 메인쿼리로 전송해서 실행하는 방식
            -------- 장점 : 다른 테이블 연결이 가능, DML전체에서 사용이 가능
                           JOIN보다 처리 속도가 빠르다(권장)
                     단점 : SQL문장이 길어진다
                     -> 퍼포먼스가 좋다, 가독성이 약하다
            ------------------------------------------------기본쿼리
            필요한 데이터를 저장한후에 처리 -> 저장공간이 필요 -> 테이블
            DDL 데이터 정의어 -> COMMIT없이 자동 저장, 복구 할 수 없다 -> 백업이 중요함 -> .sql(INSERT), .csv
            ---
            = CREATE : 생성
              => table, view, index, sequence, function, procedure, tirgger
                 단 사용자 계정으로는 권한이 없어서 관리자로 만들어야함
              형식)
                  CREATE TABLE table_name
                  컬럼명 데이터형 [제약조건(여러개 가능)],
                     컬럼생성과 동시에 제약조건이 생성 -> 컬럼레벨
                     not null, default
                  컬럼명 데이터형 [제약조건(여러개 가능)],
                  [제약조건], --> 테이블생성이 종료후 생성 -> 테이블레벨
                     KEY종류
                     PRIMARY KEY : 유일값 (null값 허용하지 않음)
                     CHECK : 지정된 데이터만 출력
                     FOREIGN KEY : 다른 테이블의 값을 참조 -> 조인
                     UNIQUE : 후보키 지정 -> 유일값(null 값을 허용)
                  [제약조건]
                    1. PRIMARY KEY는 기본키(테이블에는 기본키 한개이상 첨부가 가능), 중복, 널값 안됨
                    2. PRIMARY KEY(empno, ename) 가능
                       -> 1,A 
                       -> 2,B
                       -> 2,A
                    -> 사번 2를 삭제할 경우 사원 B,A 도 같이 삭제됨
                       이상현상을 방지(무결성) -> 수정, 삭제(원하지 않는 데이터삭제 방지)
                       
                   1) NOT NULL
                      컬럼명 데이터형 CONSTRAINT 테이블명_컬럼명_NN NOT NULL
                                            ----------- 중복없이 사용
                                                |
                                            권장 -> 제약조건은 변경, 삭제가 많아서 CONSTRAINT에 별칭을 준다는 느낌
                      ALTER TABLE table_name DROP CONSTRATINT 테이블명_컬럼명_nn
                      컬럼명 데이터형 not null -> not null 속성을 제거 할려면 drop후에 다시 테이블 작성해야함
                   2) UNIQUE
                      constraint 테이블명_컬럼명_uk UNIQUE(컬럼명)
                      
                   3) PRIMARY KEY
                      constraint 테이블명_컬럼명_pk PRIMARY KEY(컬럼명)
                      
                   4) FORIEN KEY
                      constraint 테이블명_컬럼명_fk FOREIGN KEY(컬럼명)
                      REFERENCES 참조테이블(참조컬럼)
                      
                   5) CHECK : 라디오 버튼, 콤보 박스
                      CONSTRAINT 테이블명_컬럼명_ck CHECK(컬럼명 IN('A','B','C'))
                      
                   6) DEFAULT
                      컬럼명 데이터형 default 값 -> 날짜(SYSDATE)
                  
            = ALTER : 변경 ------------단 테이블에 값이 있는 경우 사용함
              -> 컬럼을 추가
                 ALTER TALBE table_name ADD column(속성) 데이터형 [제약조건]
              -> 컬럼을 삭제
                 ALTER TALBE table_name DROP COLUMN 컬럼명
              -> 데이터 변경
                 ALTER TALBE table_name MODIFY column(속성) 데이터형 [제약조건]
              -> 제약조건 추가
                 ALTER TALBE table_name ADD 컬럼명 데이터형 CONSTRAINT cons_name_(pk,fk,nn,ck)
                 ALTER TALBE table_name MODIFY 컬럼명 데이터형 CONSTRAINT cons_name_(pk,fk,nn,ck)
              -> 제약조건 삭제
                 ALTER TABLE table_name DROP CONSTRAINT cons_name
              -> 제약조건명 변경
                 ALTER TABLE table_name MODIFY CONSTRAINT old_name TO new_name 
              -> 컬럼명 변경
                 ALTER TABLE table_name MODIFY COLUMN old_name TO new_name
                 
              -> 제약조건 확인 ***
                 SELECT *
                 FROM user_constraints
                 WHERE table_name = '대문자 테이블명'
                 -> user_constraints, user_tables, user_views ...
              
            = DROP : 삭제 (완전삭제 -> 테이블+테이블)
              DROP TABLE table_name
            = RENAME : 이름변경 -> 시노님(별칭) -> 전역
              RENAME old_name TO new_name
            = TRUNCATE : 데이터 잘라내기
              TRUNCATE TABLE table_name
              --------------------------------------ROLLBACK을 사용해서 복구 할 수 없다
              erdcloud.com -> 데이터베이스 스키마 편집 사이트
            복습 page : 145(select형식), 149(연산자 종류), 157(group by 집계함수),
                       161(group by 주의점, 컬럼명과 집계합수 동시사용 불가)
                       162 조인, 169 조인형식
                       170 서브쿼리 173 확인(서브쿼리 실행순서)
                       179 DDL create 형식, 순서
                       180 page : 문자데이터형
                       183 오라클 데이터형
                       184~185 alter : add, modify, drop
                       186 : drop
            --------------------------------
            DML 데이터 조작하는 언어 -> 웹개발자가 자주씀
            -> 형식이 한개씩 있다
            insert(데이터 추가), update, delete
            -> 회원가입         회원수정    회원탈퇴
            -> 단위가 row단위 (한줄추가, 한줄삭제)
                       
               
      
      
     
      
      

*/
public class test14_0519_정리 {

}
