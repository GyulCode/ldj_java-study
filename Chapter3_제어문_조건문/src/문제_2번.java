//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.

import java.util.Scanner;
public class 문제_2번 {
	
	public static void man(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int a=sc.nextInt();
		
		if(a%3==0)
		{
			System.out.println("3의 배수 입니다.");
		}
		else
		{
			System.out.println("3의배수가 아닙니다.");
		}
				
		
	}

}
