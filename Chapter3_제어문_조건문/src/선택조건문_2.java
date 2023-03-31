// 한개의 점수를 받아서 60이상 합격 아니면 불합격
import java.util.Scanner;
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 60)
		{
			System.out.println(score+"점 합격입니다.");
		}
		else
		{
			System.out.println(score+"점 불합격입니다.");
		}
			
		

	}

}
