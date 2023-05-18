package MyMemo;

/*
 23-05-15
 --study-
1. 11부트usb만들기 -> 노트북 이클립스, 오라클, 디비버 환경 세팅
2. 교재 진도까지 정리 / 응용 -> 알고리즘 풀기 ->  jdk, jvm 정리
3. 깃정리
4. 포폴 네트워크 만들어 두기 (노션 활용)
- 크롤링 및 소켓사용.?!


--개인--
여행 준비 : 면세, 옷, 기념품리스트
개발자 : 목표 및 로드맵 구체화


--세팅법
*오라클 설치
공홈 - kr아님 - xe검색
https://www.oracle.com/database/sqldeveloper/technologies/download/
happy

2444 15552 1330



--Outer Join
/*
 * 
 *  JOIN -> 교집합(INTERSECT)
 *  -> 필요에 의하면 없는 데이터도 추출가능(교집합이 아닌내용을 갖고 올 수 있음) -> OUTER JOIN
 *  -> 
 * 
 * 
 */

SELECT DISTINCT deptno FROM dept
minus
SELECT deptno FROM emp;

SELECT empno, ename, job, e.deptno, dname, loc
FROM EMP e ,DEPT d 
WHERE e.DEPTNO(+) = d.DEPTNO;

SELECT e1.ename "본인", e2.ename "사수"
FROM EMP e1 , EMP e2 
WHERE e1.mgr(+) = e2.empno ;

SELECT e1.ename "본인", e2.ename "사수"
FROM EMP e1 FULL join EMP e2 
ON e1.mgr = e2.empno ;

SELECT  * 
FROM EMP e
WHERE deptno IN (SELECT distinct deptno FROM EMP );

/*
 * 컬럼에 값을 대입
 * 비교연산자 : 값은 1개
 */

SELECT round(avg(sal)) FROM emp;

SELECT ename, sal, hiredate
FROM EMP e 
WHERE sal<2073;

--단일행 서브쿼리
SELECT ename, sal, hiredate
FROM EMP e 
WHERE sal<(SELECT round(avg(sal)) FROM emp);

/*
   테이블 -> 컬럼
   DESC 테이블 -> 컬럼확인 / 컬럼 데이터형
   ------------------------------
   
   1. 사원 이름이 SCOTT인 사원의 사번(empno), 이름(ename), 부서명(danme)을 출력하세요
      
      
   2. 사원 이름과 급여(sal)와 급여등급(grade)를 출력하세요
      -> between 연산자 -> 비동기 조인(NON_EQUI_JOIN) 포함 관계
      SELECT sal, grade
      FROM emp, salgrade
      WHERE sal BETWEEN losal AND hisal;
      
   3. 2번문제에서 부서명을 추가시켜 출력하세요
      SELECT ename, sal, grade, dname
      FROM emp, dept, salgrade
      WHERE emp.deptno = dept.deptno
      AND sal BETWEEN losal AND hisal
      
   4. 사원이름과 매니저의 이름을 아래와 같은 형식으로 출력하세요
      SELECT ename || '의 매니저는 '||e2.ename || '입니다'
      FROM emp e1, emp e2
      WHERE e1.mgr = 2.empno;
   
   5.
   
   6. 보너스 comm을 받는 사원의 이름, 보너스, 부서명
   부서위치를 출력하세요. -> 연산자 처리 -> IS NOT NULL
   SELECT ename, comm, daname, loc
   FROM emp, dept
   where emp.deptno = dept.deptno
   AND comm IS NOT NULL AND comm <>0;
   
   7.DALLAS에서 근무하는 사원들의 이름, 직급, 부서번호, 부서명을 출력하세요
   
   
   8. 이름에 'A'가 들어가는 사원들의 이름과 부서명을 출력하세요
   SELECT ename ,dept
   WHERE emp.deptno =dept.deptno
   AND ename LIKE '%A%'
   
   view/ index / sequence/ PL / SQL
   MVC
   
    서브쿼리(메인쿼리, 서브쿼리) -> SQL문장을 여러개 모아서 한번에 처리
    
    1. 서브쿼리 -> SELECT문장
       -> 결과값 데이터를 몇개인가
          1) 컬럼 1, 결과 1
          2) 컬럼 1, 결과 여러개
          3) 컬럼이 여러개 , 결과도 여러개
             다중컬럼 서브쿼리
          4) 연관컬럼 서브쿼리
          
 */
--요구사항 Book 테이블에서 가장 비싼책의 이름, 출판사, 가격
SELECT *
FROM BOOK b 
WHERE price =35000;

--미리 연결한 다음에 연결된 Conncection을 사용 DBCP
SELECT bookname, publisher, PRICE  
FROM BOOK b 
WHEre price = (SELECT max(price) FROM BOOK b);

