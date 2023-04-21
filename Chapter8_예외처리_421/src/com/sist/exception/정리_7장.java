package com.sist.exception;
import java.util.*;


/*
 *  fianl 클래스 -> 종단 클래스
 *  -> 확장 불가 있는그대로 사용해야함 -> 상속을 할 수 없다 -> 상위 클래스가 될 수 없다
 *  java.lang / util / io / net / text -> 기본라이브러리
 *  java.sql, java.http.servlet.* , java.xml
 *  오라클       브라우저                출력
 *  
 *  오버라이딩(상속의 기본)
 *  객체지향의 3대요소
 *  1. 데이터 보호 목적
 *     캡슐화 private public getter/setter
 *     public : 모든메소드, 생성자
 *  2. 재사용하는 목적
 *     class A
 *     class B extends A -> A의 모든 내용을 가지고 온다 -> 변경, 추가해서 사용가능
 *     라이브러리 -> 프로그램에 맞지 않는경우 수정
 *     
 *     A a = new B() //묵시적 형변환
 *        단 추상클래스, 인터페이스는 메모리에 할당이 안된다
 *        메모리 할당시 상속받은 클래스를 ㅣ용해서 메모리 할당을 한다
 *        
 *     B b = (B)a // 명시적 형변환 (강제)
 *     -------------라이브러리에서 많이 사용
 *     ->클래스를 저장해서 관리 (클래스) ->collectinon
 *     
 *  3. 수정(오버라이딩), 추가(오버로딩) 목적(유지보수)
 *     -> 메소드관련
 *     
 *                 오버로딩           오버라이딩
 *     -----------------------------------
 *               한개의 클래스          상속관계
 *               상속관계
 *     -----------------------------------
 *     메소드명      동일               동일
 *     -----------------------------------
 *     매개변수       갯수나            동일
 *               데이터형이 다름
 *     -----------------------------------
 *     리턴형         관계없음           동일
 *     -----------------------------------
 *     접근지정어    관계없음            확장가능
 *     -----------------------------------
 *     사용처        생성자         인터페이스/추상클래스
 *     ***상속
 *     1) 호출 -> 상위 클래스의 생성자를 먼저 호출한다(기본생성자)
 *     2) 예외조건 : static, 생성자, 초기화블럭, private
 *     
 *     B b=(B)new A(); -> class CastException
 *     A a=new B()
 *     B b=(B)a;
 *  클래스이 종류
 *  = 추상클래스
 *  = 인터페이스 -> 추상클래스의 단점을 보완(클래스와 동일하게 취급)
 *    **클래스(단일) / 인터페이스(다중)
 *    설계도(구현이 안된 상태) -> 미완성 클래스 (자신이 메모리 할당을 할 수 없다)
 *    여러개의 관련된 클래스를 모아서 한개의 객체명으로 제어
 *               
 *               추상클래스           인터페이스
 *    -----------------------------------------------------
 *    관계        단일 상속            다중 상속
 *    -----------------------------------------------------
 *    상속키워드     extends          implements
 *    -----------------------------------------------------
 *    멤버변수      인스턴스변수          상수형변수만 사용
 *               정적변수             
 *    -----------------------------------------------------
 *    메소드       구현된메소드          구현이 안된 메소드
 *               구현이 안된 메소드
 *    -----------------------------------------------------
 *    기법        오버라이딩            오버라이딩
 *    -----------------------------------------------------
 *    형식
 *       추상클래스
 *       [접근지정어] abstract class ClassName
 *       {
 *          변수
 *             인스턴스 변수
 *             static 변수
 *          메소드
 *             구현된 메소드
 *             [접근 지정어] 리턴형 메소드명(매개변수)
 *             {
 *             }
 *             구현이 안된 메소드(선언)
 *             [접근지정어] abstract 리턴형 메소드명(매개변수..);
 *          생성자, 오버로딩 가능
 *       }
 *       
 *       인터페이스
 *       [접근지정어] interface Interface명{
 *          변수선언(상수형변수)
 *          int a=10; 값을 명시적으로 지정
 *          -> public static final int a=10;
 *          
 *          구현이 안된 메소드 목록
 *          void display();
 *          -> public abstract void display();
 *          
 *          구현한 메소드 목록
 *          default void aaa(){}
 *             public default void aaa(){}
 *             
 *          static void bbb(){}
 *             public static void bbb(){}
 *       }
 *       -> 인터페이스는 변수나 메소드가 public이어야 한다 (연결목적으로 제작하기 때문)
 *                   
 *       interface -> interface / extends
 *       interface -> class / implement
 *       
 *       다중 상속
 *       class A implements 인터페이스 인터페이스 ㅎㅌㅈ ㄱㅈㅅ ㄱㅁㅎ
 *    -----------------------------------------------------
 *     
 */

class A{
	
	{
		System.out.println("empty block is called...");
	}
	
	public A(){
		
	}
	
	static{
		System.out.println("static block is called...");
	}
	
	public String name="홍길동";
	int a=10;
	
	public A (int a){
		System.out.println("A is called...");
		this.a=a;
	}

	public A(String name){
		this.name = name;
	}
}

class B extends A{
	private int studentNo;
	
	int b=20;
	
	public B() {
		super();
		System.out.println("B is called...");
	}

	public B(String name, int studentNo){
		this.name = name;
		this.studentNo = studentNo;
	}
}

class AAA{
	public void aaa() {
		
	}
	public AAA() {}
	int a=10;
	
}

abstract class C{
	
}

public class 정리_7장 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("");
		list.add(1);
		list.add(new 정리_7장());
		String s=(String)list.get(0);
		
		String s1="Hello"; // s1==s2 값이 같아서 같은주소에 저장됨
		String s2="Hello";
		String s3=new String("Hello"); // new로 생성해서 새로운 주소에 생성된다 주소가 다름
		
		
		A a=new B();
		B b=(B)a;
		System.out.println(b.b);
		System.out.println(s1.equals(s3));
		
	}

}
