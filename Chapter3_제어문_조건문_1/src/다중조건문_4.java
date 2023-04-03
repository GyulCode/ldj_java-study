//성적계산 -> A+(97이상), A0, A-
import java.util.Scanner;
public class 다중조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("3개의 정수를 입력해 주세요");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		
		int avg=(kor+eng+math)/3; //학점 계산용
		
		System.out.println("{국어점수 : "+kor);
		System.out.println("{영어점수 : "+eng);
		System.out.println("{수학점수 : "+math);
		
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균 : %.2f\n",(kor+eng+math)/3.0);
		
		//학점 옵션 +,0,-
		char score='F';
		char option='+';
		
		if(avg>=90) {
			score='A';
			if(avg>=97)
				option='+';
			else if(avg >=94)
				option='0';
			else
				option='-';
			}
		else if(avg>=80) {
			score='B';
			if(avg>=87)
				option='+';
			else if(avg >=84)
				option='0';
			else
				option='-';
			}
		else if(avg>=70) {
			score='C';
			if(avg>=77)
				option='+';
			else if(avg >=74)
				option='0';
			else
				option='-';

			}
		else
		{
			score='F';
			option=' ';
		}
		System.out.println("학점은 "+score+option);
			
	}

}
