package com.sist.gn;
/*
 *   제네릭
 *   -> 데이터형을 통일화
 *   -> 라이브러리의 데이터형을 변경할 경우에사용
 *      -------- 매개변수 / 리턴형(Object)
 *               -> 프로그램 개발시마다 형변환을 해야된다
 *               -> 프로그램에 필요한 데이터형으로 변경
 *      데이터를 저장할때는 한가지 데이터형만 저장해야 사용하기 쉽게
 *      프로그램 -> 데이터를 통일한다
 *      -> 사용방법 -> <>
 *      List<클래스명> -> Object -> 지정한 클래스명으로 변경 
 *      
 *      T, E, K, V
 *      T -> type (클래스형)
 *      E -> Element
 *      K -> Key
 *      V -> value
 *      Map(K,V)
 *      Map<String, String>
 *      List<E>
 *      List<Integer>
 *           -------기본형은 사용이 불가능, 클래스형만 사용가능 
 *                  ---- 그래서 Wrapper 사용
 *                  
 *                  
 *      msi, 출석률, 
 */
import java.util.*;
class Box<T>{
	T t; // 타입 미지정시 Object로 변형

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class A{
	
}

public class 라이브러리_Collcection {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		List<A> list2=new ArrayList<A>();
		list.add("사과");
		list.add("배");
		list.add("딸기");
		
		for(Object obj:list) {
			String f=(String)obj;
			System.out.println(f);
		}
		list.add("1");
		for(Object obj:list) {
			String f=(String)obj;
			System.out.println(f);
		}
		
		
		
	}

}
