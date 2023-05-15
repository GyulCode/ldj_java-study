package dbeaver_sql_list;

/*
SELECT '1'+1 FROM EMP;
SELECT '1'+1 FROM DUAL;

SELECT * FROM EMP;
SELECT empno, ename, job, hiredate FROM emp;
--조건에 맞는 데이터만 추출 -> 연산자 사용 -> WHERE
--비교연산자 1.비교(같다) 2. 대입연산자
-- = 같다 -> 149page

SELECT * FROM EMP
WHERE empno=7788;

SELECT * FROM emp
WHERE JOB !='MANAGER';

SELECT * FROM emp
WHERE JOB <>'MANAGER';

SELECT * FROM emp
WHERE JOB ^='MANAGER';

SELECT ename, sal FROM emp
WHERE sal<1500;

SELECT ename, sal, hiredate FROM emp
WHERE sal>2500;

SELECT *
FROM emp
WHERE sal<=3000;

--3000이상 사원정보 
SELECT *
FROM emp
WHERE sal>=3000;

SELECT * FROM BOOK
WHERE price <20000;

--산술연산자
SELECT  100+20, TO_NUMBER('100')+20, 'A'||20
FROM DUAL;
--'100'+20은 속도가 느려서 to_NUMBER르 주로사용

SELECT 10/3
FROM dual;
/*
 * 복합 연산자 and, or
 * and -> 범위, 기간, 포함 / 조건이 모두true true
 * or -> 범위에 없는 경우에 주로 사용 / 조건이 한개이상 true
 * IN
 * 사원정보에서 급여가1500이상 3000이하인 사원의 모든 정보 추출
 * 
 */

/*
--
SELECT * FROM emp
WHERE sal >=1500 AND sal <=3000

SELECT * FROM emp
WHERE sal BETWEEN 1500 AND 3000

--or 두개조건
SELECT * FROM emp
WHERE sal<1500 OR sal>3000

--날짜
--1980년 에 입사한 사원의 모든 정보를 추출
SELECT * FROM EMP
WHERE hiredate>='81/01/01' AND hiredate <='81/7/31';

--IN연산자 -> OR연산이 많은 경우 -> 서브쿼리
--부서번호가 10,20인 사원의 모든 정보를 가지고 온다
SELECT * FROM EMP
WHERE deptno in(10,20); --deptno=10 OR deptno=20;

SELECT * FROM EMP
WHERE deptno in(10,20);

--문제1) 책정보에서 출판사 명이 굿스포츠, 대한미디어
SELECT * FROM BOOK
--WHERE PUBLISHER ='굿스포츠' OR PUBLISHER ='대한미디어';
WHERE PUBLISHER IN('굿스포츠','대한미디어');

--문제2) 사원 정보에서 급여가 2000에서 3000까지의 사원의 모든정보
SELECT * FROM emp
WHERE sal BETWEEN 2000 AND 3000;

--문제3) 책정보에서 가격이 10000~20000인 모든 책정보 가져오기
SELECT * FROM BOOK
WHERE price BETWEEN 10000 AND 20000;

--not 부정(반대)
--사원정보에서 Manager,salesman아닌 모든 정보를 가지고 온다
SELECT * FROM EMP
WHERE job NOT in('MANAGER','SALESMAN');

SELECT * FROM EMP
WHERE hiredate NOT BETWEEN '81/01/01' AND '81/12/31'

--like문장 -> 포함, 시작문자, 끝문자
--검색프로그램 => contains()
--형식 where 컬럼명 Like '패턴' -> '%검색어%'

SELECT * FROM EMP
WHERE ename LIKE 'A%'

SELECT * FROM EMP
WHERE ename LIKE '%N'

SELECT * FROM EMP
WHERE ename LIKE '%B%'

--사원정보에서 3번째 글자가 O인 사원의 모든 정보를 추출
SELECT * FROM EMP
WHERE ename LIKE '__O%';
--데이터베이스는 명령문에서는 대소문자 구분을 안하지만 저장된 데이터는 구분함

--두개이상 검색 -> 사원이름중에 EN/IN을 포함하고 있는 사뤈의 모든 정보
SELECT * FROM EMP e 
WHERE ename LIKE '%EN%' OR ename LIKE '%IN%'

--문제1) 81년도에 입사한 사원의 모든 정보 추출
SELECT * FROM emp
WHERE hiredate LIKE '81%'

--5월에 입사한 사람들
SELECT * FROM emp
WHERE hiredate LIKE '%05%'

--문제 사원 정보에서 사원의 이름중에 A,B,C,K 가 포함된 사원의 모든 정보
SELECT * FROM EMP e 
WHERE ename LIKE '%A%' OR 
ename LIKE '%B%' OR 
ename LIKE '%C%' OR 
ename like '%K%' ;
--조건이 많은 경우에는 패턴을 이용한다

SELECT * FROM EMP e 
WHERE regexp_like(ename,'A|B|C|K');

SELECT * FROM BOOK b 
WHERE bookname LIKE '_구%'

--급여가 1000이상 직위가 clerk인 사람
SELECT * FROM EMP e 
WHERE sal >=1000 AND job='CLERK';

--직위가 사원, 관리자인 사원의 모든정보
SELECT * FROM EMP e 
WHERE job in('CLERK','MANAGER')
--WHERE job='MANAGER' AND job='CLERK';

--사원 정보중에 성과급을 받는 모든 사원의 정보를 가지고온다
SELECT * FROM EMP e
WHERE comm IS NOT NULL AND comm<>0;

--사원정보중 성과급이 없는 사원의 모든정보
SELECT * FROM EMP e 
WHERE comm IS NULL OR comm=0

*/

