package com.sist.lib;
// toString() : 객체를 문자열화 시킨다
/*
   (String)
   .toString()
   --------------- 문자열 변환
   1) 명시적 -> System.out.println(a.toString()) -> a의 주소값 출력
   2) 묵시적 -> System.out.println(a) -> toString() 생략되어 있음
   
   
   
 */
class Member{
	private int mno;
	private String name;
	
	public Member(int m, String n) {
		mno=m;
		name=n;
	}


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "회원번호:"+mno +", 이름"+name;
	}
	
}


public class 라이브러리_Object_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(1,"Park");
		Member m2=new Member(1,"Sim");
		
		System.out.println("묵시적:"+m1);
		System.out.println("명시적:"+m1.toString());
		
		System.out.println("묵시적:"+m2);
		System.out.println("묵시적:"+m2.toString());
		
		

	}

}
