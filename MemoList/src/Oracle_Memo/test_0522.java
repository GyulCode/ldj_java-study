package Oracle_Memo;
/*
    rownum / 서브쿼리 / view
    1. rownum : 오라클에서 지원하는 가상 컬럼
                row마다 번호를 순차적으로 설정함 --> insert된 순서로 지정
       사용처 : TOP-N 인기순위 10개, 최신수 10개..., 게시판 이전 다음 내용보기
              페이징 기법 
    --222page
SELECT empno, ename, job, hiredate, sal, rownum
FROM emp;

SELECT empno, ename, job, hiredate, SAL, rownum
FROM emp
WHERE rownum <=5;
--문제가 rownum은 위에서 부터 자른다(-> 응용인라인뷰)
--급여가 많은 순으로 5명만 출력한다

SELECT *
FROM EMP e ORDER BY sal DESC;

SELECT empno, ename, job, hiredate, sal, rownum
FROM EMP e
WHERE rownum <=5
ORDER BY sal DESC;
--> 이러면 rownum으로 잘려와서 3000이 안나옴

SELECT empno, ename, job, hiredate, sal, rownum
FROM (SELECT empno, ename, job, hiredate, sal, rownum
      FROM EMP 
      ORDER BY sal desc)
WHERE rownum <=5;
-- 중간에 자를 수 없다 -> 위에서 top-n
-- 인라인 뷰 (테이블 대신 select를 이용하는 프로그램)
-- 테이블 대신 사용하는 select의 컬럼만 사용이 가능 즉 -> select, from에 같은 컬럼이 있어야한다.

--224page
/*
  서브쿼리 : SQL문장 두개이상을 모아서 한개의 SQL문장으로 제작
  자바에서는 가급적이면 sql문을 한번만 수행하는 것이 좋다
  = 다른 테이블에서 데이터 추출하고 싶은 경우
    ---------
    JOIN / SubQuery를 선택한다
    = 데이터가 많은 경우 (JOIN/SubQuery가 성능이 좋다)
    = 퍼포먼스(속도)
    = subquery
      main = subquery
      subquery로부터 값을 받아서 mainquery에 전송후 처리
    = 종류
      where절 뒤에 설정  : 서브쿼리
         = 단일행 서브쿼리
         = 다중행 서브쿼리
      select절 뒤에 : 스칼라
      from 절 뒤에 : 인라인뷰
      ------------------ 서브쿼리는 데이터 검색 select
      -> 사용위치 : join(select에서만 서용이 가능)
               : Sbuquery(insert, update, delete)
               형식은 (select만 사용한다)
               insert ~values((select~))
               update ~set
               name = (select~)
      중첩 질의 -> 다중행 서브쿼리
        : 서브쿼리의 실행된 결과값이 여러개인 경우
        IN / ANY / ALL
        ---------------
        연산자
           비교연산자 : <, >, <= >=, = 
           집합 : IN , NOT IN
           한정 : ALL / SOME = ANY
           
  
  */

SELECT ORDERID , saleprice
FROM ORDERS o
WHERE saleprice <= (SELECT avg(SALEPRICE) from ORDERS o2);

--v평균 주문금액ㅂ돠 큰 금액의 주문내역에 대한 부눕너호, 고객번호, 그맹ㄱ
SELECT orderid, custid, saleprice
FROM ORDERS o 
WHERE SALEPRICE >= (SELECT avg(SALEPRICE) FROM ORDERS o2);

--비교 연산자는 결과값이 1개 , 여러개일때는 in , notin
SELECT CUSTID,sum(saleprice) "도서총액"
FROM ORDERS o 
WHERE custid >= ANY (SELECT custid FROM CUSTOMER c WHERE address LIKE '%대한민국%')
GROUP BY CUSTID ;

--가장 많이 사용되는 연산자 IN()을 주로 사용한다
--max(), MIN()
--230 page : 스칼라, 서브쿼리
--join대신 사용, select (select) 그래서 join보다 문장의 길이가 길다 -> 속도 최적화
--emp, dept 두개를 갖고온다
--1. join
SELECT empno, ename, job, hiredate, sal, dname, LOC
FROM emp, dept
WHERE emp.DEPTNO  = dept.DEPTNO ;

