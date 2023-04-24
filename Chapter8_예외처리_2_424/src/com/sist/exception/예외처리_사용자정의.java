package com.sist.exception;
import java.util.*;

// 사용자 정의는 exception을 상속
class MyException extends Exception
{
	public MyException(String message) {
		super(message);
	}
}

public class 예외처리_사용자정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("접수를 입력: ");
		int num=sc.nextInt();
		try
		{
			if(num%2==0) {
				throw new MyException("짝수입니다!"); //사용자 정의는 반드시 예외를 임의로 발생시켜야 한다.!
			}
		}catch(MyException e) { //catch절안에는 exception안에 선언된것만 사용가능
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
