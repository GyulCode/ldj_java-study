package Oracle_Memo;
/*
   DQL : select(데이터 추출) -> 검색, 목록, 상세보기
   => select
   1) 형식 -> 문법 순서
   column -> 데이터별 구분(파일 -> |,)
   where 조건문|컬럼명, 함수명, 연산자값
   group by 그룹컬럼명|함수명
   having 그룹조건
   order by 컬럼|함수명(ASC||DESC) -> 올림/내림 -> 정렬
   *** 순서는 셀프웨구해오!! 바뀌면 오류임
   
   --연산순서--
   select  5
   from    1
   where   2
   group   3
   having  4
   order   6
   
   연산자
   = 산술연산자 -> 산술처리(문자열 결합은 하지 않는다 -> ||)
     'A'+1 오류 -> ASCII('A')+1 = 66
     '10'+10 -> TO_NUMBER('10')+10=20
     정수형으로 변경후에 연산
     자동 형변환은 존재, 강제 형변환은 없다(int)(X)
     실수 -> 정수:ROUND() CEIL(), TRUNC()
     사용 위치는 select뒤에서 주로 사용
     통계(column 단위별로 통계가 존재, ROW단위는 x)
     
     비교연산자
     =(같다), <>, ^=, != (같지 않다) => 권장(<>)
     문자열, 날짜도 적용됨
     날짜는 문자열 형식으로 저장되어 있음 'YY/MM/DD'
     
     논리연산자 and / or
     
     데이터 베이스에서만 사용되는 연산자
     not
     null
     in
     between ~ and
     like :검색
     
   3)내장 함수
   4)조인/ 서브쿼리
   
 
 
 */




public class test8 {
}
