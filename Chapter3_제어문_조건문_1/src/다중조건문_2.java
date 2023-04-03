// 성적 계산 -> rank, 정렬
// 세개의 정수를 받아서 평균을 구한후 등급 구하기
// 다중 조건문 사용
/*
 *   >=90
 *   >=80
 *   >=70
 *   >=60
 *   --else
 *   
 */
import java.util.Scanner;
public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); //Scsanner에 마우스 갖다대면 f표시가 있음 final약어로 확장,수정 불가능하다는 뜻임
		//Sysyem.in = 키보드 입력을 받겠다 라는뜻
		//nextInt(), nextDoubel(), nextBoolean()
		//next() 문자열이다 -> char는 따로 존재하지 않음 next().char(0)
		//Scanner는 도스에서만 사용가능
		System.out.println("세개의 정수르 입력(10 20 30): ");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		
		System.out.println("총점: "+(kor+eng+math));
		System.out.printf("평균: %.2f\n",(kor+eng+math)/3.0);
		
		//학점 계산
		char score='F';
		if(avg>=90)
		{
			score='A';
		}
		else if(avg>=80)
		{
			score='B';
		}
		else if(avg>=70)
		{
			score='C';
		}	
		else if(avg>=60)
		{
			score='D';
		}
		else //생략가능
			score='F';
		System.out.println("학점: "+score);
	
		
		
		

	}

}
