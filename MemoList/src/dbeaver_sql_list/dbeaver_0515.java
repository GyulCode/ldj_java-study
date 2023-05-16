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

--사원 정보중에 사원의 모든 정보를 출력 -> 급여가 많은 순으로 출력
--orderby 정렬할 컬럼명(함수명) asc(생략)|DESC 

SELECT * FROM EMP e 
ORDER BY sal DESC;

SELECT * FROM EMP e 
ORDER BY 6;

SELECT * FROM EMP e 
ORDER BY sal asc;

SELECT * FROM EMP e 
ORDER BY 6 DESC, 8 ASC;

--문제 책정보에서 가격을 내림차순으로 같으면 출판사로 오름차순 출력
SELECT * FROM BOOK b 
ORDER BY price DESC, PUBLISHER ASC;

SELECT ename "이름", UPPER(ename)  "대문자", LOWER(ename) "소문자", INITCAP(ename) "이니셜"
FROM EMP e 

--UPPER('문자열') : 대문자
--LOWER('문자열') : 소문자
--INITCAP('문자열') : 첫자만 대문자
--사용빈도는 없음
--length('문자열') : 문자갯수
--lengthb('문자열') : 바이트갯수 ( 한글 3byte)
--영문이나 숫자는 동일, 한글은 갯수와 바이트수가 다르다
--데이터 저장 -> VARCHAR2(10) -> 한글은 3글자만 저장됨

SELECT length('ABCED'),LENGTHb('ABSCE'),length('홍길동'),LENGTHb('홍길동')
FROM DUAL;

--이름 글자수가 5개인 사원의 정보
SELECT * FROM EMP e 
WHERE length(ENAME)=5;

