package com.sist.main5;
import java.util.Scanner;
public class MainClass {
	//객체지향 -> 묶는것이다.
	/*
	 *   1.관련된 데이터를 묶는다
	 *   2.관련된 명령문을 묶는다
	 *   3.관련된 클래스를 묶는다
	 *     상속, 인터페이스 implements
	 *     ->하위클래스에서 기능을 추가하면 접근할 수 없다
	 *   
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human h=new Human();
//		h.print();
//		
//		h=new Member();
//		h.print();
//		
//		h=new Sawon();
//		h.print();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("선택(Human(1), Member(2), Sawon(3)): ");
		int select=sc.nextInt();
		/*
		if(select==1) {
			Human h=new Human();
			h.print();
			h.aaa();
			h.bbb();
		}
		else if(select ==2) {
			Human h=new Member();
			h.print();
			h.aaa();
			h.bbb();	
		}
		else {
			Human h=new Sawon();
			h.print();
			h.aaa();
			h.bbb();	
		}*/
		
		Human h=null;
		if(select==1) {
			h=new Human();
		}
		else if(select==2) {
			h=new Member();
		}
		else if(select==3) {
			h=new Sawon();
		}
		
		h.print();
		h.aaa();
		h.bbb();
		

	}

}
