package com.sist.util;

import java.util.StringTokenizer;

/*
 *   StringTokenizer : 문자열 분리
 *   1) split() -> 대체
 *   2) 빅데이터 / 네트워크 / 웹
 *   
 *   기능
 *      = 생성자
 *      StringTokenizer st=new StirngTokenizer("구분할 문자열",구분자)
 *      StringTokenizer st=new StirngTokenizer("구분할 문자열") // 공백으로 자름
 *      박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬
 *      
 *      = 기능
 *        1. countTokens() : 분리된 데이터 갯수
 *        2. nextToken() : 분리된 데이터 읽기 하나씩
 *        3. hasMoretokens() : 분리 갯수만큼 루프 수행
 *      
 */

public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬";
		StringTokenizer st=new StringTokenizer(s1);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		/*
		System.out.println(st.countTokens());
		int a=st.countTokens();
		for(int i=0; i<a;i++) {
			System.out.println(st.nextToken());
		}
		*/
		
		
				

	}

}
