/*
 *    54page
 *    단일 조건문
 *    
 *    1.형식
 *    if(조건문)
 *    {
 *      수행문 -> 조거문이 true일 경우 수행
 *    }
 *    -> {}이 없는경우 한개만 실행***
 *    
 *    2.if 중첩 조건문
 *    if(조건) ----> 한줄로 표현시if(조건 && 조건)
 *    {
 *      if(조건)
 *      {
 *        
 *      }
 *    }
 */
//계산기 만들기(사칙연산) -> 1.정수 두개, 2.연산자 

import java.util.Scanner;
public class 조건문_4 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 : ");
		int num1=scan.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		int num2=scan.nextInt();
		System.out.println("연산자를 입력하세요(+,-,*,/) : ");
		char op=scan.next().charAt(0); //문자열을 받아서 char를 한개 가지고 온다.
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("op="+op);
		
		//계산기
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		if(op=='/')
		{
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다.");
			if(num2!=0)
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			
		}
				
	}
	

}
