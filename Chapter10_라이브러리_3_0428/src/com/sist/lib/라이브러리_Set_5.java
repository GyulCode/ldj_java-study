package com.sist.lib;
/*
----------필수기능--------
로그인
목록출력
상세보기
검색
뉴스검색
채팅기능

-------서브기능---------
쪽지 보내기
귓속말 기능
방만들기 기능(방에서 채팅 한개
정보 보기 기능
회원 가입
일대일 채팅
나머지는 2개설정

 */

import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class 라이브러리_Set_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set=new HashSet<>();
		for(int i=0; i<10; i++) {
			int r=(int)((Math.random()*100)+1);
			set.add(r);
		}
		System.out.println(set);

		// 50보다 작은수
		for(Object obj:set) {
			int a=(int)obj;
			if(a<50) {
				System.out.print(a+" ");
			}
		}
		System.out.println();
		
		// 50보다 작은수
		for(Object obj:set) {
			int a=(int)obj;
			if(a>=50) {
				System.out.print(a+" ");
			}
		}
		
		System.out.println();
		System.out.println("===============");
		// 1. 정렬
		// 2. 검색이 빠르다
		
		TreeSet tset=new TreeSet<>();
		for(int i=0; i<10; i++) {
			int r=(int)((Math.random()*100)+1);
			tset.add(r);
		}
		System.out.println(tset);
		
		System.out.println("50보다 작은 수 : "+tset.headSet(50));
		System.out.println("50보다 큰 수 : "+tset.tailSet(50));
		
		System.out.println("===============");
		// 50이상
		
		for(Object obj:tset) {
			int a=(int)obj;
			if(a>=50) {
				System.out.print(a+" ");
			}
		}
		
		System.out.println();
		// 50이하
		for(Object obj:tset) {
			int a=(int)obj;
			if(a<50) {
				System.out.print(a+" ");
			}
		}
		

	}

}
