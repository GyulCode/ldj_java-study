//중첩조건문 -> 3개의 정수를 받아서 총점 / 평균 / 학점(A+,A0,A-)
//97 A+ / 94 A0 / ~ A-
import java.util.Scanner;
public class 조건문_5 {
	
	public static void main(String[] args) {
		int kor, eng, math, total;
		double avg=0.0;
		char score='F', option='-';
		
		//사용자 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("세개의 정수를 입력하세요: (90 90 80)");
		kor=sc.nextInt();
		eng=sc.nextInt();
		math=sc.nextInt();
		
		total=kor+eng+math;
		avg=total/3.0;
		
		int temp=(int)avg;
		if(temp>=90 && temp <= 100)
		{
			score = 'A';
			if(temp>=97 && temp <=100)
				option='+';
			if(temp>=94 && temp <97)
				option='0';
//			if(temp<94 )
//				option='-';
		}
		if(temp>=80 && temp < 90)
		{
			score = 'B';
		}
		if(temp>=70 && temp < 80)
		{
			score = 'C';
		}
		if(temp>=60 && temp < 70)
		{
			score = 'D';
		}
		if(temp < 60)
		{
			score = 'F';
			option =' ';
		}
		
		
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		System.out.println("총점: "+total);
		System.out.printf("평균%.2f: \n",avg);
		System.out.println("학점:"+score+option);
		System.out.println("배가 고프다");
		
		
		
	}

}
