//break / continue
import java.util.Scanner; 
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세자리 정수 입력
		// 조건 : 0을 포함 할 수 없다.
		// 조건 : 같은 수를 입력 할 수 없다
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("세자리 정수를 입력:");
			int input = sc.nextInt();
			if(input<100 ||input>999) {
				System.out.println("잛못된 입력입니다.");
				continue; //while 문 처음으로 이동
			}
			//
			int a=input/100;
			int b=(input%100)/10;
			int c=input%10;

			//0을 포함 할 수 없다.
			if(a==0 || b==0 || c==0) {
				System.out.println("0은 사용할 수 없어요");
				continue;
			}
			if(a==b || b==c || c==a) {
				System.out.println("같은수는 사용할 수 없어요");
				continue;
			}
			
			System.out.println("input="+input);
			System.out.println("a="+a+" b="+b+" c="+c);
			
			//정상수행시
			System.out.println("입력값: "+input);
			break;
			
		}
		//

	}

}
