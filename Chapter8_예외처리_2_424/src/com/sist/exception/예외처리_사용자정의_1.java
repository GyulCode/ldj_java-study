package com.sist.exception;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.*;
/*
 *    자신 -> 객체호출 this, 생성자 this()
 *    상위클래스 -> 객체 호출 super, 생성자 super()
 *    
 *    
 */

class MyRuntimeException extends RuntimeException{
	public MyRuntimeException(String msg) {
		super(msg);
	}
	
}
public class 예외처리_사용자정의_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("점수 입력");
			int score=sc.nextInt();
			if(score<0) {
				throw new MyRuntimeException("음수는 사용할 수 없습니다");
				// 장점 -> 에러 위치 확인이 가능
				// 사용자 정의 클래스를 호출할때사용
			}
			System.out.println("점수는 "+score+"점 입니다");
					
			
		} catch (MyRuntimeException ex) {
			System.out.println(ex.getMessage());
			System.out.println("------------------에러 발생위치 확인-----------------");
			 ex.printStackTrace();
		}

	}

}
