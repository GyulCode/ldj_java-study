package com.sist.util;
import java.util.*;
public class 라이브러리_Random_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] alpha=new char[10];
		Random r=new Random();
		for(int i=0; i<alpha.length;i++) {
			alpha[i]=(char)(r.nextInt(5)+65);
			if(alpha[i]=='E') {
				alpha[i]='F';
			}
			System.out.println((i+1)+"번 학생의 성적: "+alpha[i]);
		}
		System.out.println(Arrays.toString(alpha));
		Arrays.sort(alpha);
		System.out.print(Arrays.toString(alpha));
				

	}

}
