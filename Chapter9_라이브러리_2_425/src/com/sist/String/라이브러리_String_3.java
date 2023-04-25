package com.sist.String;

import java.util.Scanner;

/*
 *    String은 문자열 마다 인덱스 번호를가지고 있다(0부터 시작) // 오라클은 1부터 시작
 *    자바  : ==    !=    substring(0,3)->012
 *    오라클 : =     <>    substr(1,5)
 *    JS   : ===   !==
 *    
 *    주요기능 310page
 *    1) 문자열에서 문자 한개 추출 -> char charAt(int index)
 *    
 */
public class 라이브러리_String_3 {
	public static void main(String[] args) {
		String msg="Hello Java";
//		for(int i=0;i<msg.length();i++) {
//			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
//		}
//		
		//코테 msg를 역순 출력해라
//		for(int i=msg.length()-1;i>=0;i--) {
//			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
//		}
		
		//알파벳 문자열을 입력받아서 대문자 몇개, 소문자 몇개를 출력하는 프로그램
		Scanner sc=new Scanner(System.in);
		System.out.println("문자입력 : ");
		String msg1=sc.nextLine(); //next는 공백이 들어가면 끊김 line은 공백도 인식
		int up=0, down=0;
		for(int i=0; i<msg1.length();i++) {
			
			char c=msg1.charAt(i);
			if(c>='A'&& c<='Z') {
				up++;
			}
			else if(c>='a'&&c<'z') {
				down++;
			}
		
		}
		System.out.println("대문자 갯수:"+up+" 문자 갯수:"+down);
		

		
	}

}
