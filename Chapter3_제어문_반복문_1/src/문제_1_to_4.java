//5,6,7,16 생략
import java.util.Scanner;
public class 문제_1_to_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//문제1
//		System.out.println("정수 입력 : ");
//		int a=sc.nextInt();
//		if(a>=0)
//			System.out.println(a+"은(는) 양수입니다.");
//		else
//			System.out.println(a+"은(는) 음수입니다.");
		//더 간결하게
//		a>0 ? "양수": "음수";
		
		//문제2
//		System.out.println("정수를 입력하세요 : ");
//		int a=sc.nextInt();
//		if(a%3==0)
//		{
//			System.out.println(a+"은(는) 3의 배수입니다.");
//		}
//		else
//			System.out.println(a+"은(는) 3의 배수가 아닙니다.");
		
		//문제3
		System.out.println("정수를 입력하세요: ");
		int a = sc.nextInt();
		
		if(a>=0)
			System.out.println(a);
		else
			System.out.println(-a);
		
		//문제4
		System.out.println("정수를 입력하세요: ");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0 || (year%400==0)) {
				System.out.println(year+"년은 윤년입니다.");
		}
		else
			System.out.println(year+"년은 윤년이 아닙니다.");
			
		

	}

}
