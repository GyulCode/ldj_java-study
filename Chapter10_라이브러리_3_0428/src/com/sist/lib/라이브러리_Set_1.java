package com.sist.lib;
import java.util.*;
class Person implements Cloneable{
	private String name;
	private int age;
	
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
	
	// Object가 갖고 있는 toString()의 오버라이딩
//	public String toString() {
//		return name+"("+age+")";
//	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
	}
	// 복제 -> 새로운 메모리를 만들어서 사용
	
	// 매개변수 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}

public class 라이브러리_Set_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Set set=new HashSet();
		Person p1=new Person("hong",25);
		Person p2=new Person("hong",25);
		
		System.out.println("p1 : "+p1.hashCode());
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2.hashCode());
		
		Person p3=p1; // 저장이 안됨 주소가 동일 집합에서는 동일한 주소값이라 그럼
		System.out.println("p3 : "+p3);
		Person p4 = (Person)p1.clone();  // 저장(새로운 메모리) // 예외처리를 안해서 오류, 형변환 오류
		System.out.println("p4 : "+p4);
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		
		set.add(p1);
		set.add(p2);
		set.add(p3); // p1과 같은 주소값이라 당연히 저장이 안됨
		set.add(p4);
		System.out.println(set);
				

	}

}
