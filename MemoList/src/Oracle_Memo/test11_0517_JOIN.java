package Oracle_Memo;
/*
   2023-05-17
   서로 다른 테이블(자기 자신도 있을 수 있음)에서 필요한 데이터를 추출하는 기술
   = 테이블은 관련된 데이터만 모아둔다(테이블이 여러개로 나눠져 있다) -> 정규화
   예) 게시판 / 댓글 / 예매 / 음식정보 등등 -> 조인, 서브쿼리, 뷰
   1.JOIN 종류
     = INNER JOIN
       등가조인(EQUI_JOIN) -> 데이터값이 같은 경우에 사용(컬럼명은 다를 수도 있다)
                           ---------참조키(외래키,FOREIGN KEY)
                           연산자 : =
       비등가 조인(NON_EQUI_JOIN) -> 데이터의 포함여부, 연산자 : =외의 연산자 사용 AND, BETWEEN ~ AND
       자연조인 : 같은 컬럼명을 가지고 있다(JOIN ~USING)
     = SELF조인 (같은테이블에서 작업) -> 반드시 별칭을 줘야한다
     = 주의점 : 테이블에서 같은 컬럼명을 조회할때 -> 구분
              테이블명.컬럼명, 별칭명.컬럼명
              -----------------------애매한 정의
              FROM 테이블명, 테이블명
              FROM 테이블명 별칭, 테이블명 별칭
     = 이차 for문과 동일 -> if(a=b)
       for() -> 왼쪽테이블
       {
          for() -> 오른쪽이블
          {
             if(=) EQUI_JOIN / if(>= && <=) NON-EQUI_JOIN
             
          }
       }
       
     = INNER JOIN 형식
       A:a, b, c
       B:b, d, e
       -> Oracle JOIN
       
       SELECT a, A.b, c, d, e
       FROM A, B
       WHERE A.b = B.b
       -> ANSI JOIN :표준화(MYSQL, MARIADB)
       
       SELECT a, A.b, c, d, e
       FROM A, B
       ON A.b = B.b
     
     ------------------------------------------------
     
     -> 자연 조인
     SELECT a,b,c,d,e 테이블명 구분
     FROM A NATURAL JOIN B
     
     -> JOIN ~ USING
     SELECT a,b,c,d,e
     FROM A JOIN B USING(b)
     
     -> OUTER JOIN(INNER JOIN+NULL값 처리)
     = LEFT [OUTER] JOIN
	   -> oracle JOIN
	   
	      SELECT A.a, A.b, B.a B.c
	      FROM A, B
	      WHERE A.a = B.a(+)
	      
       -> ansi JOIN
       
	      SELECT A.a, A.b, B.a B.c
	      FROM A LEFT[Outer]join B
	      ON A.a = B.a
       
     = RIGHT [OUTER] JOIN
	   -> oracle JOIN
	   
	      SELECT A.a, A.b, B.a B.c
	      FROM A, B
	      WHERE A.a(+) = B.a
	      
       -> ansi JOIN
       
	      SELECT A.a, A.b, B.a B.c
	      FROM A Right[Outer]join B
	      ON A.a = B.a
	      
     = FULL [OUTER] JOIN
 	   -> oracle JOIN
	      
       -> ansi JOIN
       
	      SELECT A.a, A.b, B.a B.c
	      FROM A FULL[Outer]join B
	      ON A.a = B.a     
 
   */

/*
 1. Book (책정보 테이블)
 이름                                      널?      유형
 ----------------------------------------- -------- ----------------------------
 BOOKID                                    NOT NULL NUMBER(2)
 BOOKNAME                                           VARCHAR2(40)
 PUBLISHER                                          VARCHAR2(40)
 PRICE                                              NUMBER(8)
 
 2. CUSTOMER (고객정보 테이블)
 이름                                      널?      유형
 ----------------------------------------- -------- ----------------------------
 CUSTID                                    NOT NULL NUMBER(2)
 NAME                                               VARCHAR2(40)
 ADDRESS                                            VARCHAR2(50)
 PHONE                                              VARCHAR2(20)
 
 3. ORDERS (구매정보 텥이블)
 이름                                      널?      유형
 ----------------------------------------- -------- ----------------------------
 ORDERID                                   NOT NULL NUMBER(2)
 CUSTID    고객정보                                         NUMBER(2)
 BOOKID    책정보 (참조)                                         NUMBER(2)
 SALEPRICE   할인가                                       NUMBER(8)
 ORDERDATE   주문일                                       DATE
 
    고객과 고객이 주문한 데이터를 추출
    요구사항
    고객 테이블 : 고객번호, 이름, 주소, 전화
    구매 테이블 : 책정보, 할인가, 구매일
    
    
 
*/



public class test11_0517_JOIN {

}