--2. 스칼라 서브쿼리
SELECT empno, ename, job, hiredate, sal,
(SELECT dname FROM dept WHERE dept.DEPTNO=emp.DEPTNO ) "dname",
(SELECT loc FROM dept WHERE dept.DEPTNO =emp.DEPTNO ) "loc" --서브쿼리는 문장이 길어서 별칭 주로 사용
FROM emp;
--스칼라 서브쿼리는 별칭, 반드시 별과값이 1개만 존재해야한다
--컬럼 대신 사용

SELECT empno, ename, job, hiredate, sal, dname, loc, grade
FROM emp, dept, SALGRADE s
WHERE emp.DEPTNO = dept.DEPTNO
AND sal BETWEEN losal AND hisal;

--서브 쿼리 사용
SELECT empno, ename, job, hiredate, sal,
       (SELECT dname FROM dept WHERE emp.DEPTNO = dept.DEPTNO) "dname",
       (SELECT loc FROM dept WHERE emp.DEPTNO = dept.DEPTNO) "loc",
       (SELECT grade FROM SALGRADE s WHERE sal BETWEEN losal AND hisal) "grade"
FROM emp;

/*
   인라인뷰 -> 테이블 대신 사용
   -구조-
   select
   from(select)
   서브쿼리에 있는 컬럼만 사용가능
   메모리에 select를 통해서 실행된 데이터만 참조가능
   인라인뷰는 top-n (자르기가 가능 -> 처움부터 ~)
   주로 사용은 페이징
   **보안이 뛰어나고 실무에서도 많이 사용된느 기술임
 */
SELECT empno, ename, sal, hiredate, job
FROM emp;

SELECT empno, ename, sal, hiredate, job
FROM (SELECT empno, ename, sal, hiredate, job FROM EMP);

/*
   rownum은 오라클에서 insert마다 지정해서 고유번호를 가지고 있다
   데이터를 변경하기 위해서 주로 사용한다
   단점은 항상 위에서 부터 몇개만 가져올수 있다는거다 TOP-N
   페이징 -> rownum -> 인라인뷰를 이용한 페이징
   drop table student;
 */
CREATE TABLE student(
  hakbun NUMBER,
  name varchar2(51) CONSTRAINT std_name_nn NOT NULL,
  kor number(3) DEFAULT 0,
  eng number(3) DEFAULT 0,
  math number(3) DEFAULT 0,
  CONSTRAINT std_hak_pk PRIMARY KEY(hakbun)
);

INSERT INTO student values((SELECT nvl(max(hakbun)+1,1)FROM STUDENT),'흰둥이',89,78,67);
INSERT INTO student values((SELECT nvl(max(hakbun)+1,1)FROM STUDENT),'짱구',80,70,60);
INSERT INTO student values((SELECT nvl(max(hakbun)+1,1)FROM STUDENT),'맹구',56,78,59);
INSERT INTO student values((SELECT nvl(max(hakbun)+1,1)FROM STUDENT),'유리',86,76,64);
INSERT INTO student values((SELECT nvl(max(hakbun)+1,1)FROM STUDENT),'훈이',66,77,88);

COMMIT;
SELECT * FROM STUDENT;
SELECT student.*, rownum FROM student;

--사원 3명
SELECT hakbun,name, kor, eng, math,(kor+eng+math) "total",round((kor+eng+math)/3,2) "avg",
       rank() over(ORDER BY (kor+eng+math) DESC) "rank",
       rownum
FROM (SELECT hakbun, name, kor, eng, math FROM student ORDER BY (kor+eng+math) DESC);
WHERE rownum<=3;

--인라인뷰를 이용하면 rownum순서를 변경이 가능
-- 메인페이지 뉴스 10개 등등 제약
-- 이전 상세, 

