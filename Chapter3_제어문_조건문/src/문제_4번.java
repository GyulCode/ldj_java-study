/*문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
         합계와 평균을 구해보자.
*/
import java.util.Scanner;
public class 문제_4번 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("세개의 정수를 입력하세요(10 20 30): ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		double avg=(num1+num2+num3)/3.0;
		int max=num1, sum=(num1+num2+num3);
		
		System.out.printf("합계는 %d이고  평균은 %.2f입니다.",sum,avg);
		System.out.println();
		
		if(max<num2)
		{
			max=num2;
		}
		if(max<num3)
		{
			max=num3;
		}
		System.out.println("최대값은 "+max);
		
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		System.out.println("최소값은 "+min);
		
		
//		if(max >= num2) {
//			if(num1 >= num3)
//			{
//				System.out.printf("최대값은 %d입니다.",max);
//			}
//		}
//		else
//		{
//			max=num2;
//			if(max>=num3)
//			{
//				System.out.printf("최대값은 %d입니다.",max);
//			}
//			else
//			{
//				System.out.printf("최대값은 %d입니다.",num3);
//			}
//		}
//				
		
	}
	

}
