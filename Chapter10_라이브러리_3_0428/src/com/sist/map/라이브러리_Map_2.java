package com.sist.map;

import java.util.*;

class A{
	public void execute() {
		System.out.println("A:execute() is Called...");
	}
}

class B{
	public void execute() {
		System.out.println("B:execute() is Called...");
	}
}

class C{
	public void execute() {
		System.out.println("C:execute() is Called...");
	}
}

// 클래스를 모아서 관리 Spring = 클래스 관리자
// 싱글턴 패턴 -> 메모리 누수현상을 방지 (한개의 객체로 재사용을 하는 프로그램)
// MAP -> 클래스 관리시에 주로 사용
class Container{
	Map map=new HashMap<>();
	public Container() {
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public Object getBean(String key) {
		return map.get(key);
	}
}

public class 라이브러리_Map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		A aa=(A)c.getBean("a");
		aa.execute();
		A bb=(A)c.getBean("a");
		bb.execute();
		System.out.println(aa);
		System.out.println(bb);
		// 메모리 누수 현상 방지 -> 주소값이 동일함
		

	}

}
