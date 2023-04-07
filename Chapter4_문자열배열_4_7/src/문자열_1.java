/*
 *   문자열 데이터형 : 참조형
 *   -> String : 문자열 저장
 *     문자, 문자열 : 여러개의 문자를 동시에 저장 -> ""사용
 *     '' -> 한글자 저장 char
 *     String -> char[] 의 배열형태
 *     ------    -----
 *     "홍길동"    {'홍','길','동'}
 *     
 *     string : -> java.lang.String에 존재 -> 라이브러리
 *     -----
 *     일반데이터 (문자열 저장), 클래스형 -> 지원하는 기능(메소드)
 *     -> 가장 많이 사용되는 데이터형(기본형 처럼 사용)
 *     -> 웹, 윈도우 -> 무조건 문자열 통신
 *     -> <input type ="text">
 *     int, String 이 두개가 가장 많이 사용됨
 *   -> 사용법
 *     String name="홍길동"
 *     // String name=new String("")로 사용도 가능
 *   -> String에서 지원하는 메소드는 변경할 수 없다 = 표준화가 되어 있다(모든 개발자가 수정안함)
 *      Math.random() : 0.00~0.99까지 임의 추출, Math.ceil() : 올림함수, Math.round() : 반올림...
 *      -------이러한 메소드는 결과값을 받아서 처리 return 같은걸로 받음
 *      
 *      1) 대문자 변환 toUpperCase()
 *         String s="Hello java";
 *         String result = s.toUpperCase();
 *         -> result = "HELLO JAVA"
 *      2) 소문자 변환 toLowerCase()
 *         String s="Hello Java";
 *         String result=s.toLwerCase()
 *         -> result = "hello java"
 *      3) 찾기
 *         -----------
 *         startsWith -> 시작문자열 -> 결과값 true/false -> if
 *         endsWith -> 끝나는문자열 -> 결과값 true/false -> if
 *         -----------서제스트(자동완성기)
 *         contains -> 포함문자 (검색) -> 추천
 *                      
 *      
 *   
 *   
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] msg={'H','e','l','l','o', 'J','a','v','a'};
		System.out.println("----------대문자 변환-----------");
		for(char c:msg)
		{
			if(c>='a'&&c<='z') {//소문자라면
				System.out.print((char)(c-32));
			}
			if(c>='A' && c<='Z') { //대문자
				System.out.print(c);
			}
		}
		
		System.out.println("\n----------소문자 변환-----------");
		for(char c:msg)
		{
			if(c>='a'&&c<='z') {//소문자라면
				System.out.print(c);
			}
			if(c>='A' && c<='Z') { //대문자
				System.out.print((char)(c+32));
			}
		}
		System.out.println("\n--------------문자열----------------");
		String s="Hello Java";
		System.out.println("\n---------문자열 대문자 변환------------");
		System.out.println(s.toUpperCase());
		System.out.println("\n---------문자열 소문자 변환------------");
		System.out.println(s.toLowerCase());
		/*
		 * String toUpperCase()
		 * String toLowerCase()
		 * 안에 for문과 같은 알고리즘이 있다.
		 */

	}

}
