package Oracle_Memo;
/*
   2023-05-16
   JOIN / SUBQUERY -> 고급쿼리
   
   1) JOIN
      두개 이상의 테이블에 필요한 데이터 추출하는 명령어(테이블을 나눠서 처리 -> 정규화)
      정규화 : 중복을 제거, 단일값을 설정
      다른 테이블 : JOIN
      같은 테이블 : SELF JOIN
      -------------------- 2차 for -> if
      조인의 종류
        -> INNER JOIN --> 교집합(INTERSECT)
           1) EQUI_JOIN ('='처럼 같은 경우)
              -> Oracle JOIN
                 주의점
                    -> 같은 컬럼명을 사용하는지 확인
                       --------- table명.컬럼명
                       --------- 별칭명.컬럼명
                       별칭 사용은
                       from 테이블명 별칭명 -> from emp e
                    -> 여러개의 테이블 지정 -> from 테이블명, 테이블명
                    -> 중요시 -> NULL값인 경우에는 처리가 불가능  -> 보완(Outer JOIN)
                       조건이 있는 경우에는 반드시 AND
                       자바에서는 조인을 포함클래스라고 한다
                       class emp
                       {
                          Dept d = new Dept()
                       }
                       class dept
                       {
                          
                       }
                    -> INNER JOIN
                       INTERSECT(교집합)
                    -> OUTER JOIN : - INTERSECT
                 SELECT empno, ename, job, hiredate, dname, loc
                        ---------------------------  ----------
                                   emp table             dept table  테이블이 다름
                 FROM emp, dept
                 WHERE emp.deptno = dept.deptno //동일명의 컬럼이라 누구껀지 지정해줘야함
                 
              -> ANSI JOIN(모든 데이터베이스에서 사용이 가능)
                 SELECT empno, ename, job, hiredate, dname, loc
                        ---------------------------  ----------
                                   emp table             dept table  테이블이 다름
                 FROM emp JOIN dept
                 ON emp.deptno = dept.deptno //동일명의 컬럼이라 누구껀지 지정해줘야함
                 
           2) NON_EQUI_JOIN ('='외의 다른 연산자 사용 -> BETWEEN ~ AND)
           ------------------------------------------------------ 다른 컬럼명일떄도 가능(같은 값을 가지고 있다)
           3) NATURAL JOIN (같은 컬럼명이 존재)
           4) JOIN~USING ( 같은 컬럼명이 존재)
           
              ORACLE JOIN
              ANSI JOIN
        -> OUTER JOIN           
   
   
 */
public class test9 {

}
