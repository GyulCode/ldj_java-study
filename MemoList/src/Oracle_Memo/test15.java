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
       
       
      
      
      
 
 */

public class test15 {

}
