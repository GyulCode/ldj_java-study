package StudyMemo;
import java.math.BigDecimal;
import java.math.BigInteger;


public class Study_0614 {
	
}
/*
   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 - webstudy2 토큰
   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 - webstudy1 토큰
   
   0614_수 
   ER다이어그램 관계 표시
    논리적설계 ↓
   릴레이션 스키마 : 
   
   원자값 부분함수 이행함수 결정자 다중 조인
   1정규화 : 원자값만 갖는다, 하나의 컬럼에서 하나의 컬럼값만 갖는다 -> 혈액형 컬럼에서 O형, AB형 동시에 갖을 수 없음
   2정규화 : 1정규 만족, 부분적 종속이 없어야 한다.(기본키를 얻기 위해 컬럼값을 2개 이상 사용시 발생)
   3정규화 : 이행적 종속 제거(이행적 종속이란 A->B , B->C 일때 A->C는 성립인경우를 말하는데 3정규화는 이걸 제거하는거다)
   
   6장 : 데이터베이스 모델링
   
   7장 : 테이블을 분리 (이상현상(추가,수정,삭제)을 제거) = 검색이 쉽게 (정규화)
        DBA가 없다(직접 설계) -> 실무에서는 요구사항분석(아키텍쳐), DB설계, 수집(DBA)
        화면 UI(퍼블리셔), 구현(웹프로그래머), 테스터(테스터)
   
   요구사항 분석(벤치마킹) -> 기능 (3개이상 사이트 참조)
   모방(약간의 없는 기능을 추가 가능)
   개념적 설계 : 화면 제작에 필요한 데이터 추출(ER모델)
   ER-Model : 엔티티(테이블) -> 속성(컬럼) -> 타원형으로 만든다
            ---------관련된 데이터를 한곳에 모아둔다(사각형)
            다른 테이블과 연결(매핑테이블) -> 마름모
            회원 ===예약=== 맛집
            회원(액터) ===(구매/장바구니)=== 상품
            
   ----------------------------------------------------------------
   
   논리적 설계
   1) 구조 1:N / 1:1 / N:M
      회원 -> 예약 1:N
      회원 -> 가입 1:1
      회월들 -> 구매 N:M
   2) KEY설정
      -> 기본키 : 테이블당 1개 이상이 존재 (중복없이 = 이상현상 방지(수정,삭제)
         권장사항(모든 테이블에 기본키 설정), 두개이상의 컬럼을 묶어서도 사용가능(사번, 사원아이디)
      -> 대체키 : 회원의 ID를 잃어 버린 경우 -> UNIQUE(phone, email) 인증x
      -> 정규화에 의해서 테이블이 분리가 될때 -> 연결 -> FOREIGN KEY(참조키) 
      -> 남용하면 자바에서 연결시 문제가 있을 수 있다.
      
   물리적 설계 : 실제 오라클에 데이터 저장소를 만든다. (테이블)
   Create TABLE, 제약조건, ALTER, DROP, ... 데이터형
   테이블 제작시 정규화 389PAGE -> 이상현상 방지가 가장큰 목적(삽삭갱)
         
   모든 컬럼에 대한 제어를 기본키 제어 -> 수정, 삭제, 검색
                    --------> 함수 종속
   회원 : id
   영화 : 영화번호
   
   7장 정규화
   목적 : 테이블간 데이터 중복 방지(무결성 유지), DB의 용량 최적화, 이상현상 방지
         
         DB의 기능
         1. 데이터 검색(SELECT)
            -> 검색속도의 최적화(INDEX, B-TREE)
            -> 보안(VIEW-SQL문장, PRECEDURE-반복SQL) -> 재사용
         2. 데이터 추가(INSERT, NULL값 처리여부)
            -> 자바에선는 오라클의 null을 받아서 처리가 어렵다
         3. 데이터 수정 : 연쇄적인 수정
         
         4. 데이터 삭제 : 연쇄적인 삭제 CASCADE
         
   함수종속
      게시판(bno[기본키], name, subject...regdate, hit)
      bno로 name, subject등 모두 제어가능
      
      사원(empno, ename, job, hiredate...deptno, dname,loc)
      
   1정규화 : 원자값 : 컬럼에 데이터 값을 한개만 저장(수정, 삭제가 없는 경우는 정규화를 사용하지 않을 수 있다)
           프로젝트 모방 -> 데이터 수집:고정
   3정규화 : 결정자를 1개만 사용(기본키)
           영화 -> 예매
               | 예매내역(매핑테이블)
   ---------------------------------------------------------------
   실제 테이블 구축 : 물리적 설계
   DDL사용
   CREATE, ALTER, DROP, RENAME(이름변경)
   제약조건
   = NOT NULL : NULL값을 허용하지 않는다.
   = UNIQUE : 중복을 허용하지 않는다. = 대체키
   = PRIMARY KEY : 기본키(결정자) -> ROW를 제어한다.
   = FOREIGN KEY : 매핑테이블을 제어
   = CHECK : 저장된 데이터만 첨부(CHECK >=30)
   = DEFAULT 자동 저장되는 데이터(제약 조건이 아님) -> 초기화
   
   CREATE TABLE TABLE_NAME(
   컬럼명 데이터형 [제약조건], -- NOT NULL, DEFAULT
   컬럼명 데이터형 [제약조건],
   컬럼명 데이터형 [제약조건],
   [제약조건] --
   
   SD
   
            
            
   
 */









