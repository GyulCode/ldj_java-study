// 3개의 정수를 받아서 총점 / 평균
import java.util.Scanner;
public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor=0, eng=0, math=0;
		
		while(true) {
			System.out.println("국어의 점수를 입력하세요(0~100): ");
			kor=sc.nextInt();
			if(kor<0 || kor>100) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
			
		}
		while(true) {
			System.out.println("영어의 점수를 입력하세요(0~100): ");
			eng=sc.nextInt();
			if(eng<0 || eng>100) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
			
		}
		while(true) {
			System.out.println("수학의 점수를 입력하세요(0~100): ");
			math=sc.nextInt();
			if(math<0 || math>100) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
			
		}
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f",avg);

	}

}
