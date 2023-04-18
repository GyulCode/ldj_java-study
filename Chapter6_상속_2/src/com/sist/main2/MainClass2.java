package com.sist.main2;
//
class Common{
	int a=10,b=20;
	public void display() {
		System.out.println("Common:display Call...");
	}
}

//
class Child extends Common //is-a
{
	//a b
	public void display() {//오버라이딩
		System.out.println("Child:display Call...");
	}
}

//
class Child2{
	Common c=new Common() {
		//상속없이 오버라이딩 -> 익명의 클래스
		public void display() {
			System.out.println("Child2:display Call...");
		}
	}; //has -a 
}

public class MainClass2 {
	public static void main(String[] args) {
		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		Child2 c2=new Child2();
		System.out.println(c2.c.a);
		System.out.println(c2.c.b);
		c2.c.display();
	}

}
