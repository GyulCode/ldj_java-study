package com.sist.main;
// 상속이 있는 경우 -> 객체 생성 방법
// double d=10; -> d=10.0
/*
 *    A a=new A();
 *    A b=new B();
 *    B c=new B();
 *    B d=new A(); - 오류
 *    B e=(B)new A(); - x
 *    ***형변환
 *    
 *    상속
 *    1. 형식
 *       class A extends B - 단일 상속
 *    2. 클래스 크기
 *       상속을 내리는 클래스 - 상속을 받는 클래스
 *    3. 형변환
 *       작은 클래스 = 클래스
 *    4. 자바의 최상위 클래스 -> Object
 *    5. 상속의 예외: static -> 공유, 초기화블록, 생성자, private 접근이 안됨
 *    ----
 */
class Human{
	int a=10, b=20;
	static int c=30;
	
	void display() {
		System.out.println("Human");
	}
	
}
class Student extends Human{

	int d=40, e=50;
	/*
	 * 여기서 오버라이딩이 나오는데
	 * 1. 상속
	 * 2. 메소드명 동일
	 * 3. 매개변수 동일
	 * 4. 리턴형 동일
	 * 5. 접근지정어는 확장이 가능 / 축소하면 오류 발생 
	 */
	public void display() {
		System.out.println("Student");
	}
}


public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 클래스명과 생성자가 다른경우
		 * 
		 * 1. 변수 제어 -> 클래스 타입
		 * 2. 메소드 제어 -> 생성자 타입(초기화)
		 */
		Human h=new Human();
		Student s=new Student();
		Human h2=new Student();
		
		
//		Student s2=new Human(); //이건안됨
//		Student s2=(Student)new Human(); //이건 왜됨?
		
		
		Student s2=(Student)h2; //생성자가 동일해야지 형변환이 가능***
		//변수 접근 -> 선언된 클래스에 등록 변수값만 접근이 가능 (자료형=클래스명)
		
		
//		Student s3=(Student)h; //생성자가 달라서 안됨 Class Cast Exception -> 형변환 오류
		
		// 사용 범위 -> 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능 하다
		
		
		 
		

	}

}
