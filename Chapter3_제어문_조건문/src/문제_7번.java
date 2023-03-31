/*문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)
*/
import java.util.*;
public class 문제_7번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 3개 입력하세요 : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int sum = num1+num2+num3;
		double avg = (num1+num2+num3)/3.0;
		char grade='F';
		
		if(avg>=90)
		{
			grade='A';
		}
		else
		{
			if(avg>=80)
			{
				grade='B';
			}
			else
			{
				if(avg>=70)
				{
					grade='C';
				}
				else
				{
					if(avg>=60)
					{
						grade='D';
					}
				}
			}		
		}
		System.out.printf("총점은 %d이고 평균은 %f이고 학점은 %c입니다.",sum,avg,grade);



	}

}
