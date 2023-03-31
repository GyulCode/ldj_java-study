/*문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!*/
//오류처리할떄 주로 사용한다 if문!
import java.util.Scanner;
public class 문제_3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학년을 입력하세요 : ");
		int grade=sc.nextInt();
		if(!(grade>=1 && grade<=4))
		{
			System.out.println("학년입력 오류입니다.");
		}
		else
		{
			System.out.println("점수를 입력하세요 : ");
			int score=sc.nextInt();
			
			if(grade==4) {
				if(score>=70)
				{
					System.out.println("4학년 기준 합격입니다.");	
				}
				else
				{
					System.out.println("4학년 기준 불합격 입니다.");
				}
			}
			else
			{
				if(score>=60)
				{
					System.out.println("합격입니다.");	
				}
				else
				{
					System.out.println("불합격 입니다.");
				}
			}
		}	
	}

}
