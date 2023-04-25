package com.sist.String;

import java.util.Scanner;

// charAt(0)
// 코테
// 문자입력 좌우 대칭인지 확인하는 프로그램
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String data="";
		while(true) {
			System.out.println("문자입력: ");
			data=sc.nextLine();
			if(data.length()%2!=0) { // 오류처리 구문 이게 핵심이었음
				System.out.println("문자가 짝수여야 합니다");
				continue;
			}
			break;
		}
		System.out.println("data="+data);
		boolean bcheck=true;
		int j=data.length()-1;
		for(int i=0; i<data.length()/2;i++) {
			if(data.charAt(i)!=data.charAt(j)) {
				bcheck=false;
				break;
			}
			j--;
		}
		if(bcheck==true) {
			System.out.println(data+"는 좌우대칭이다");
		}
		else {
			System.out.println(data+"는 좌우대칭이 아니다");
		}
	

	}

}
