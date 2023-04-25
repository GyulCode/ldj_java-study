package com.sist.lib;
//equals -> Object에서는 객체비교(주소) String 에서는 문자열(내용)

class Student2{
	private int num;
	private String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student2(String name) {
		this.name=name;
	}
	/*
	 * 재정의 하지 않을경우 ==과 동일하다 (주소값비교)
	 * Object -> equals는 샤용빈도가 많지 않다 -> 오버라이딩을 사용해야 한다
	 * String equals는 재정의 되어 있다
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2)
			return name==((Student2)obj).name; 
		//(()obj) .이 연산우선순위가 높아서 형변환을 ()로 먼저 해줘야 Student2가 갖고 있는 name에 접근가능	
		else
			return false;
		
//		return super.equals(obj);
	}
	
	
	
}

public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2("Hong");
		Student2 s2=new Student2("Hong");
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		if(s1==s2) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("다름");
		}
		
		// 주소 -> 
		if(s1.equals(s2)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다름");
		}
	

	}

}
