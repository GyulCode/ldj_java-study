package dbeaver_sql_list;
/*
   --2023-05-24 게시판(CURD=브라우저)
CREATE TABLE FREEBOARD2(
  nO NUMBER,
  name varchar2(51) CONSTRAINT fb2_name_nn NOT NULL,
  subject varchar2(4000)CONSTRAINT fb_subject_nn NOT NULL,
  content clob CONSTRAINT fb2_content_nn NOT NULL,
  pwd varchar2(10) CONSTRAINT fb2_pwd_nn NOT NULL,
  regdate DATE DEFAULT sysdate,
  hit NUMBER DEFAULT 0,
  CONSTRAINT fb2_no_pk primary key(no)
);

CREATE SEQUENCE fb_no_seq
START WITH 1
INCREMENT BY 1
nocycle
nocache;

INSERT INTO freeboard2(NO,name,subject,content, pwd)
values(fb_no_seq.nextval,'짱구','첫번째 배우는 CURD','브라우저에서 HTML 을 이용한 출려방법','1234');

SELECT * FROM FREEBOARD2 f ;

--연습 페이지 나누기 -> DESC(최신순)
--rownum
--아래 방법은 11~20을 못갖고옴
SELECT NO, name, subject, regdate, hit, rownum
FROM (SELECT NO, name, subject, regdate, hit
      FROM FREEBOARD2 ORDER BY NO desc)
WHERE rownum BETWEEN 1 AND 10;

--인라인뷰 실무 활용법 -> 면접 100% 이해해둘것 / 페이지 나누는 기법임
SELECT NO, name, subject, regdate, hit, num
FROM (SELECT NO, name, subject, regdate, hit, rownum AS num
      FROM (SELECT NO, name, subject, regdate, hit
            FROM FREEBOARD2 ORDER BY NO desc))
            WHERE num BETWEEN 20 AND 30;
            



SELECT * FROM ALL_CONSTRAINTS ;
DROP TABLE FREEBOARD ;
 
 
 
 */

public class dbeaver_0524 {

}
