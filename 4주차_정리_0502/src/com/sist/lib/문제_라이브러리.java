package com.sist.lib;
/*
 * 문제 1

예외에 대한 설명 중 틀린 것은 무엇입니까? 4번

① 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.

② RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 
   체크하지 않는다.

③ 예외는 try-catch 블록을 사용해서 처리된다.

④ 자바 표준 예외만 프로그램에서 처리할 수 있다.
 -> 사용자 정의 예외
 
 
문제 2

try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까? 3번

① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다.

② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.
-> 예외 복구처리

③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다.
-> return 여부와 관계없이 수행된다

④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.
-> 상속도에 따라 처리가능


문제 3

throws에 대한 설명으로 틀린 것은 무엇입니까? 4번
-> 예외회피, 예외선언, 에외 떠맡기기

① 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.

② throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.

③ 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성 할 수 있다.
-> Throwable도 있음
④ 새로운 예외를 발생시키기 위해 사용된다.
-> throw

문제 4

4. throw에 대한 설명으로 틀린 것은 무엇입니까? 2번

① 예외를 최초로 발생시키는 코드이다.
throw new 새로운 예외처리클래스()
-> 밑에는 코딩이 불가능하다
② 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.
-> throws
③ throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
④ throw 키워드 뒤에는 예외 객체 생성 코드가 온다.

문제 5 답 3번
순서가 잘못됨 Exception이 크기가 더 크다

문제 6 
value = 10
i = 1일때 숫자 변환 오류
i = 2일때 인덱스 초과 오류


String 클래스의 주요 메소드 문제 (다음 설명에 맞는 메소드의 원형을 작성하시오)

1. 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
-> boolean startsWith(String s)
 
2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
-> boolean endsWith(String s)

3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
-> boolean equals(String s)
-> 로그인, 아이디중복, 상세보기 등등

4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
-> String char[] 인덱스는 0부터
-> int indexOf(String s), int indedxOf(char c)

5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
-> int lastIndexOf(String s) char 가능

6. 문자열의 길이를 반환한다.
-> int length()

***7. 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
-> String replace(String s1, String s2) 또는 char

8. 정규표현식을 지정한 문자로 바꿔서 출력한다.
-> String replaceAll(String regex, String s)

***9. 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
-> String[] split(String regex)
-> 패턴
[가-힣] 한글전체
[A-Za-z] 영문전체
[0-9] 숫자 전체
--------------크롤링
 
***10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
*-> String substring(int s, int e) 단 e-1번 인덱스 까지 가져옴

11.  문자열에 대문자를 소문자로 변환한다.
String toLowercase() -> 오라클 (LOWER())

12. 문자열에 소문자를 대문자로 변환한다.
String toUpperCase(0 -> 오라클 (UPPER())
** 오라클은 대소문을 구분하지 않는다 단 저장된 값은 대소문자 구분

***13. 문자열을 그대로 반환해준다.
-> String toString()

14. 문자열에 공백을 제거해 준다.
->  String trim() 좌우공백만 제거

15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)
-> String valueOf() 모든데이터
 
***16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
-> boolean contains(String s)
-> 검색

17. 지정한 index번째에 문자를 반환한다.
->  char charAt(int index)

18. 문자와 문자를 결합해준다.
->  +, concat(String s)

19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.
-> String format("%d%d...")
-> static




 

 */

public class 문제_라이브러리 {

}
