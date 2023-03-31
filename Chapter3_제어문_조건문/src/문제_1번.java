//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.

import java.util.Scanner;
public class 문제_1번 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if (num1>=50)
		{
			System.out.println("입력하신 수는 50 이상입니다.");
		}
		else
		{
			System.out.println("50미만입니다.");
		}
		
		
		
	}
}
