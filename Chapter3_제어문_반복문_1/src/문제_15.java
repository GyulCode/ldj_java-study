import java.util.Scanner;
public class 문제_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("두자리 정수를 입력하세요 (10~99)");
		int a=sc.nextInt();
		
		//오류처리
		if(a>=10 && a<=99)
		{
			if(a%11==0) {
				System.out.println("10의 자리와 1의 자리가 같습니다");
			}
			else
				System.out.println("자리가 같지 않습니다");
		}
		else
			System.out.println("잘못된 입력입니다!");
	
		

		
		
		
	}
}
