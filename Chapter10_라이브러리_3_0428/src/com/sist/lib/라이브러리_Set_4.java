package com.sist.lib;
import java.util.*;
public class 라이브러리_Set_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","이순신","강감찬","심청이","춘향이"
				,"이산","을지문적","박문수","이순신","강감찬","심청이"};
		// ArrayList 변환
		List list=Arrays.asList(names);
		System.out.println(list);
		
		// 중복 제거
		Set set=new HashSet<>();
		set.addAll(list);
		System.out.println(set);
		
		// 중복이 제거된 데이터 포장
		List list2=new ArrayList<>();
		list2.addAll(set);
		System.out.println(list2);
		

	}

}
