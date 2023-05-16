package Oracle_Memo;
/*
   DQL : select(데이터 추출) -> 검색, 목록, 상세보기
   => select
   1) 형식 -> 문법 순서
   column -> 데이터별 구분(파일 -> |,)
   where 조건문|컬럼명, 함수명, 연산자값
   group by 그룹컬럼명|함수명
   having 그룹조건
   order by 컬럼|함수명(ASC||DESC) -> 올림/내림 -> 정렬
   *** 순서는 셀프웨구해오!! 바뀌면 오류임
   
   --연산순서--
   select  5
   from    1
   where   2
   group   3
   having  4
   order   6
   
   연산자
   = 산술연산자 -> 산술처리(문자열 결합은 하지 않는다 -> ||)
     'A'+1 오류 -> ASCII('A')+1 = 66
     '10'+10 -> TO_NUMBER('10')+10=20
     정수형으로 변경후에 연산
     자동 형변환은 존재, 강제 형변환은 없다(int)(X)
     실수 -> 정수:ROUND() CEIL(), TRUNC()
     사용 위치는 select뒤에서 주로 사용
     통계(column 단위별로 통계가 존재, ROW단위는 x)
     
     비교연산자
     =(같다), <>, ^=, != (같지 않다) => 권장(<>)
     문자열, 날짜도 적용됨
     날짜는 문자열 형식으로 저장되어 있음 'YY/MM/DD'
     
     논리연산자 and / or
     
     데이터 베이스에서만 사용되는 연산자
     not
     null
     in
     between ~ and
     like :검색
     
   3)내장 함수(function 리턴형을 가지고 있다)
     = 오라클에서 지원하는 내장함수 / 사용자 정의 함수
       CREATE FUNCTION function_name() RETURN VARCHAR2(내장함수)
     = 프로시저 리턴형이 없는 함수 
       CREATE PROCEDURE proc_name(매개변수 목록)
     = 내장함수는 주로 사용처 -> select, where group by order by 뒤엥 사용됨
       종류는 암기(라이브러리)
       단일행(ROW단위 처리)
       1. 문자함수
          LENGTH() -> 문자갯수
          LENGTH('oracle') -> 문자갯수 6 -> 비밀번호
          UPPER('oracle') -> ORACLE
          LOWER('ORACLE') -> oracle
          INITCAP('oracle) : Oracle
          
          --형식--
          SELECT column FROM table
          WHERE UPPER(column) LIKE '%UPPER('')%'
          -----------------------명령문은 대소문자 구분을 안함 하지만 실제로 저장된 데이터는 대소문자 구분
          오라클 SQL로 제작, 자바 라이브러리로 처리
                         ---------------웹 개발자 자바로 코딩
          SUBSTR(문자열, 시작번호, 자르는갯수) : 문자열 자르기 = substring()
          ***자바는 시작번호가 0이지만 오라클은 1부터 시작한다
             SUBSTR('ORACLE',1,2) = 'OR'
             substring(1,3) -> 'RA'
          INSTR : 요청한 문자의 번호
          INSTR(문자열, 찾는문자, 시작위치, 몇번째문자)
             INSTR('Hel lo', 'l', 1(-1), 2) = 4번째 'ㅣ'을 갖고온다
                    123 45
                    543 21(-)순서
          indexOf : 앞에서부터 찾기
          lastindexOf : 뒤에서부터 찾기
          TRIM : 특정문자(공백,문자)제거
          TRIM('A' FROM 'ABCDA') = BCD
             LTRIM : 왼쪽
             RTRIM : 오른쪽
             TRIM : 좌우 제거
          LPAD, RPAD : 글자수에 맞게 특수문자 출력
          LPAD(문자열, 출력할 글자수, 문자)
          LPAD('Admin',10,'#') -> #####Admin
          LPAD('Admin',3,'#') -> Adm
          RPAD() - 아이디찾기에 주로 사용 -> Admin#####
          REPLACE : 문자변경
          REPLACE('Hello','l','o') -> Heooo
          CONCAT = ||
          ASCII('A') = 65 |문자를 숫자로 변환
          
       2. 숫자함수 : NUMBER = 정수/실수 = 숫자
          ROUND : 반올림함수 -> ROUND(숫자, 자릿수)
                  ROUND(78.89,1) -> 78.9
          CEIL : 올림
                 CEIL(75.0) -> 75
          
          TRUNC : 버림함수
                  TRUNC(숫자, 자릿수) TRUNC(75.65) =75.0 / TRUNC(75.65, 1) =75.6   
          MOD : 나머지 % MOD(10,2) = 0
          
       3. 날짜함수
          SYSDATE : 시스템 날짜읽기
             -> 숫자형이라 산술연산이 가능하다! -> NEW(SYSDATE+2)
          MONTH_BETWEEN : 기간의 개월수 읽기
             -> MONTH_BETWEEN(현재날짜, 과거날짜)
             -> MONTH_BETWEEN(SYSDATE, '23/01/01') -> 날짜를 문자열 표현
                                       'YY/MM/DD' : 예약일 등록, 배송
                                       
       4. 변환함수
          TO_CHAR -> 날짜변환, 숫자변환
                     -----
                     YYYY/YY, MM/M, DD/D, HH24/ MI/ SS
       5. 기타함수
          NVL : NULL값인 경우에 다른 값을 변경해서 사용하는 함수
                웹에서 한번도 안빠지는 함수 ***
                NULL일경우 오류발생 -> NULL -> ''
                NVL(컬럼(숫자,문자), 대체값)
                        --  --   ----  커럼의 데이터형과 대체값의 데이터형은 일치해야한다 ****              
          DECODE : switch
             DECODE(컬럼명, 값, 출력값,
                          값, 출력값,
                          값, 출력값)
             star ->(1,2,3,4,5) //deptno 10,20,30
             DECODE(star, 1,'★☆☆☆☆',
                          2,'★★☆☆☆',
                          3,'★★★☆☆',
                          4,'★★★★☆',
                          5,'★★★★★')
          CASE : 
             CASE WHEN 속성값 THEN 설정값
                  WHEN 속성값 THEN 설정값
                  WHEN 속성값 THEN 설정값
                  ...
                  END "별칭";
    = 집합함수 (COLUMN 단위처리) 함수
      -> 컬럼명이나 단일행 함수를 같이 사용할 수 없다
      -> 컬럼명이나 단일행 함수를 동시에 사용할라면 반드시 GROUP BY를 사용해야 한다
         MAX(컬럼명) : 최대값(전체 대상)
         MIN(컬럼명) : 최소값
         SUM(컬럼명) : 총합
         AVG(컬럼명) : 평균
         COUNT(컬럼명), COUNT(컬럼명) -> ROW의 갯수
         -----        -----
         NULL 포함      NULL미포함
         
         RANK(컬럼명) : 순위 
         -> RANK() OVER(ORDER BY sal DESC)
            1 2 2 4 동순위 발생시 다음순위 생략
         -> DENSE_RANK() OVER(ORDER BY sal ASC)
            1 2 2 3 동순위 발생시 다음순위 그대로 진행
         
         SUM/AVG -> 장바구니
         -> MAX -> 자동증가번호
         -> COUNT -> 아이디중복체크, 로그인, 검색결과
   3-1) GROUP BY : 같은 속성값끼리 그룹을 묶어서 그룹별 통계
                   ---------- 같은 값을 가지고 있는, 컬럼값, 함수를 이용할 수 있다, 집계(통계)
        주의점 : 집계함수를 이용할때는 단일행 함수, 컬럼명을 사용 할 수 없다, select순서를 잘 기억해야한다
        -----------------------------------------------------------------------------------기초 과정
        
   4) 조인 / 서브쿼리
   
   
 
 
 */




public class test8_0516 {
	public static void main(String[] args) {
		String s="ORACLE";
		System.out.println(s.substring(1,2));
		
	}
}
