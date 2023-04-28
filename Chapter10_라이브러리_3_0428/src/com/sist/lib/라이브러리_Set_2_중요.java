package com.sist.lib;
import java.util.*;

class Student{
	private String name;
	private int age;
	// 데이터 보호 ㅇㅇ 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//------------------------------Override--------------------------
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Student) {
//			Student s=(Student)obj;
//			return name.equals(s.name) && age==s.age;
//		}
//		return false;
//
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name+"("+age+")";
//	}
	
	//--------------------------------생성자--------------------
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}

public class 라이브러리_Set_2_중요 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 비교 -> 메모리 주소, 실제 저자된 값
		// ----------기본    ----------재정의(오버라이딩)
		Set set=new HashSet<>();
		Student s1=new Student("Hong", 35);
		Student s2=new Student("Hong", 35);
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2)) { //equals 주소 비교 오버라이딩 해야 내용비교
			System.out.println("s1==s2");
		}
		else {
			System.out.println("s1 != s2");
		}
			
		
		
		set.add(new Student("홍길동",25));
		set.add(new Student("홍길동",25));
		// equals로 내용을 조회하도록 오버라이딩 해둬서 하나만 저장됨
		System.out.println(set);

	}

}
