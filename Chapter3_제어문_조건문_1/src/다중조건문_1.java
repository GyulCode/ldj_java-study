/*
 *   다중조건문:조건이 맞는 문장을 수행하고 종료 (한개 문장만 수행)
 *   		->여러개를 수행시킬라면 단일로 해야함
 *   형식)
 *       if(조건문){
 *       	구문 : 조건이 true 일경우 수행 -> 종료
 *       			  false
 *       			 아래로 진행
 *       }
 *       else if(조건문){
 *       	구문 : 조건이 true 일경우 수행 -> 종료
*       			  false
 *       			 아래로 진행
 *       }
 *       else if(조건문){
 *       	구문 : 조건이 true 일경우 수행 -> 종료
 *       			  false
 *       			 아래로 진행
 *       }
 *       else -> 생략가능
 *       {
 *       }
 */
// 사칙연산 처리
import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 정수 입력: ");
		int num1=sc.nextInt();
		System.out.println("두번째 정수 입력: ");
		int num2=sc.nextInt();
		System.out.println("연산자 입력(+, -, *, /): ");
		char op=sc.next().charAt(0);//문자열중 첫번째 있는 문자를 추출
		//+ - * / -> charAt(1) -> 자바의 단점 char는 받을 수 없다(문자열)
		//경우 + - * / % 다른문자 입력시 (else)
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(op=='/')
		{
			if(num2 == 0)
				System.out.println("0으로 나눌 수 없습니다!!");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
		}
		else
		{
			System.out.println("잘못된 연산자 입니다.");
		}


		
		
		
		
		
		
		
		
		
		
		
		
	}

}
