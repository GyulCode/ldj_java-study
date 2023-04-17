package com.sist.main;
import static java.lang.Math.random;
/*
 *   import 패키지명.클래스명
 *   import 패키지명.*
 *   import static java.lang.Mthr.random;
 *   java.lang.* -> 자동으로 로딩이 된다, import를 사용하지 않는다
 *   -----------String, Math
 *   
 *   return; 자동설정 (생략이 가능) void문에서만
 *   return문을 만나면 메서드는 종료된다.(반복문도 마찬가지)
 */

public class 클래스_메소드 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*100)+1;
		System.out.println(a);
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==3) {
				return ;
			}
		}
	}

}
