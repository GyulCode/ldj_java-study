//import java.util.*; // <--이러면 오류인데 Package다음로 써야함
package com.sist.main; //한번만 사용
import java.util.*;
import java.io.*;
// 주의점 : 키워드는 사용할 수 없다 (대문자도 가능하나 -> 소문자 권장)
// 폴더 -> 관련된 java파일 저장 -> 찾기
// 다른 패키지의 클래스를 불러올때 반드시 import를 사용해야한다.
// 메소드 -> 접근방식.을 이용한다
// 인스턴스 메소드 -> static이 없는 메소드 -> 메모리에 따로 저장
// 클래스 분리


// import com.sist.main.클래스구성요소_1;
// package(폴더명)가 다르면 import로 가져와야함
// import com.sist.main.*;
// import java.util.*;

/*
 *    데이터 형
 *    데이터 처리
 *    조립 -> main(메인보드 역할)
 *    
 *    1. 메소드의 구서용소
 *    리턴타입(결과값) 메소드명(매개변수 -> 요청데이터) -> 선언부
 *    {
 *      구현부
 *      return 결과값;
 *    }
 *    리텁타입 : 사용자가 요청한 내용을 처리한후에 결과값의 데이터형
 *    1) 결과값이 있는 경우
 *    2) 결과값이 없는 경우 -> void
 *       리턴타입 >= return 값은 항상 일치하지는 않는다(권장은 일치)
 *    3) 리턴타입의 결과값은 1개만 받는다 여러개일 경우 배열, 클래스를 사용한다
 *    
 *    int[] display()
 *    
 */
class Student{
	int hakbun;
	String name;
	String sex;
	int kor, eng, math;
}

class StudentSystem{
	int getHakbun() {
		return 1;
	}
	String getName() {
		return "홍길동";
	}
	String getsex() {
		return "남자";
	}
	int getKor() {
		return 90;
	}
	int geteng() {
		return 80;
	}
	int getmath() {
		return 78;
	}

	
	Student getData() {
		Student s=new Student();
		s.hakbun=2;
		s.name="심청이";
		s.sex="여자";
		s.kor=90;
		s.math=70;
		s.eng=88;
		
		return s;
	}
	
}


public class 클래스구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		StudentSystem ss=new StudentSystem();
		
		/*
		 * 리턴형
		 * 
		 * 매개변수 : 사용자 요청값
		 * get view(int page)
		 * findData(String s)
		 * login(String id, String pwd)
		 * 
		 */
		
		hong.hakbun=ss.getHakbun();
		hong.name=ss.getName();
		hong.sex=ss.getsex();
		hong.kor=ss.getKor();
		hong.math=ss.getmath();
		hong.eng=ss.geteng();
		
		Student shim=ss.getData();
		Student park=ss.getData();
		System.out.println(park.hakbun);
		System.out.println(shim.hakbun);
		park.hakbun=333;
		System.out.println(park.hakbun);
		System.out.println(shim.hakbun);

	}

}
