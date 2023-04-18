package com.sist.main2;
/*
 * 오버라이딩 : 재정의
 * = 변수 오버라이딩 : 변수명이 동일
 * = 메소드 오버라이딩 : 메소드명이 동일
 * 
 *              오버로딩          오버라이딩
 * 클래스관계     같은 클래스          상속관계
 * 메소드명         동일   	          동일
 * 리턴형         관계없은             동일
 * 매개변수       갯수, 데이터형이 다르다   동일
 * 접근지정어       관게없음           확장이 가능
 * 목적          새로운 기능 추가     기존 기능을 수정
 * -> 오버라이딩은 메소드를 변경하는 것이다(204 g
 * 
 * 
 * 
 *
 *    오버라이딩  재정의
 *    변수 오버라이딩
 */
class Human{
	int a=10;
	// super -> Object
	private void display() {
		
	}
}
class Student extends Human{
	int a=20;
	public Student() {
		int a=30;
		System.out.println("a="+a);
		System.out.println("a="+ this.a);
		System.out.println("a="+super.a);
	}
	public void display() {
		
	}
	
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