-------------------------------------------------------------
/*
   system계정으로 설정
   -> hr이 view를 생성할 수 있도록 권한을 줘야함
   conn systme/happy //system 계정 로그인
   GRANT CREATE VIEW TO hr;
   REVOKE CREATE VIEW FROM hr;
   
   VIEW : 테이블의 일종(가상테이블) 
          1. 저장이 안됨, 보안성이 좋다, 복잡한 SQL문장을 단순화
          2. 읽기전용
          3. 반드시 존재하는 테이블을 참조해야한다
          4. 사용은 일반 테이블과 동일 하게 사용
   1. 단순뷰 : 한개의 테이블 참조
   2. 복하뷰 : 여러개의 테이블 참조
   3. 인라인 뷰 : 테이블 대신 사용 //from절에 사용하는거
   
   WITH CHECK OPTION : 수정, 삭제, 추가
    -> default
    -> 
   READ ONLY OPTION : select 문장만 사용이 가능
   형식
   CREATE [OR REPLACE] VIEW view_name
   AS SELECT~
   -> SELECT 하위에 테이블에서 자료를 갖고옴
   -> CREATE VIEW 변경시에는 삭제후 다시 제작
   CREATE OR REPLACE VIEW -> 변경시에 그냥 변경
   수정과 동시에 생성
   
   뷰 : 235page -> 뷰는 하나 이상의 테이블을 합하여 만든 가상의 테이블
   뷰는 이런한 결과를 가상의 테이블로 정의하여 실제 테이블처럼 사용하는 데이터베이스 개체이다
   편리하다, 보안이 뛰어나다, 독립적이다
   
   
 */

DROP VIEW student_view;

CREATE VIEW student_view
AS 
   SELECT * FROM student
   WITH READ ONLY; --//아래와 같은 테이블 변경을 막기위해 사용 (읽기 전용)
  -- 단순뷰, 


SELECT * FROM student;
SELECT * FROM STUDENT_VIEW;
INSERT INTO student_view values(6,'원장쌤',90,89,78);
COMMIT;
-- **이때 가장큰 주의점 view가 변경되는게 아니라 원본 테이블이 변경된다

SELECT * FROM USER_VIEWS
WHERE VIEW_NAME='student_view';

--편리성 
CREATE VIEW eds_view
AS
  SELECT empno.*, loc, salgrade.*
  FROM emp e, dept d, SALGRADE s 
  WHERE e.DEPTNO = d.DEPTNO 
  AND sal BETWEEN losal AND hisal;

SELECT * FROM eds_view;
SELECT * FROM USER_VIEWS
WHERE view_name = 'eds_view';

DROP VIEW eds_view;

/*
   뷰 수정/생성 명령문
   CREAT VIEW view_name
   
   CREATE OR REPLACE[] view view_name
   as
     SELECT~
   조인 / subqeury 반복적으로 수행
   view sql문장을 저장한 후에 
 */
CREATE OR REPLACE VIEW emp_dept_view
AS
  SELECT empno, ename, job, sal, hiredate, dname, LOC
  FROM emp, DEPT
  WHERE emp.DEPTNO = dept.DEPTNO;
  AND emp.deptno=10 OR emp.DEPTNO=20;
 --***뷰의 특징중 하나는 오버 라이딩이 된다는 것이다!! 드롭할 필요가 없이 새로 선언헤 덮어서 쓰면 된다.
 
 SELECT * FROM emp_dept_view;

--삭제
DROP VIEW EMP_DEPT_VIEW;

-- select 문장을 저장한후에 재사용 -> view 복잡한(sql)
-- 자동 증가 번호 nvl(max(no)+1, 1)
-- 자동 증가 번호 오라클 : mysql -> no int auto_increment
--ALL_SEQUENCES
/*
   START WITH -> 시작1
   INCREMENT BY : 증가
   NOCACHE : 미리 저장없이 사용(20저장)
   NOCYCLE : 최대값까지 가면 다시 처음부터 -> 제외
   MAX-VALUE : 최댇값
   Min-VALUE : 최소값
   ----------------- 사용하지 않고 무한대
   ----------------- 생성시에 사용
   currVal, nextVal
   현재값 읽기, 증가값 읽기
 */
DROP TABLE MEMBER_TEST;

SELECT *
FROM user_constraints;

