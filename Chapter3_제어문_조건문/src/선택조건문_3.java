// 중첩 -> if~else
// 사칙연산 이외의것이 입력되었을때 처리

import java.util.Scanner;
public class 선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요(10 20) : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("연산자 입력(+, -, *, /) : ");
		char op=sc.next().charAt(0);
		
		if(op=='+' || op=='-' || op=='*' || op=='/')
		{
			if(op=='+')
				System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			if(op=='-')
				System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			if(op=='*')
				System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			if(op=='/')
			{
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다.");
				else
					System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			}
				
			
		}
		else
		{
			System.out.println("잘못된 연산자 입니다 다시 입력하세요");
		}

	}

}
