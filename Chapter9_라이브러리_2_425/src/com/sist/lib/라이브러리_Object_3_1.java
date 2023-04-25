package com.sist.lib;
class Sawon2{
	private int sabun;
	private String name;
	//초기화
	
	public Sawon2(int a, String b){
		sabun=a;
		name=b;
		
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Student2) {
//			Student2 s=(Student2)obj;
//			return name == s.name();
//		}
//		else
//			return false;
////		Sawon2 s=(Sawon2)obj;
////		return name.equals(s.name) && sabun==s.sabun;
//	}
	
	public void print() {
		System.out.println("사번: "+sabun+", 이름: "+name);
	}
	
}

public class 라이브러리_Object_3_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1=new Sawon2(1,"hong");
		Sawon2 s2=new Sawon2(1,"hong");
		
		s1.print();

	}



}
