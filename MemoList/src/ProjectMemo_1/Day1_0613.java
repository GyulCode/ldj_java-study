package ProjectMemo_1;

public class Day1_0613 {

}
/*
--데이터베이스 모델링
// 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

  1. 요구사항 분석: 결과물(요구사항 명세서) -> 수정(추가, 수정, 삭제)
  2. 개념적 설계 : 결과물(E-R)다이어그램 유스케이스 다이어그램
     -> 기능 추출, 기능에 필요한 데이터 베이스 추출
     망플
        카테고리
           제목
           부제목
           이미지
        맛집수집
           이미지 5개
           맛집명, 평점
           주소, 전화, 종류, 주차 등...
           기본은 원자값을 가지고 있다(컬럼)
                 한개의 값 -> 분리(정규화)
    
  3. 논리적 설계 : 결과물(릴레이션 스키마) -> 테이블
  
  4. 물리적 설계 : 데이터형을 결정
  5. 구현 : 테이블 생성완료
  
  개념적 설계 : 
  이메일 -> 중복체크
  ------
  우편번호
  주소
  ------open api(다음)
  상세주소
  전화번호 -> 중복체크
  소개 -> 추천
  관리자/사용자 구분 메뉴만 변경
  로그인, 로그아웃, 탈퇴, 수정, 아이디 or 비밀번호 찾기
  
  회원(아이디 중복체크)PK, 우편번호 검색, (이메일 중복체크, 전화번호 중복체크)UK(대체키)
  
  
  


--크로링 할 데이터베이스
--논리적 -> 물리적

create table project_food_category(
cno number,
title VARCHAR2(100) constraint pc_title_nn not null,
subject varchar2(100) constraint pc_subject_nn not null,
poster varchar2(260) constraint pc_title not null,
link varchar2(200) constraint pc_link not null,
constraint pc_cno_pk primary key(cno) 
);

create sequence pc_cno_seq
  start with 1
  increment by 1
  nocache
  nocycle;
  
create table project_food_info(
fno number,
cno number,
poster varchar2(100) CONSTRAINT pi_poster_nn not null,
name varchar2(100) CONSTRAINT pi_name_nn not null,
score number(2,1)CONSTRAINT pi_score_nn not null,
address varchar2(250) CONSTRAINT pi_address_nn not null,
tel varchar2(20)CONSTRAINT pi_tel_nn not null,
type varchar2(100)CONSTRAINT pi_type_nn not null,
price varchar2(100),
parking varchar2(50),
time varchar2(100),
menu varchar2(4000),
good number,
soso number,
bad number,
jjim_count number default 0, --triger
like_count number default 0, --triger
hit number default 0,
constraint pi_fno_pk primary key(fno),
constraint pf_cno_fk foreign key(cno)
references project_food_category(cno)
);
drop table project_food_info;

create table project_food_location_info(
fno number,
poster varchar2(100) CONSTRAINT pl_poster_nn not null,
name nvarchar2(100) CONSTRAINT pl_name_nn not null,
score number(2,1) CONSTRAINT pl_score_nn not null,
address varchar2(250) CONSTRAINT pl_address_nn not null,
tel varchar2(20) CONSTRAINT pl_tell_nn not null,
type varchar2(100) CONSTRAINT pl_type_nn not null,
price varchar2(100),
parking varchar2(50),
time varchar2(100),
menu varchar2(4000),
good number,
soso number,
bad number,
constraint pl_fno_pk primary key(fno)
);

create sequence pl_fno_seq
  start with 1
  increment by 1
  nocache
  nocycle;
   --검색이 많은 부분
   
create index idx_pl_name on project_food_location_info(name);
create synonym foodcategory for project_food_category;
create synonym foodinfo for project_food_info;
create synonym foodLocationInfo for project_food_location_info;

select * from project_food_category;
select * from food_category;
--reatjs springboot

*/