package com.sist.main;
/*
 *    생성자
 *    1. 클래스명과 동일
 *    2. 리턴형이 없다 -> void 클래스명() 이런거 안됨
 *    3. 생성자는 여러개를 만들 수 있다(오버로딩)
 *    4. 생성자를 사용하지 않으면 자동 기본 생성자가 첨부...
 *    5. 사용처
 *       명시적인 초기화가 않되는 부분에서 주로 사용
 *       시작과 동시 처리가 있는 경우 (데이터베이스 연결, 서버 연결...)
 *       객체 생성시 호출되는 메소드
 *    6. 호출시에는 new생성자()
 *    class A
 *    {
 *       int a;
 *    }
 *    
 *    인스턴스메소드 : 인스턴스 변수, 메소드 static변수, static메소드 전체를 사용이 가능
 *    static메소드 : static변수, static메소드만 사용이 가능
 *    -> 인스턴스를 사용하기 위해서는 객체생성후에 사용이 가능
 *    
 *    1. 오버로딩 : 같은 메소드 이름으로 다른 기능을 수행하게 만드는 기법
 *       같은 클래스안에서 생성
 *       메소드명이 동일
 *       매개변수의 갯수나 데이터형이 다르다, ***리턴형은 관게없다
 *       ------------------저장형태
 *       void aaa() ---> aaa()
 *       int aaa(int a) ---> aaa(int)
 *       double aaa(int a) ---> aaa(int)  -> 오러로딩 할라면 double로 바꿔준다.!!
 *       char aaa(int a,int b) ---> aaa(int, int)
 *    
 *    
 *    
 *    
 */
class Sawon
{
	int sabun;
	String name;
	String dept;
	String loc;
	
	//기본생성자
	Sawon(){
//		=> 변수의 초기화가 동일
		sabun=1;
		name="홍길동";
		dept="개발부";
		loc="서울";
	}
	Sawon(int sabun1, String name1){
//		this(); //생성자 안에서 생성자 호출하는 구문임
				//단 이구문은 생성자 안에서만 사용가능, 가장 첫줄에 와야한다.
		new Sawon();
		sabun=sabun1;
		name=name1;
		
	}	
	Sawon(int sabun1, String name1,String dept1){
		sabun=sabun1;
		name=name1;
		dept=dept1;
		
	}
	Sawon(int sabun1, String name1,String dept1,String loc1){
		sabun=sabun1;
		name=name1;
		dept=dept1;
		loc=loc1;
		
	}
//	public Sawon(int sabun, String name, String dept, String loc) {
//		super();
//		this.sabun = sabun;
//		this.name = name;
//		this.dept = dept;
//		this.loc = loc;
//	}
}
//class Student{
//	int hakbun;
//	String name="홍길동";//heap
//	static String school_name;
//	//변수의 우선순위 = 지역변수가 우선순위 -> 멤버변수
//	
//	void display() {
//		String name="박문수";//stack
//		System.out.println(this.name);
//		//this로 전역변수를 갖고 올 수 있음(클래스 내부 변수 name)
//	}
//	
//	void aaa(){
//		hakbun=1;
//		name ="홍길동";
//		school_name="sist";
//		bbb();
//	}
//	static void bbb() {
//		school_name="sist2";
//		Student s=new Student();
//		//일반 인스턴스 변수는 static안에서 사용불가 할라면 따로 객체 만들고 해야함
//		s.hakbun =2;
//		s.name="심청이";
//		s.aaa();
//		
//	}
//}

public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		System.out.println(s1.sabun);
		System.out.println(s1.name);
		System.out.println(s1.dept);
		System.out.println(s1.loc);
		
		Sawon s2=new Sawon(2,"박문수");
		System.out.println(s2.sabun);
		System.out.println(s2.name);
		System.out.println(s2.dept);
		System.out.println(s2.loc);
		
		Sawon s3=new Sawon(3,"너구리","농심");
		System.out.println(s3.sabun);
		System.out.println(s3.name);
		System.out.println(s3.dept);
		System.out.println(s3.loc);
		
		Sawon s4=new Sawon(4,"전재준","카니발","부산");
		System.out.println(s4.sabun);
		System.out.println(s4.name);
		System.out.println(s4.dept);
		System.out.println(s4.loc);
		

	}

}
