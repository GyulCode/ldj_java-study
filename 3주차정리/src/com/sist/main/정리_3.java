package com.sist.main;
/*
 *   객체 -> 114
 *   클래스 -> 115
 *   인스턴스 -> 117
 *   클래스 구성요소 -> 122
 *   객체 생성 -> 123
 *   -------------------
 *   패키지 132
 *   메소드 140~155
 *   생성자 166
 *   멤버변수의 초기화 -> 168
 *   생성자 오버로딩 -> 171
 *   생성자 this 173 this -> 클래스 자신의 객체명 (static)
 *   
 *   class A
 *   {
 *      A a=new A();
 *      JVM -> 메모리를 생성
 *      this = a;
 *   }
 * 
 * 
 */

public class 정리_3 {
	정리_3()
	{
		System.out.println("this="+this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		정리_3 a=new 정리_3();
		System.out.println("a="+a);

	}

}
