package com.sist.exam3;

//공유 addr, display()
class A{
	
	int a;
	int b;
	String name;
	static String addr;
	
	public A() {
		display();
		a=10;
		b=20;
		name="hong";
		addr="seoul";
	}
	
	public void print() {
		
	}
	
	public static void display() {
		//static 메서드 내부라 static변수들만 사용가능 인스턴스 변수들 사용불가
		// 사용할라면 객체를 생성하고 초기화 해야함
		//즉 addr display 이 두개만 가능
		addr="";
		A aa=new A();
//		a=10; <-오류
		aa.a=10;
		
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
