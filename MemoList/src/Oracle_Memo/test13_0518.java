package Oracle_Memo;

/*
 *  오라클 -> 데이터관리 시스템
 *  데이터 관리(데이터 저장) -> 메모리에 저장하는 구조 생성(DDL)
 *  데이터 제어 -> 검색, 수정, 삭제, 추가(DML) -> SELECT INSERT(INTO) UPDATE(SET) DELETE
 *               |
 *           SELECT(DQL)
 *  DDL(데이터 정의언어 -179page)
 *  -> 데이터 저장할 공간(Table)
 *  -> 생성
 *     Table : 데이터 저장 장송
 *     View : 가상 테이블
 *     index : 검색 속도의 향상 
 *     SEQUENCE : 자동증가번호(PRIMARY KEY)
 *     PL/SQL -> FUNCTION, PROCEDURE, TRIGGER
 *     --------------------------------------
 *     명령어 (DDL)
 *           -> commit을 사용하지 않는다 -> 복구 할 수 없다
 *           -> DML(ROW단위), DDL(컬럼단위)
 *           -> 데이터베이스 담당자 (DBA)
 *     1) CREATE : 생성 
 *     2) ALTER : 수정, 삭제, 변경
 *     3) DROP : 삭제
 *     4) RENAME : 이름변경
 *     5) TRUNCATE : 데이터 잘라내기(테이블은 두고 내용삭제)
 *     
 *  TABEL 생성
 *     1) 오라클의 데이터형 -> 컬럼명 데이터형
 *        1.문자형
 *          CHAR(1~2000BYTE)
 *             -> 고정바이트 (글잘수 동일 -> 남자/여자 Y/N)
 *             -> CHAR(10)
 *                저장하는 데이터가 'A'(1 BYTE) '같'(3 byte)이지만 메모리 공간은 10 BYTE를 할당함
 *                -> 메모리 누수 현상이 많음
 *          VARCHAR2(1~4000BYTE)
 *             -> 가변 바이트, 가장 많이 사용되는 문자열
 *             -> VARCHAR2(10) -> **문제는 오라클에만 있는 데이터형임
 *                일반적인 데이터 베이스에서는 VARCHAR라고 함
 *                저장되는 데이터 -> 'A'(1 BYTE) -> 메모리 1 BYTE *아주좋다
 *          CLOB(4GB)
 *             -> 가변 바이트 -> 문자열 저장 -> 줄거리, 레시프제작, 자기소개, 회사소개
 *             ------------자바(String)
 *             **사용 형식
 *                성별 -> sex CHAR(6)
 *                이름 -> name CHAR(6)
 *                줄거리 -> story CLOB
 *                
 *        2. 숫자형
 *          NUMBER(38) : int, long, double
 *          NUMBER(4) : 0~9999
 *          NUMBER -> default : 8자리
 *          NUBMER(7,2) -> 7자리 저장, 소수점 2자 사용이 가능
 *             -> 맛집 평점 -> NUMBER(2,1) -> 9.7점 이런식
 *             **사용 형식
 *                게시판 번호 -> board_no NUMBER
 *                평점 -> score NUMBER(2,1)
 *                조회수 -> hit NUMBER -> hit NUMBER DEFAULT 0 (초기값 지정)
 *                
 *        3. 날짜형
 *          DATE : default -> int, long, double
 *          TIMESTAMP : 기록 경주
 *             **사용 형식
 *                등록일 -> regdate DATE -> regdate DATE DEFAULT SYSDATE
 *                          
 *        4. 기타형 -> 동영상, 사진, 이미지(로고), -> 빈도수가 적다
 *          BLOB -> 2진 파일
 *          BFILE -> File형식으로 저장
 *             **사용 형식
 *                이미지 -> image BLOB
 *                         image BFILE
 *                        
 *     2) 정형화된 데이터(프로그램에 필요한 데이터만 추가) -> 제약조건
 *     3) 형식
 *     4) 데이터베이스(XE -> 모든테이블을 제작)
 *        -> 같은 이름의 테이블을 생성하면 안된다(유일값)
 *        -> 테이블안에서 같은 테이블을 만들 수 없다
 *        
 *  
 */

public class test13_0518 {
	

}
