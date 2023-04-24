package com.sist.exception;
/*
 * 문자열로 2개의 정수를 받아서 -> 정수로 변환후에 배열제 저장
 * 배열 저장 : ArrayIndexOutOfBcoundsException
 * 나누기한 값을 구한다 : ArithmeticExcepton
 * 
 */
import java.util.*;
public class 예외처리_예외복구_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("1번 정수 입력 : ");
		String s1=sc.next();
		
		System.out.print("2번 정수 입력 : ");
		String s2=sc.next();
		
		int[] arr=new int[2];
		try
		{
			//정수변환 에러
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			
			//배열 저장
			arr[0] = n1;
			arr[1] = n2;
			
			//나누기 에러
			System.out.println(arr[0]/arr[1]);
			
		}catch(NumberFormatException e)
		{
			System.out.println("정수 변환 에러");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 범위 에러");
		}catch(ArithmeticException e)
		{
			System.out.println("0나누기 에러");
		}
			


	}

}