CREATE TABLE member2(
   NO NUMBER,
   name varchar2(51) CONSTRAINT mem_name_nn NOT NULL,
   sex varchar2(6),
   age number,
   address varchar2(100) CONSTRAINT mem_address_nn NOT NULL,
   tel varchar2(13) CONSTRAINT mem_tel_nn NOT NULL,
   CONSTRAINT mem_no_pk PRIMARY key(no),
   CONSTRAINT mem_sex_ck CHECK (sex IN('남','여')),
   CONSTRAINT mem_age_ck CHECK (age>10),
   CONSTRAINT mem_tel_uk UNIQUE (tel) --후보키 no모를때 대신 사용
);

--시퀀스 생성
CREATE SEQUENCE member2_no_seq
START WITH 1 --시작번호
INCREMENT BY 1 -- 증가번호
nocycle -- 다시처음부터 시작이 안되게
nocache; -- 미리 저장하지 않고 사용한다 20개가 저장은 기본됨-- 뭔소리?

--데이터 삭제
TRUNCATE TABLE member2;

--데이터 삽입
INSERT INTO MEMBER2 values(
   member2_no_seq.nextval,--오류 발생은 아래애ㅔ서 해서 번호가 건너뛰어짐
   '홍길동','남',25,'서울','010-4444-4444'
);
--데이터 검색
SELECT * FROM member2;
--시퀀스 삭제
DROP SEQUENCE member2_no_seq;

-------------------------------------------------총정리
/*
   html/css
   javascript, jquery(ajax), sjp, mvc,
   spring - boot,security,cloud,
   aws
   -------------
   -> mybatis/ jpa / vuejs/ reactjs -> vuex/redux --필수
   msa-> 분산처리 -> 도커, 쿠바네티스, 젠킨스(추세)
   
   객체 생성 : table, view, sequence, index, PL/SQL
   1. table : 데이터를 메모리에 저장하는 장소
   2. view : 재사용 하기 위한 sql문장 저장 장소
   3. sequence : 자동 증가번호(********) ->테이블 하나 시퀀스 하나
      -> primary key 기본키(대부분이 숫자)
   4. index : 검색 속도 향상 (b-tree)
   5. pl/sql : 함수 (재사용) -> 댓글, 보안
      table
      = 데이터형
      = 형식
      = 제약조건
      view 
      -> 복잡한 쿼리문장을 만들어서 저장 -> 편리성, 재사용
         데이터를 저장한것이 아니라서 보안성이 뛰어나다, 독립적으로 사용 가능
         dml(insert, update, delete)를 사용하면 테이블에 영향을 미친다
         = with read only 제약을 주어서 수정을 제한한다
         종류
         -> 단순뷰, 복하뷰, 인라인뷰( from 절에 테이블 대신 select문)
         형식
         -> 생성+수정
            create or replace view view_name
            as 
               select~
            삭제
            drop view view_name
         -> view의 값을 확인
            select text from user_views
            where view_name = '대문자 view이름';
         -> 제약 조건 user_constraints
            테이블 user_tables
            인덱스 user_indexs
            프로시저 user_procedures
            ----- 사용자가 만든 모든 내용 저장
                  user
         -> sequence : 자동 증가번호
         1) 형식
            create sequence seq_name
            start with 1
            increment 1
            nocycle
            nocache
         2) 값 읽기
            currVal(현재값), nextVal(증가된 값)
            
         
   
 */
DROP SEQUENCE test_seq;
CREATE SEQUENCE test_seq
START WITH 1
INCREMENT BY 1
nocache
CYCLE --값 중복될ㄷ 수 있음
MAXVALUE 10
MINVALUE 1;
--test_seq.nextval insert 문장에서 주로 사용
--select nvl(max(no)+1,1)

SELECT test_seq.nextVal from dual;
SELECT test_seq.currVal from dual;
--sequence -> 테이블명_(증가할 컬럼명)_seq
--rownum : 데이터 insert시마다 오라클 자동으로저장하는 row의 번호
--가상컬럼 -> 필요시마다 사용이 가능
--rownum -> 1번부터 순차적 (빠지는 번호는 없다)

SELECT student.*,rownum
FROM student;
DELETE FROM STUDENT
WHERE hakbun=5;
--rownum은 데이터가 삭제되어도 번호를 앞당겨서 정리해줌















          
              
              
 
    
    
    
    
 */
public class test_0522 {

}
