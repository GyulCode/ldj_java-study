package com.sist.lib;
/*
 * 사용자 정의 클래스 + 라이브러리
 * ----------------------조립
 * 1) 자바의 모든 클래스(라이브러리 클래스, 사용자 정의 클래스)
 *    -> 상위 클래스(Object)
   2) 자바에서 지원하는 라이브러리
      -> java.lang : 자바의 기본 클래스(가자 많이 사용됨)
         import를 생략한다
         object, String, StringBuffer, Wrapper 등등
      -> java.util : 유용하게 사용이 가능하게 만든 라이브러리
         Scanner, StringToeknizer, 자료구조***
      -> java.io : 입출력(메모리, 파일, 네트워크) -> CheckException
      -> java.net : 네트워크 -> CheckException
      -> java.sql : DB연결
      -> java.text : 변환실패(날자형식, 문자열 형식)
      
      Web
      Spring과련 라이브러리
      Jsoup, Json 데이터수집
      
      자동처리
      import java.lang.*
      메소드
         
      생성자
         class A
            A(){}
      상속
         class A extends Object
         
      java.lang에서 지원하는 클래스는 대부분이 final클래스
      상속을 받아서확장이 불가능(있는 그대로 사용)
      상속받아서 확장이 가능한건 Object : 모든 데이터형을 받을 수 있다.
      데이터형을 여러개 사용시에는 라이브러리에서 리턴형 대부분 Object
         -> 형변환을 사용해야 사용이 가능하다
         -> 클래스를 형변환 : (int)new Object() / (Integer)new Object()
      
      오토박싱 : Integer i=10;
      언박싱 : int a=new Integer(10);
      
      Object
      주요기능)
        finalize() : 소멸자
        toString() : 객체를 문자열로 변환
        clone() : 새로운 메모리를 생성할때 복제
        getClass() : 클래스 객체 읽기
        equals() : 객체 비교
         
  
  
 * 
 */

class Student {
	private int hak;
	private String name;
	public Student() {
		this.hak=1;
		name="hongil";
		System.out.println("생성자");
	}
	public void print() {
		System.out.println("hak"+hak+" name"+name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제");
	}

}


public class 라이브러리_Object {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 메모리 할당(메모리에 저장)
		Student s=new Student();
		// 객체를 활용(메소드호출, 변수변경)
		s.print();
		// 객체 메모리 해제(메모리에서 삭제)
		s=null; // GC대상
		// 메모리를 해제 -> 강제로 명령
		System.gc(); //finalize() -> 멀티미디어(영상)
		// A(), ~A()
	}

}
