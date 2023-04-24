package com.sist.lib;
/*
 * 1. java.lang
 *    Object : 모든클래스의 상위 클래스(모든 클래스는 상속을 Object로 받는다)
 *    기능(메소드)
 *    = toString() : 자주 사용이 된다, 객체를 문자열화 시킨다
 *    = clone() : 객체 복제
 *        참조 : 같은 메모리를 사용하여 주소값이 동일
 *        복제 : 다른 메모리 아에 다른 객체임 
 *    = finalize() : 소멸자 함수(호출되면 메모리 해체)
 *    = equals() : 객체 비교
 *    String : 문자열 저장하고 관리하는 클래스
 *    기능(메소드)
 *    = equals() : 문자열을 비교할때 사용
 *       ==은 주소값 비교
 *       로그인 처리, 상세보기, 아이디중복
 *    = startsWith : 시작문자열이 같은 경우
 *       -> 오라클 : 'A%'
 *    = endsWith : 끝나는 문자열이 같은 경우
 *       -> 오라클 : '%A'
 *    = contains : 포함된 문자열(가장 많이 사용)
 *       -> 추천
 *    = replace : 문자나 문자열을 변경할때
 *    = replaceAll : 문자나 문자열을 변경할때(정규식) -> 문자열의 형태
 *    [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *    = trim : 좌우 공백 제거
 *    = split : 특정 단어별로 나눠서 저장-> String[]
 *       -> StringTokenizer
 *    = valueOf : 모든 데이터형을 문자열로 변경
 *    = length : 문자의 갯수
 *    = substring : 문자열을 자르는 경우에 사용
 *       -> StringBuffer, StringBuilder...
 *    Wraper : 기본형을 클래스
 *       -> Byte , Integer, Double...
 *    ------------------------------------------- java.lang은 import를 생략할 수 있다.
 *    
 *       
 *    
 *    => 오버라이딩
 * 2. java.util
 *    Date/Calender ***
 *    StringTokenizer ***
 *    Collection
 *        1) list ***
 *           Arraylist ***
 *           Queue LinkedList
 *           Vector
 *           Stack
 *        2) map ***
 *           HashMap
 *           HashTable
 *        3) set(interface) ***
 *           HashSet 
 *           TreeSet
 *        
 *    
 * 2-1. java.text
 * 3. java.io
 * --------------------------기본 라이브러리
 * 4. java.net
 * 5. java.sql
 * -------------------------6주차 다음주 화요일
 * 6. java.xml
 * 7. java.servlet.http
 * 8. 외부 라이브러리(자바에서 지원하는게 아님)
 *    Opena API->Jsoup, simple json : mvnrepository.com
 *    org.
 *    com.
 *        1. DB (Mybatis,Hibernate(JPA)
 *        2. XML, JSON(VueJS,Ajax,React)
 *        3. 프레임워크 : spring / springboot / struts
 *        ***JSP(HTML=Thymeleaf)
 *        현대 - springboot react
 *        삼성 - springboot vuejs
 *        
 *        "a= " + a -> 원래는 a.toString()
 * 
 */
class A{
	int a=10, b=20;

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "a="+a+"b="+b;
//	}
	
}

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println(aa.toString());
		System.out.println(aa);

	}

}
