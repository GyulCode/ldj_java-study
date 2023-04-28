package com.sist.gn;
import java.util.*;

class Sawon{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public Sawon(int a, String b, String c, String d, int e) {
		sabun =a;
		name=b;
		dept=c;
		job=d;
		pay =e;
	}
	
	
}

class Human{
	public String name;
	public String addr;
}


public class 라이브러리_제네릭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sawon> list = new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개밟부","대리",4500));
		list.add(new Sawon(2,"홍길동","개밟부","대리",4500));
		list.add(new Sawon(3,"이순신","개밟부","대리",4500));
		list.add(new Sawon(4,"홍길동","개밟부","대리",4500));
		list.add(new Sawon(5,"홍길동","개밟부","대리",4500));
		
		//출력
		for(Sawon s:list) {
			System.out.println(s.getSabun()+" "
					+s.getName()
					+s.getDept()
					+s.getJob()
					+s.getPay());
		}
		
		// 삭제 -> remove
		// List -> 데이터 첨부 -> 데이터 읽기 -> 데이터 갯수
		// 수정, 삭제 -> 오라클
		list.remove(2);
		System.out.println("===========");
		for(Sawon s:list) {
			System.out.println(s.getSabun()+" "
					+s.getName()
					+s.getDept()
					+s.getJob()
					+s.getPay());
		}
		
		System.out.println("현재인원"+list.size());
		Sawon sa=new Sawon(6, "춘향이", "개발부", "사원", 4000); 
		list.set(2, sa);
		System.out.println("===========");
		for(Sawon s:list) {
			System.out.println(s.getSabun()+" "
					+s.getName()
					+s.getDept()
					+s.getJob()
					+s.getPay());
		}
		
		System.out.println("===========");
		System.out.println("현재인원"+list.size());
		list.clear();

		for(Sawon s:list) {
			System.out.println(s.getSabun()+" "
					+s.getName()
					+s.getDept()
					+s.getJob()
					+s.getPay());
//			add, size, get, clear  -> 웹에서는 이정도 
		}
		

	}

}
