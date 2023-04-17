package com.sist.main;


/*
 *   접근지정어 : 접근 범위 지정 -> 생성자, 메소드, 변수
 *   private : 자신의 클래스에서만 사용이 가능 ->멤버변수는 private
 *             = 단점은 다른 클래스와 연결이 안됨
 *             = getter/setter로 보완
 *             변수는 은닉화 메소드를 통해서 접근하는 방식(캡슐화)
 *             ---기술면접 : 은닉화 vs 캡슐화
 *             캡슐화 : 데이터 보호할 목적으로
 *   default : 같은 패키지안에서 접근
 *             한 파일에 class 두개를 만들지 않는다
 *   protected : 같은 패키지안에서 접근, 다른패키지에서는 상속받으면 사용가능
 *   public : 패키지 관계없이 모든 클래스에서 접근이 가능
 *   -> 멤버 변수들은 private로 지정해주고 메소드, 생성자는 public으로 해주면 된다
 *   
 *   매개변수로 객체 전송 -> 메모리 주소 (변경 -> 자체가 변경)
 *   -> 얕은 복사
 *   
 *   매개변수 전송 방식
 *   값 복사 : 값만 복사 복사본 -> 기본형 string
 *   주소 복사 : 주소 전송, 원본 -> 배열, 클래스
 *   
 *   
 *             
 */
class Value{
	int a=10, b=20;	
}

public class 접근지정어 {
	
	
	static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a : "+a+",b : "+b);
			
	}
	static void swap(Value v) {
		System.out.println("v="+v);
		int temp =v.a;
		v.a = v.b;
		v.b=temp;
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10, y=20;
		swap(x,y);
		System.out.println("x : "+x+", y : "+ y);

	}

}