--***RPAD / LPAD RAD
--LPAD('문자열',글자수,'문자');
--LPAD('admin',10,'*'); -> *****admin-----
--admin**** -> 보안(비밀번호->이메일) ((JMALL)

SELECT LPA

D('admin',10,'*'),RPAD('admin',10,'*')
FROM dual;

--substr('문자열',시작번호, 갯수)
--substr(123456789,3,2) 34

SELECT ename, rpad (substart(ename,1,2)), length(ename),'*'
FROM emp

SELECT * FROM emp
WHERE  SUBSTR(hiredate, 1,2) ='81';
WHERE hiredate BETWEEN
--자동 형변환 숫자
--WHERE hirdate BETWEEN '80/101/1'
--               LIKE 
SELECT INSTR('hello oracle','e',1,1) FROM dual;
SELECT INSTR('hello oracle','e',1,2) FROM dual;
--javajava 2번째 있는 e자의 위치번호

SELECT * FROM EMP e 
WHERE ename  LIKE '__O%'

SELECT *
from emp
WHERE instr(ename,'O',1,1)=3;

--concat 문자열1번에 문자열2를 붙여서 출력
SELECT concat('Hello','Oracle') FROM dual;

SELECT 'Hello'||' Oracle' FROM DUAL
--REPLACE('문자열','찾는문자(열)','대체문자(열)')
--REPLACE('URL','&','#')
SELECT ename replace(ename,'A','K')
FROM emp;

--ascii 문자를 숫자로 변환
SELECT ASCII('D')  FROM DUAL;

--trim -> 공백은 기본이고 특정문자를 제거(좌우에만 제거가능)
--ltrim(왼쪽만), rtrim(오른쪽만), trim
SELECT ename,LTRIM(ename,'A'),RTRIM(ename,'K') FROM EMP e ; 

SELECT trim('a' FROM 'aaaaaaaaaHello Java')
FROM DUAL ;
*/

/*
   1. length : 문자 갯수
   2. substr : 문자 자르기
   3. instr : 문자위치
   4. rpad : 빈공간에 원하는 문자 출력
   5. replace : 문자를 대체
   
 */


/*
 * --숫자 관련 함수
    1. ROUND : 반올림
    2. CEIL : 올림
    3. TRUNC : 버림
    4. MOD : 나머지
 */

/*
SELECT ROUND(75.345,2) , Round(75.345,1)
FROM DUAL 

SELECT CEIL(75.345) , CEIL(75.345)
FROM DUAL 

SELECT TRUNc(75.345,2) , TRUNC(75.345,1)
FROM DUAL 
--75.34 , 75.3

SELECT ename, empno FROM EMP e 
WHERE mod(empno,2)=0;

--날짜함수
/*
    ***SYSDATE : 시스템의 시간을 읽어 온다
    -> 날짜 등록을 하지 않는다
    ***MONTHS_BETWEEN : 기간의 개월수를 읽어온다(시간) 소수점
    ADD_MONTHS : 지정된 개월의 날짜 읽기
    NEXT_DAY : 다음날부터 시작해서 다음에 돌아오는 요일은 며칠
    LAST_DAY : 월 지정 -> 지정된 월의 마짐가 날 확인
    ***ROUND, ***TRUNC
 */
/*
SELECT  SYSDATE FROM DUAL;
SELECT SYSDATE -1 "어제다", SYSDATE +1 "오늘" FROM DUAL

SELECT NEXT_DAY(SYSDATE,'월')
FROM DUAL

SELECT LAST_DAY('23/02/01') FROM DUAL

--MONTHS_BETWEEN : 기간의 개월수를 가지고 온다
SELECT ename, hiredate, TRUNC( MONTHS_BETWEEN(sysdate,hiredate)), ROUND(TRUNC((MONTHS_BETWEEN(sysdate,hiredate))/12 ))
FROM emp;

SELECT ADD_MONTHS(sysdate,6) FROM dual

--변환함수
*/
/*
 *  ***to_char : 문자열 변환 -> 숫자, 날짜
 *               decimalFormat
 * -> yy, yyyy(대소문구분이 없다) 년도
 *     m, mm 월
 *     d, dd 월
 *     h, hh 월
 *     h24
 *     mi: 분
 *     ss : 초
 * 숫자 -> 999,999 ->$999,999 -> L999,999
 *  to_number : 
 *  to_date
 */
/*
SELECT ename, dal TO_char(sal, '999,999'),TO_CHAR(sal,'L999,999') 
from emp;

SELECT ename, hiredate, to_char(hiredate,'YYYY/MM/dd HH24:MI:SS')
FROM emp;

1. emp에서 급여가 2000 이상인 사람을 출력하세요.
SELECT * FROM EMP
WHERE sal >=2000;

2. emp에서 급여 sal가 2000 이상인 사람의 이름 ename과 사번 empno을 출력하세요.
SELECT ename, empno FROM EMP
WHERE sal >=2000;


3. emp에서 이름이 'FORD'인 사람의 사번 empno과 급여 sal을 출력하세요
SELECT empno, sal FROM EMP
WHERE ename='FORD';


4. emp에서 입사일자 hiredate가 82년 이후에 입사한 사람의
   이름과 입사일자를 출력하세요.
(날짜를 넣을때는 YY/MM/DD형태를 사용하면된다.)
SELECT ename, hiredate FROM EMP
WHERE hiredate > '82/12/31';

5. emp에서 이름이 J가 들어가는 사원의 이름과 사번을 출력하세요.
SELECT ename, empno FROM EMP
WHERE ename LIKE '%J%';

6. emp에서 이름이 S로 끝나는 사원의 이름과 사번을 출력하세요.
SELECT ename, empno FROM EMP
WHERE ename LIKE '%S';

7. emp에서 이름의 두번째 글자가 A가 들어가는 사원의 이름과 사번을 출력하세요.
SELECT ename, empno FROM EMP
WHERE ename LIKE '_A%';

8. emp에서 보너스가 300이거나 5000이거나 1400인 사람의
    이름, 사번, 보너스를 출력하세요.
SELECT ename, empno, comm FROM EMP
WHERE comm in(300,1400,5000);

9. emp에서 보너스가 500에서 4000 사이의 사원의 이름과 사번, 보너스를 출력하세요.
SELECT ename, empno, comm FROM EMP
WHERE comm BETWEEN 500 AND 4000;

10. emp에서 부서가 10이고 직책이 CLERK인
     직원이름,사번,직책(job),부서(deptno)를 출력하세요.
SELECT ename, empno, job,DEPTNO FROM EMP
WHERE DEPTNO=10 AND job='CLERK';

11. emp에서 입사일자가 82년 이후이거나 직책이 MANAGER인 사람의
     이름과 입사일자를 출력하세요.
SELECT ename, HIREDATE  FROM EMP
WHERE HIREDATE >'82/01/01' OR job='MANAGER'


12. emp에서 부서번호가 10이 아닌 직원의 사번,이름,부서번호를 출력하세요.
SELECT ename, empno, DEPTNO FROM EMP
WHERE DEPTNO =10;


13. emp에서 이름에 A가 없는 직원의 사번과 이름을 출력하세요.
SELECT ename, empno FROM EMP
WHERE ename NOT LIKE '%A%';

14. emp에서 보너스가 500에서 1400이 아닌 직원의 사번과 보너스를 출력하세요.
SELECT empno, comm FROM EMP
WHERE comm NOT BETWEEN 500 AND 1400;


15. emp에서 매니저를 갖지 않은 직원이름을 출력하세요.
-- null값은 is null로 표현한다.
SELECT ename FROM EMP
WHERE job IS NULL OR job<>'MANAGER';

16. emp에서 커미션을 받는(커미션이 null값이 아닌) 직원이름과 커미션을 출력하세요.
SELECT ename, comm FROM EMP
WHERE comm IS NOT NULL AND  comm>1;

17. emp에서 사번, 이름, 급여를 출력하는데 급여가 적은사람부터 출력하세요.
SELECT empno, ename, sal FROM EMP e 
ORDER BY sal asc;

18. emp에서 사번, 이름, 급여를 출력하는데 급여가 많은 사람부터 출력하세요.
SELECT empno, ename, sal FROM EMP e 
ORDER BY sal desc;

19. emp에서 사번, 이름, 급여를 출력하는데 이름이 빠른사람부터 출력하세요.
SELECT empno, ename, sal FROM EMP e 
ORDER BY ENAME asc;

20. emp에서 사번, 이름, 입사일을 출력하는데 입사일자가 최근인 사람부터 출력하세요.
SELECT empno, ename, HIREDATE FROM EMP e 
ORDER BY HIREDATE desc;

21. emp에서 사번, 이름, 급여를 출력하는데 먼저 급여가 많은 순서로
     그리고 이름이 빠른 순서로 정열하세요.
SELECT empno, ename, sal FROM EMP e 
ORDER BY sal DESC, ename ASC;

SELECT ename "이름", job "직업" FROM EMP e 
where job='MANAGER'OR job='SALESMAN'

*/











