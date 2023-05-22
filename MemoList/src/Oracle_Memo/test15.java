package Oracle_Memo;

/*
   2023-05-19 데이터 조작어 DML
   page : 187
   1) INSERT : 데이터 추가
      = INSERT ALL
        데이터를 나눠서 저장할떄 사용하는 방법
      = INSERT : 전체 컬럼값을 등록할때
        -> INSERT INTO table_name VALUES(... 컬럼 순서대로 '값1', '값2') * 무조건 컬럼갯수만큼
      = INSERT : 필요한 데이터만 등록
        -> INSERT INTO table_name(컬럼명, 컬럼명...) values(지정된 컬럼만)
        -> NOT NULL이 있는 경우에는 반드시 첨부
           check, foreign, primary 반드시 첨부
        -> 생략 -> default 경우
    2) UPDATE : 데이터를 수정
       UPDATE table_name SET 컬럼명 = 값, 컬럼명=값
       [where 조건] *******반드시 사용(조건이 없는 경우는 전체 데이터 변경)
       -> 확인 -> 저장/취소 -> commmit/rollback 사용
                           -------------------- 자동으로 수행(자바)
                           try ---> commit
                           catch ---> rollback
                           
    3) delete : 데이터를 삭제 -> row단위 삭제
       DELTE FROM table_name
       [where 조건] *******반드시 사용(조건이 없는 경우는 전체 데이터 삭제)
       -> 확인 -> 저장/취소 -> commmit/rollback 사용
       
       
       select 
       -> 로그인 / 메인목록/ 검색
       insert
       -> 회원가입/ 글쓰기/ 예약/ 구매
       update 
       -> 회원수정 / 수정하기/ 예약변경/ 구매변경
       delete
       -> 회원탈퇴/ 삭제하기/ 예약취소/ 구매취소
       
       요구사항 분석 : 벤치마킹, 기능, 데이터
       데이터 설계 : DDL
       데이터 수집 : INSERT
       사이트 구현 : DML/DQL -> 웹 프로그래머
       테스팅 : 단위 테스팅(Junit)
       배포(발표)
       
       
       -- [질의 3-1] 모든 도서의 이름과 가격을 검색하시오.
SELECT bookname AS 도서명, price "가격" FROM BOOK b

-- [질의 3-2] 모든 도서의 도서번호, 도서이름, 출판사, 가격을 검색하시오.
SELECT bookid, bookname AS 도서명, publisher, price "가격" FROM BOOK b

-- [질의 3-3] 도서 테이블에 있는 모든 출판사를 검색하시오.
SELECT publisher FROM BOOK b 

-- [질의 3-4] 가격이 20,000원 미만인 도서를 검색하시오.
SELECT bookname, price FROM book WHERE price<20000;

-- [질의 3-5] 가격이 10,000원 이상 20,000 이하인 도서를 검색하시오.
SELECT bookname, price FROM book 
WHERE price BETWEEN 10000 AND 20000;

-- [질의 3-6] 출판사가 ‘굿스포츠’ 혹은 ‘대한미디어’ 인 도서를 검색하시오.
SELECT bookname,PUBLISHER  FROM book 
WHERE PUBLISHER ='굿스포츠' OR PUBLISHER ='대한미디어';


-- [질의 3-7] ‘축구의 역사’를 출간한 출판사를 검색하시오.
SELECT bookname, publisher FROM book 
WHERE bookname = '축구의 역사';


-- [질의 3-8] 도서이름에 ‘축구’ 가 포함된 출판사를 검색하시오.
SELECT bookname, price FROM book 
WHERE bookname LIKE '%축구%';

--[질의 3-9] 도서이름의 왼쪽 두 번째 위치에 ‘구’라는 문자열을 갖는 도서를 검색하시오.
SELECT bookname, price FROM book 
WHERE bookname LIKE '_구%' ;

--[질의 3-10] 축구에 관한 도서 중 가격이 20,000원 이상인 도서를 검색하시오.
SELECT bookname, price FROM book 
WHERE bookname LIKE '축구%' AND PRICE >=20000;

--[질의 3-11] 출판사가 ‘굿스포츠’ 혹은 ‘대한미디어’ 인 도서를 검색하시오.
SELECT bookname, PUBLISHER FROM book 
WHERE PUBLISHER ='굿스포츠' OR PUBLISHER ='대한미디어'


--[질의 3-12] 도서를 이름순으로 검색하시오. 
SELECT * from book 
ORDER BY bookname ASC;


--[질의 3-13] 도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 검색하시오.
SELECT * from book 
ORDER BY PRICE ASC, BOOKNAME ;

--[질의 3-14] 도서를 가격의 내림차순으로 검색하시오. 만약 가격이 같다면 출판사의 오름차순으로 출력하시오.
SELECT * from book 
ORDER BY PRICE DESC, publisher ASC;


--[질의 3-15] 고객이 주문한 도서의 총 판매액을 구하시오.
SELECT sum(SALEPRICE) from ORDERS o;

--[질의 3-16] 2번 김연아 고객이 주문한 도서의 총 판매액을 구하시오.
SELECT sum(saleprice) FROM ORDERS o
WHERE custid =2 ;


--[질의 3-17] 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 구하시오.
SELECT sum(SALEPRICE), AVG(SALEPRICE), MIN(SALEPRICE), max(SALEPRICE)
FROM ORDERS o 

--[질의 3-18] 마당서점의 도서 판매 건수를 구하시오.
SELECT count(*) FROM 
WHERE ='마당서점'


--[질의 3-19] 고객별로 주문한 도서의 총 수량과 총 판매액을 구하시오.
SELECT name, count(*),sum(SALEPRICE)
FROM ORDERS o , CUSTOMER c
WHERE o.CUSTID =c.CUSTID 
GROUP BY name;


--[질의 3-20] 가격이 8,000원 이상인 도서를 구매한 고객에 대하여
--고객별 주문 도서의 총 수량을 구하시오. 단, 두 권 이상 구매한 고객만 구하시오.
SELECT name, COUNT(*)
FROM CUSTOMER c , ORDERS o 
WHERE c.CUSTID = o.CUSTID and saleprice >8000 and
(SELECT count(*) FROM ORDERS o2 GROUP BY NAME)>=2
GROUP BY name;


--[질의 3-21] 고객과 고객의 주문에 관한 데이터를 모두 보이시오.
SELECT *
FROM CUSTOMER c , ORDERS o
WHERE c.CUSTID = o.CUSTID
ORDER BY c.custid;


--[질의 3-22] 고객과 고객의 주문에 관한 데이터를 고객별로 정렬하여 보이시오.
SELECT *
FROM CUSTOMER c , ORDERS o
WHERE c.CUSTID = o.CUSTID
ORDER BY name;

--[질의 3-23] 고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오.
SELECT name, saleprice
FROM CUSTOMER c , ORDERS o
WHERE c.CUSTID = o.CUSTID
ORDER BY NAME;

--[질의 3-24] 고객별로 주문한 모든 도서의 총 판매액을 구하고, 고객별로 정렬하시오.
SELECT name, sum(saleprice)
FROM CUSTOMER c , ORDERS o
WHERE c.CUSTID = o.CUSTID
GROUP BY NAME
ORDER BY NAME;


--[질의 3-25] 고객의 이름과 고객이 주문한 도서의 이름을 구하시오. 
SELECT name, bookname, c.custid
FROM CUSTOMER c , ORDERS o, BOOK b 
WHERE c.CUSTID = o.CUSTID AND o.BOOKID = b.BOOKID 
ORDER BY NAME;


--[질의 3-26] 가격이 20,000원인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오.
SELECT name, bookname
FROM ORDERS o , CUSTOMER c, BOOK b
WHERE price =20000 AND c.CUSTID = o.CUSTID AND o.BOOKID = b.BOOKID ;


--[질의 3-27] 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을 구하시오.
SELECT name, saleprice
FROM CUSTOMER c LEFT JOIN ORDERS o
ON c.CUSTID = o.CUSTID
ORDER BY NAME;


--[질의 3-28] 가장 비싼 도서의 이름을 보이시오.
SELECT bookname
FROM book
WHERE PRICE >= MAX(PRICE);


--[질의 3-30] ‘대한미디어’에서 출판한 도서를 구매한 고객의 이름을 보이시오.
SELECT name
FROM CUSTOMER c, BOOK b , ORDERS o 
WHERE c.CUSTID = o.CUSTID AND b.BOOKID = o.BOOKID  AND publisher='대한미디어';


--[질의 3-31] 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.



--[질의 3-32] 도서를 주문하지 않은 고객의 이름을 보이시오. 
SELECT name
FROM ORDERS o, CUSTOMER c 
WHERE c.CUSTID = o.CUSTID;


--[질의 3-33] 주문이 있는 고객의 이름과 주소를 보이시오.


--[질의 3-34] Customer 테이블에서 고객번호가 5인 고객의 주소를 ‘대한민국 부산’으로 변경하시오.


--[질의 3-35] Customer 테이블에서 박세리 고객의 주소를 김연아 고객의 주소로 변경하시오.



--[질의 3-36] Customer 테이블에서 고객번호가 5인 고객을 삭제한 후 결과를 확인하시오.


--[질의 3-37] 모든 고객을 삭제하시오.

      
      
      
 
 */

public class test15 {

}
