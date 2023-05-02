package com.sist.lib;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/*
 *    제네릭 (JDK1.5에 도입)
 *    -> JDK1.8 호환성 -> 17버전 , SpringFrame(14버전)
 *    
 *    1) 제네릭이 도입된 이유
 *    -> 컬렉션(ArrayList, Set,Map) -> 데이터형(매개변수, 리턴형) -> object
 *    반드시 형변환후에 사용 -> 방지
 *    데이터형을 통일화, 데이터형의 안정성 -> 데이터 고정
 *    데이터형을 명시화 -> 가독성이 좋다
 *       List<Object> list=new ArrayList<Object>(); -> 가독성이 낮다  // * <> 생략가능
 *       List<String> list=new ArrayList<String>();
 *    기본형은 사용할 수 없다 -> Wrapper
 *    -> 데이터형을 모르는 경우(와일드 카드) : ?사용
 *       List<?> list=new ArrayList<String>();
 *       <>안에는 사용자 정의 클래스 첨부가능
 *       Box<MovieVo> ...
 *       임시 제네릭
 *       T 임시데이터형 (클래스형 -> Type) -> 사용자 정의 제네릭
 *       E 임시 데이터형 (클래스형 -> Element) 요소
 *             ArrayList<E>
 *       K Key 클래스형
 *       V Value 클래스형
 *       MAP <K,V>
 *       
 *       ---------------------------------------------------------
 *       
 *       Iterator / ListIterator -> 데이터를 모아서 관리
 *       -------- hasNext(), next(), remove()
 *       -------- hasNext(), next(), remove(), hasPrevious()
 *       -------- 순서가 없는 경우 주로사용 set, map
 *       ArrayList -> for(index를 가지고 있다)
 *    
 *    
 */
import java.util.*;
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("딸기");
		list.add("바나나");
		//일반 출력 -> for each
		for(String f:list) {
			System.out.print(f+"  ");
		}
		System.out.println();System.out.println("------------Iterator----------");
		// 출력이 어려운 경우 단반향
		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		// 재출력이 안됨 1회성임
		System.out.println();System.out.println("------------재출력----------");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		*/
		
		// ListIterator -> list에서만 사용이 가능
		// List<?> list = new ArrayList<Integer>();
		// List<String> list1 = new ArrayList<String>();
		// list1=new ArrayList<Integer>(); 이미 타입을 고전시켜서 선언하면 변경이 안됨 
		// list=new ArrayList<String>(); 와일드 카드로선언시 자유롭게 변경가능 -> 실무에서는 수정이 자주 있어서 와일드카드 사
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
			
		}
		System.out.println("\n-----------------");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		*/
		ListIterator<Integer> it=list.listIterator();
		while(it.hasPrevious()) {
			System.out.println(it);
			System.out.println(it.previous()+" ");
		}
			
				
		

	}

}
