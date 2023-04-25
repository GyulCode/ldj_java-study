package com.sist.String;
// concat : 문자열 결합 (+)
/*
 *   String s1="Hello" ;
 *   String s2="Java" ;
 *   s1.concat(s2) -> "Hello Java";
 *   
 *   endsWith : 끝나는 문자열이 같은 경우에 사용
 *   boolean endsWith(Stirng s)
 *   String concat(String s)
 *   
 *   --------자주사용하는 메소드
 *   charAt()
 *   equals() : 대소문자 구분, equalsIgnorecase() : 대소문 구분없이 비교
 *   -ID, PWD				- 영어검색, 영문이름
 *   indexOf(), lastsIndexOf() -- 뒤에서부터 찾는다
 *   --------앞에서부터 찾는다
 *   --------위치확인(문자/문자열)
 *   
 *   length() : 문자의 갯수
 *   startsWith() : 시작문자열이 같은 경우 -> 서제스트
 *   substring(0,10) : 원하는 문자열을 자르는 경우
 *   trim() : 공백 제거
 *   split() : 특정문자로 자르는 경우
 *   contains() : 포함문자열인지 확인
 *   valueOf() : 모든 데이터형을 문자열 변환
 *   
 */

public class 라이브러리_String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="Hello "; //공백도 문자로 인식한다
//		String s2="Java!!";
//		System.out.println(s1.concat(s2));
//		System.out.println(s1+s2);
//		
//		if(s1.endsWith("o ")){
//			System.out.println("o자로 끝났당");	
//		}
//		else {
//			System.out.println("o자로 끝나지 않았다");
//		}
		String[] data= {"JAVA","java","Java","JAva"};
		for(String s:data) {
			if(s.equals("java")) {
				System.out.println(s);
			}
		}
		// equals는 대소문자를 구분해서 비교
		// 원형 : boolean equals(String s
		// 라이브러리 -> 1.기능 2.리턴형 3.매개변수 4. 사용처 를 알아야 완벽하게 숙지한거임
		System.out.println("equals ignorecase()");
		for(String s:data) {
			if(s.equalsIgnoreCase("java")) {
				System.out.println(s);
			}
		}
		// equalsIgnoreCase: 대소문자를 구분하지 않는 비교
		// 원형 : boolean equaslsIgnoreCase(String s)
		// 사용처 : 검색, 영문이름, 영문으로된 데이터찾기
		// 한글 : equals
		// 한글 : 자음으로 찾기 -> 사용자 정의(자바,오라클)
		System.out.println("========length()========");
		String[] data2= {
				"apple",
				  "avocado",
				  "banana",
				  "blackberry",
				  "blueberry",
				  "cherry tomato",
				  "cherry",
				  "coconut",
				  "grape",
				  "kiwi",
				  "lemon",
				  "lime",
				  "mango",
				  "melon",
				  "orange",
				  "papaya",
				  "peach",
				  "pear",
				  "persimmon",
				  "pineapple",
				  "plum",
				  "strawberry",
				  "tangerine",
				  "tomato",
				  "watermelon" 
		};
		//1.각 과일명의 문자길이를 출력
		for(String s:data2)
		{
			System.out.println(s+":"+s.length());
		}
		
		
		System.out.println("==========가장 긴 과일 이름을 출력하시오=========");
		String max="";
		for(String s:data2) {
			if(s.length()>=max.length()) {
				max=s;
			}
		}
		System.out.println(max);
		// length() : 문자 갯수
		// 원형 : int length()
		// 사용처 -> 문자 제한이 있는 경우, 비밀번호
		// OH라클 -> VarChar2(10)
		System.out.println("========== startsWith=========");
		// startswith -> 시작문자열이 같은 경우
		// 원형 : boolean startswith(String s)
		// 사용처 : 자동완성기(검색기), 쿠키 검색
		// 쿠키 -> key는 중복ㅇ벗이 -> 구분 : hote11 hote12
		
		for(String s:data2) {
			if(s.startsWith("P")) {
				System.out.println(s);
			}
		}
		System.out.println("========== trim() =========");
		// trim() -> 좌우 공백 제거
		// 원형 : String trim()
		// 사용처 : 로그인 회원가입, 검색
		// 사용자가 입력시 space
		// String id="admin" => "admin"
		String id="admin";
		if(id.equalsIgnoreCase(" admin".trim())) {
			System.out.println("Same ID");
		}
		else
		{
			System.out.println("Other ID");
		}
		
		System.out.println("========== contains =========");
		for(String s:data2) {
			if(s.contains("a"));
			{
				System.out.println(s);
			}
		}
		// contains 포함문자여을 찾을 경우
		// 원형 : boolean contains(String s)
		// 사용처 : 검색, 추천
		// 추천 ->  네이버 블로그, 카페 > 포함된 영화명
		System.out.println("========== valueOf() =========");
		// valueOf : String에서 유일한 static 메소드
		// 모든 데이터형을 문자열로 변환
		// 원형 : static String valueOf((type)) --> 오버로딩된 상태
		// 사용처 : 자바에서 윈도우 전송, 네트워크, 전송, 웹(String만 인식)
		System.out.println(String.valueOf(10)+String.valueOf(30));
		System.out.println("========== substring =========");
		//substirng() indexOf(), LastIndexOf()
		
		String ss="http://localhost:8080/JSPProject/main.do";
		String res=ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		ss=ss.substring(ss.indexOf("//")+2);
		System.out.println(ss);
		res=ss.substring(0,ss.indexOf("/"));
		System.out.println(res);
		
		ss="서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res=ss.substring(ss.indexOf("지"));
		System.out.println(res.trim());
		
		res=ss.substring(ss.indexOf("지")+3);
		System.out.println(res);
		// substring() 문자열 자르는 경우, 오버로딩
		// substring(int s) s번째부터 마지막까지 잘라온다
		// substring(int s, int e) s번째부터 e-1까지 잘라온다
		// 원형 : String substring(int s)
		// 사용처 : URL주소 제어 , 주소제어, 문자열이 긴 경우
		ss="홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names=ss.split(",");
		
		ss=
				"갈비살"
				+ "30,000원"
				+ "돼지갈비"
				+ "17,000원"
				+ "돼지목살"
				+ "15,000원"
				+ "삼겹살"
				+ "15,000원";
		String[] menu=ss.split("원");
for(String m:menu) {
		System.out.println(m+"Won");
}
ss="red?blue?green?balck?white?yellow";

String[] colors = ss.split("\\?"); //|는 정규식 사용기호 | , ? , . , + , * , ^
for(String c:colors) {
	System.out.println(c);
}
System.out.println("========== replace =========");
// replace() : 문자/문자열 변경
// 원형 String
ss="https://mp-seoul-image-production-s3.mangoplate.com/656242_1520282569201256.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";

	}

}
