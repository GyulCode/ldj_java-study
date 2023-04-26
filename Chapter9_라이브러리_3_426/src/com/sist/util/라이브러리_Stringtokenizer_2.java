package com.sist.util;

import java.util.StringTokenizer;

//   네트워크
/*
 *      String s="red|green|blue|black|yellow";
 *      -> split, StringTokenizer
 *      -> StringTokenizer st=new StringTokenizer(s,"|");
 *         String[] colors=s.split("\\|")  // 정규형이 아니라 \\안붙여두된다
 *                  ->원형 : split(String regex)
 *         StringTokenizer st=new StringTokenizer(s,"|");         
 *         
 *         ----메모리 구조-----
 *         before First
 *         red -> nextToken()
 *         green -> nextToken()
 *         ...
 *         yellow -> nextToken()
 *         after last -> nextToken() -> false(읽기 종료)
 *         
 *         ***갯수가 초과되면 에러
 *         
 *      
 *      
 */

public class 라이브러리_Stringtokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="red|green|blue|black|yellow";
		StringTokenizer st=new StringTokenizer(s,"|");
		
		while(st.hasMoreTokens()) { // 갯수를 모를땐 hasmore이 더 편함
			System.out.println(st.nextToken());
		}
		

	}

}