--scott의 정보를 출력 : 사번, 이름,직위, 입사일, 근무지, 부서명
--1. join
--2. 서브쿼리 -> 사용
/*
 *    급여가 가장 많이 받는 사원중에 같은 부서에 근무하는 모든 사원 정보
 *    1. 급여가 가장 많은 사원
 *       SELECT MAX(sal) FROM emp;
 *    2. 찾는 사원의 부서번호
 *       SELECT MAX(sal), deptno FROM emp;
 *       WHERE sal >= MAX(sal)
 *    3. 같은 부서에서 근무자를 찾는다
 *       SELECT * FROM emp WHERE deptno = 10;
 */      
SELECT *
FROM EMP e 
WHERE deptno = (SELECT deptno FROM emp WHERE sal=(SELECT max(SAL) FROM emp));

--KING 이라는 사원과 동일한 부서에서 근무하는 사원의 모든 정보를 추출
SELECT *
FROM EMP e 
WHERE DEPTNO = (SELECT deptno FROM emp WHERE ename='KING');

--SCOTT사원의 부서명과 근무지를 출력
SELECT DNAME, LOC
FROM DEPT d 
WHERE deptno = (SELECT deptno FROM emp WHERE ENAME ='SCOTT');

--T자가 들어가는 사원과 같은 부서에서 근무하는 사원의 정보를 추출
SELECT *
FROM EMP e 
WHERE deptno In (SELECT DISTINCT deptno FROM emp WHERE ename LIKE '%T%');

--부서위치loc가 DALLAS인 모든 사원의 이름, 부서번호를 출력하세요
SELECT ENAME, DEPTNO
FROM EMP e
WHERE deptno = (SELECT DISTINCT deptno FROM dept WHERE loc LIKE 'DALLAS');

SELECT *
FROM dept

--SALES 부서의 모든 사원의 이름과 급여를 출력하세요
SELECT ENAME, SAL, DEPTNO 
FROM EMP e
WHERE DEPTNO = (SELECT DEPTNO  FROM dept WHERE dname = 'SALES');


SELECT *
FROM EMP e 
--자바에서 결과값을 다 소모했다고 알려줌 -> 오류는 where에서 찾아야함
WHERE deptno < any(SELECT DISTINCT deptno FROM EMP);
--deptno < 30
SELECT *
FROM EMP e 
WHERE deptno > any(SELECT DISTINCT deptno FROM EMP);
--deptno > 10


SELECT *
FROM EMP e 
--자바에서 결과값을 다 소모했다고 알려줌 -> 오류는 where에서 찾아야함
WHERE deptno < SOME (SELECT DISTINCT deptno FROM EMP);
--deptno < 30
SELECT *
FROM EMP e 
WHERE deptno > SOME (SELECT DISTINCT deptno FROM EMP);
--deptno > 10


SELECT *
FROM EMP e 
WHERE deptno < ALL(SELECT DISTINCT deptno FROM EMP);
--deptno < 10 10보다 작은게 없어서 출력x
SELECT *
FROM EMP e 
WHERE deptno > ALL (SELECT DISTINCT deptno FROM EMP);
--deptno > 30

SELECT *
FROM EMP e 
WHERE deptno > (SELECT MIN(deptno) FROM EMP e2);

SELECT *
FROM ORDERS o

--1. 가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오..??
SELECT NAME, bookname, price
FROM CUSTOMER c, BOOK b, ORDERS o  
WHERE c.CUSTID =o.CUSTID AND o.BOOKID = b.BOOKID  AND price = 20000;

SELECT name, bookname, price
FROM CUSTOMER c, BOOK b 
WHERE c.CUSTID = (SELECT CUSTID FROM ORDERS o WHERE bookid IN (SELECT bookid FROM book WHERE price = 20000));

--2.도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을 구하시오
SELECT name, saleprice
FROM CUSTOMER c LEFT join ORDERS o 
ON c.CUSTID =o.CUSTID;

--3.가장 비싼 도서의 이름을 보이시오
SELECT BOOKNAME,price
FROM BOOK b 
WHERE price =(SELECT MAX(price) FROM BOOK b2 );

--4.대한 미디어에서 출판한 도서를 구매한 고객의 이름을 보이시오
SELECT name
FROM CUSTOMER c 
WHERE CUSTID IN (SELECT custid FROM ORDERS WHERE bookid IN ( SELECT bookid FROM book WHERE publisher='대한미디어'));

--5. 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오..??
SELECT *
FROM BOOK b ;

SELECT BOOKNAME, PUBLISHER  
FROM BOOK b1
WHERE price >(SELECT avg(b2.price) FROM BOOK b2 WHERE b1.PUBLISHER = b2.PUBLISHER);

SELECT bookname, PUBLISHER 
FROM BOOK b 
WHERE price IN (SELECT AVG(PRICE) FROM BOOK b2  GROUP BY PUBLISHER);


--6. 도서를 주문하지 않은 고객의 이름을 보이시오
SELECT name
FROM CUSTOMER c
WHERE CUSTID NOT in(SELECT custid FROM ORDERS);










      


*/
