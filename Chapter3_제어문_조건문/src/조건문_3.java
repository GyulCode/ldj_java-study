//3개의 정수를 입력받아서 총점/평균/학점

import java.util.Scanner;
public class 조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int kor, eng, math;
		System.out.println("3과목의 점수를 입력하시오 국,영,수(80 80 90): ");
		kor=sc.nextInt();
		eng=sc.nextInt();
		math=sc.nextInt();
		
		//결과값 출력
		int total = kor+eng+math;
		double avg=total/3.0;
		//학점
		int temp=(int)avg;
		char score='A'; //독립적인 문장 -> if를 모두 수행해야함(속도가 늦음)
		
		if(temp>=90 && temp<=100)
			score='A';
		if(temp>=80 && temp<90)
			score='B';
		if(temp>=70 && temp<80)
			score='C';
		if(temp>=60 && temp<70)
			score='D';
		if(temp<60)
			score='F';
		
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%2.2f\n",avg);
		System.out.println("학점:"+score);

	}

}
