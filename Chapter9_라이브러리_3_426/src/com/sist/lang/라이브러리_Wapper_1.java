package com.sist.lang;

import java.util.ArrayList;

/*
 *   Wrapper : 전체를 감산다 -> css(container)
 *   프로그램 개발 -> 기본형 데이터형을 
 *   문자열 자료형을 원하는 자료형으로바꾸고 싶을때 사용
 *   
 *   기본형        클래스헝     ->   기본형에 기능을 추가해서 클래스화 시킨것(Wrapper)
 *   int         Integer
 *   long        Long
 *   byte        Byte
 *   double      Double
 *   boolean     Boolean
 *   
 */

public class 라이브러리_Wapper_1 {
	public static void main(String[] args) {
		String s="4.3";
//		double d=(double)s; //문자열은 강제형변환이 안됨 -> Wrapper 사용
		double d=Double.parseDouble(s);  //Wrapper - Double
		// 모든 데이터형 문자열 -> 기본형 데이터형으로 변경
		// 클래스명 : 객체단위로 저장(List<>)
		// 문자열 : 해당 데이터형으로 변환 -> parse... -> static
		// Auto Boxing UnBoxing
		/*
		 * 오토박싱 Auto Boxing
		 * Integer i= new Integer(10);
		 * Integer i=10; String s="";
		 * "클래스"에 해당 데이터값을 설정 -> 오토박싱 new사용
		 * 
		 * int aa=i;
		 * 기본형에 클래스 객체를 설정 -> 언박싱
		 * 
		 * 
		 */
		
		Integer i=100;
		System.out.println(i);
		int aa=i;
		System.out.println(aa);
		
//		List<Integer> list = new ArrayList<Integer>();
		/*
		 *  1. 문자열을 원하는 데이터형으로 변환
		 *     Integer.parseInt("10"); , Double.parsedouble("10"); , Integer.parseInt("10");  
		 *  2. 객체단위로 저장할때가 있다 ***(자료구조 -> Collection)
		 */
		
	}

}
