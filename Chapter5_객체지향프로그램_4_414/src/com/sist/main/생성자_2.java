package com.sist.main;
/*
 *    초기화
 *    1. 디폴트 값
 *       int=0; String =null;
 *    2. 명시적인 초기화 : 직접 값을 설정
 *       int a=10;
 *    3. 생성자를 통한 초기화
 *       class A{
 *          int a;
 *          A(){
 *          a=100; 생성자 안에서는 이렇게 가능
 *          }
 *       }
 *    4. 초기화 블럭
 *       class A
 *       {
 *          int a;
 *          {
 *             a=100; 
 *          }
 *          
 *       }
 *        
 *    ***초기화 순서
 *       디폴트 -> 명시적 -> 초기블록 -> 생성자
 *       int a=0 int a=10; int a100; int a=1000
 *    
 */
class Student{
	int hakbun=10;
	String name;
	Student(){
		System.out.println("생성자1");
		hakbun=1;
		name="홍길동";
	}
	Student(int h,String n){
		System.out.println("생성자2");
		hakbun=h;
		name =n;
	}

}

public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		Student s1=new Student();
		System.out.println(s1.hakbun);
		System.out.println(s1.name);
		//생성자 호출시 new를 앞에 붙여서 호출한다.
		//생성자는 1개도 없을때는 자동으로 호출되지만 한개라도 있으면 생성안됨 -> 유형에따라 만든다.
//		new Student();
		
		Student s2=new Student(2,"심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		Student s3=new Student(3,"강감찬");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);



	}

}
