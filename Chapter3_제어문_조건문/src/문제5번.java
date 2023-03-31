/*문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
         프로그램 작성
*/
import java.util.Scanner;
public class 문제5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int a=sc.nextInt();
		
		if(a==0) {
			System.out.println("a는 0입니다.");
		}
		else {
			if(a>0)
			{
				System.out.println("a는 양수입니다.");
			}
			else
			{
				 System.out.println("a는 음수입니다.");
			}			
		}
		


	}

}
