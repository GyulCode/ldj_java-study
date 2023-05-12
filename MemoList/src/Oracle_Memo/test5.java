package Oracle_Memo;

/*
--2023-05-12  //1,2장 기본설명 3장 구체화
SQL기초 (명령문으로 제어)
DML -> 데이터 조작언어
****=Select : 데이터 검색
= insert : 데이터 추가
= update : 데이터 수정
= delete : 데이터 삭제

데이터 검색
select
1) 형식
   SELECT [DISTINCT] 전체데이터 (*) | 필요한 컬럼만 설정(컬럼리스트)
          ----------------------------------------------
          데이터 설정(데이터 읽기)
   FROM 테이블명|VIEW|SELECT~(인라인뷰)
   -----------------------------------------------------필수조건
   [
      WHERE 조건문(연산자)
      GROUP BY 컬럼|함수 ==> 그룹별 처리
      HAVING 그룹컬러명(그룹에 대한 조건)
      ORDER BY 컬럼 ASC|DESC -> 정렬
   ]
2) 연산자
3) 내장함수
4) 조인
5) 서브쿼리
------------ 다음주 금요일
SQL문장 사용시 주의점
= 문장이 종료하면 ';'을 종료 -> 자바에서 오라클로 SQL 문장 정송시에 ;을 붙이면 오류 / 자바에서는 ;을 포함하고 있다
= 추가, 수정, 삭제 COMMIT을 사용한다 => 자바에서는 AUTOCOMMIT 
= 공백사용 부분
= 컬럼명, 테이블명이 틀리면 오류 발생
= 키워드를 대문자로 사용(대문자 뒤는 공백 사용)
= 문자나 날짜는 반드시 ''안에 서술한다 ("" => 인용부호로만 사용 => '')
예)
   WHERE ename ='KING'
   WHERE ename =KING -> 오류발생
   WHERE ename ='king' -> 대소문자 구분
   WHERE hirdate ='23/01/01' -> YY/MM/DD
   
   숫자는 그냥 사용한다
   WHERE ename =7788
   WHERE ename ='7788' -> ***정상수행은 하는데 정수형으로 자동 형변환후에 처리되어서 속도가 느려짐
   
   기본은 SQL문장은 대소문자를 구분하지 않는다
   (권장)SELECT* FROM emp; = select * from emp;
   sql에서 사용되는 기호
      || -> 문자열 결합
      & -> Scanner

1. 별칭
   SELECT 컬럼명 "별칭"
          컬럼명 AS 별칭
2. 중복없는 데이터 추출 : DISTINCT 컬러명
3. 문자열 결합 : ||          
---------------------------------
BOOK 테이블 : 책한권의 데이터가 4개로 만들어져 있다
BOOKID            NOT NULL NUMBER(2) -> 중복이 없는 데이터(숫자)
-> 책구분자
BOOKNAME          VARCHAR2(40) -> 문자열
-> 책이름
Publisher         VARCHAR2(40) -> 문자열
-> 출판사
PRICE             NUMBER(8) -> 숫자
-> 책 가격
산술연산자 : -> WHERE문장에서 사용보다는 SELECT에서 주로 사용
         +,-,*,/ (%=MOD())
         산술만 가능 : 'A'+1  'A'||1
         나누기 : 0나누기 불가, 정수/정수 -> 실수
비교연산자 : =(같다)
         !=(같지않다), <>(권장), ^=
         <,>, <=, >=
         -----------------------문자열, 날짜도 적용
         day => '23/05/11' AND '23/05/15'
논리 연산자 : AND, OR
          AND : 범위, 기간 포함
          OR : 포함이 안된 상태
          부서번호가 10이거나 20이거나 30에 있는 사원 정보 출력
          WHERE deptno=10 OR deptno=20 OR deptno=30
          WHERE deptno IN(10,20,30)
          WHERE deptno>=10 AND deptno<=30 
          WHERE deptno BETWEEN 10 AND 30

데이터베이스에서 사용하는 연산자
between ~ AND : 포함(범위,기간) >= AND <=
=> NONEQUI_JOIN, 페이지 나누기
IN : OR가 많은 경우에 주로 사용 -> VIEW(다중VIEW)
NOT : 부정연산자
      WHERE NOT (deptno>=10 AND deptno<=30) => 자바(!)
      WHERE deptno NOT BETWEEN 10 AND 30
      WHERE deptno NOT IN (10,20,30)
      NOT LIKE
      예약이 아닌날... 등록이 안된 사람

LIKE : 문자열 검색
   startsWith
      WHERE title LIKE 'A%'
   endsWith
      WHERE title LIKE '&A'
   contains
      WHERE title LIKE '&A%'
      
      *** 자바 : WHERE title LIKE '%'||A||'%'
      *** 오라클 : WHERE title LIKE CONCAT('%','A','%') -> MySQL
      최근에 바뀜
      WHERE REGEXP_LIKE(title,'A|B|C|D')
      
      만약
      WHERE title LIKE '&A%' OR
      title LIKE '&B%' OR
      title LIKE '&C%'
      WHERE REGEXP_LIKE(title,'A|B|C')
      WHERE REGEXP_LIKE(title,'[A-Z]')
      
      표현법
      _ : 한글자
      %:문자갯수가 지정이 없는 상태
      WHERE ename LIKE '_ _ _G' => KING // 반드시 총 4글자에서 마지막이 G인거 갖고옴
      WHERE ename LIKE '_G_' => 총 3글자중 가운데에 G가들어가는걸 갖고옴
      
NULL : 값이 없는 상태 -> 연산처리르 할 수 없다
       1+null = null
       0은 값이 존재하는 상태 , null은 값 자체가 없는 상태 
       null값인 경우
       null값이 아닌 경우 -> is not null
       
       ***문자열이나 날짜 비교시에 비교연산자를 사용한다
       WHERE ename='KING';
       WHERE ename > 'KING'; -> K다음 알파벳인 L부터 갖고온다.
       
       select ename from emp WHERE ename > 'KING'

*/

