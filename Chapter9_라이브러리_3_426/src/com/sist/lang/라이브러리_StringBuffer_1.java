package com.sist.lang;

/*
 * insert, delete -> 원본 변경
 * substring -> 원본유지
 */

public class 라이브러리_StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("홍길동입니다람쥐입니다");
		sb.delete(3, 6);// 종료 인덱스 마지막 전까지만 잘린다!
		System.out.println(sb.toString());
		sb.insert(3, "입니다");
		System.out.println(sb.toString());
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(3));


	}

}
