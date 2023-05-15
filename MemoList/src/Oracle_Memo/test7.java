package Oracle_Memo;



/*
           1     2       3
  select ename, sal, hiredate
  FROM emp
  ORDER BY 2
  -> 컬럼의 위치 2를 기준으로 기본 asc오름차 정렬을 해준다
  -> 오라클은 자동정렬이 되어 있지 않음
  
  2) 이중정렬 -> 답변형 게시판을 만드는 경우
     -----
     order by sal ASC, ename DESC
     -> 같은 값이 있을경우 -> 이름으로 내림차 정렬한다
    
 */

/*
 * 내장함수 (라이브러리) => 사용자 정의 (PL/SQL)
 * 단일행 함수 -> ROW단위 처리
 *    1) 문자 함수(String)
 *       = 변환
 *         대문자 변환 -> UPPER('aaa') -> AAA
 *         소문자 변환 -> LOWER('AAA') -> aaa
 *         이니셜 변환 -> INITCAP('aaa') -> Aaa
 *       = 제어
 *         문자열 자르기 -> SUBSTR()
 *         문자열 위치확인 -> INSTR()
 *         특정 문자열 제거 -> TRIM() 좌우
 *                     -> RTRIM() 우
 *                     -> LTRIM() 좌
 * 
 *         ***특정 문자열 변경 -> REPLACE()
 *         문자열 결합  -> CONCAT -> ||
 *         문자열을 다른 문자로 출력
 *               = LPAD()
 *               = ***RPAD()
 *         ***문자 갯수 확인 -> LENGTH()
 * 
 *    2) 숫자 함수(Math)
 *       = CEIL() : 올림함수(총페이지)
 *       = ROUND() : 반올림 함수
 *       = TRUNC() : 버림함수
 *       = MOD() : % 나머지 
 * 
 *    3) 날짜 함수(Date, Calendar)
 *       = SYSDATE() : 시스템의 시간 읽기
 *       = MONTH-BETWEEN() : (기간의 개월 수 읽기)
 *       = ADD MONTH() : 시스템의 시간 읽기
 *       = NEXT_DAY , LAST_DAY
 *    4) 변환 함수(Format)
 *       ***TO_CHAR : 문자열 변환
 *       TO_NUMBER : 숫자 변환
 *       TO_DATE : 날짜 변환
 *    5) 기타 함수 (다중 조건문, 선택문, null값 처리)
 *       ***NVL() -> NULL값을 다른 값을 변경해서 사용
 *       DECODE() -> switch~case
 *       CASE -> 다중 IF문
 * 
 * 집합행 함수 -> 전체 ROW에 대한 처리
 * 
 * 
 * 내장함수 (라이브러리) => 사용자 정의 (PL/SQL)
 * 단일행 함수 -> ROW단위 처리
 *    1) 문자 함수(String)
 *       = 변환
 *         대문자 변환 -> UPPER('aaa') -> AAA
 *         소문자 변환 -> LOWER('AAA') -> aaa
 *         이니셜 변환 -> INITCAP('aaa') -> Aaa
 *       = 제어
 *         문자열 자르기 -> SUBSTR()
 *         문자열 위치확인 -> INSTR()
 *         특정 문자열 제거 -> TRIM() 좌우
 *                     -> RTRIM() 우
 *                     -> LTRIM() 좌
 * 
 *         ***특정 문자열 변경 -> REPLACE()
 *         문자열 결합  -> CONCAT -> ||
 *         문자열을 다른 문자로 출력
 *               = LPAD()
 *               = ***RPAD()
 *         ***문자 갯수 확인 -> LENGTH()
 * 
 *    2) 숫자 함수(Math)
 *       = CEIL() : 올림함수(총페이지)
 *       = ROUND() : 반올림 함수
 *       = TRUNC() : 버림함수
 *       = MOD() : % 나머지 
 * 
 *    3) 날짜 함수(Date, Calendar)
 *       = SYSDATE() : 시스템의 시간 읽기
 *       = MONTH-BETWEEN() : (기간의 개월 수 읽기)
 *       = ADD MONTH() : 시스템의 시간 읽기
 *       = NEXT_DAY , LAST_DAY
 *    4) 변환 함수(Format)
 *       ***TO_CHAR : 문자열 변환
 *       TO_NUMBER : 숫자 변환
 *       TO_DATE : 날짜 변환
 *    5) 기타 함수 (다중 조건문, 선택문, null값 처리)
 *       ***NVL() -> NULL값을 다른 값을 변경해서 사용
 *       DECODE() -> switch~case
 *       CASE -> 다중 IF문
 * 
 * 집합행 함수 -> 전체 ROW에 대한 처리
 *    1) count() -> row의 갯수 확인
 *    2) MAX()
 *    3) MIN()
 *    4) SUM()
 *    5) AVG()
 * 분석 함수 -> 통계
 *    1) RANK 12345
 *       DENSE_RANK 12234
 *    2) CUBE
 *    3) ROLLUP
 *    
 */
