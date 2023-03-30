/*
 * ---------------------------------------
 * 1.변수 , 2.연산자, 3.제어문, 4.메소드 ,5.클래스
 * ---------------------------------------실무
 * 이항연산자
 * 피연산자가 2개
 * ----------
 * ***1)산술연산자
 * 2)쉬프트연산자 (비트이동연산자) (<<, >>)
 * 3)비트연산자 (&,|,^)
 * ***4)비교연산자 (==, !=, <, >, <=, >=)
 * ***5)논리연산자 (&&(직렬), ||(병렬),) : 효율적인 연산(선행조건이 참일경우 뒤에꺼는 연산을 안함)
 * 		&&->true 
 * 		(조건)&&(조건)
 * 		----   ----
 * 		true	연산x
 * 
 *		||->true 		
 * 
 * ***6)대입연산자
 * 
 * page 38 -> 산술연산자
 * +,-,*,=> 형변환 ***자바에서 모든 연산은 같은 데이터형끼리만 연산이 된다
 * 			----
 * 			int + double
 * 			---double
 * 			double+double -> double
 * 			예) 10 + 20.5 = 30.5 (큰걸로 자동형변환)
 * 			예2) 'A'+10 = 75 ***char는 모든 연산자를 이용해서 연산처리시 자동으로 int형으로 된다
 * 			
 * 			***int이하(byte, short, char)데이터는 연산니 int형으로 계산된다.
 * 			예)char + byte = int형
 * 			5/2=2 -> 정수/정수=정수
 * 			*0으로 나누면 에러
 * 
 * 			***% : 결과값은 왼쪽 부호가 남는다.
 * 				5 % 2 = 1
 * 				-5 % 2 = -1
 * 				5 % -2 = 1
 * 				-5 % -2 = -1
 * 
 * 	프로그램의 기본(코테)
 * 	1) 오류처리
 *  예) 문자열 입력받아 좌우대칭
 *  
 * 증산시 관비 논삼대
 * 	
 */

//사용자가 정수 세개를 입력-> 결과값(1.총점,2.평균)
import java.util.Scanner; //외부에서 클래스를 불러옴
//Scanner -> 키보드로 부터 값을 입력받음(Scanf())
//BufferReader -> 예외처리를 따로 해줘야함 8장 전까지는 Scanner사용

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in); //클래스 선언
//				 	 ---new 동적메모리 할당
//								--------키보드입력
		System.out.println("국어점수 입력:");
		int kor=scan.nextInt();
//		System.out.println("kor="+kor);
		
		System.out.println("수학점수 입력:");
		int math=scan.nextInt();
//		System.out.println("math="+math);
		
		System.out.println("영어점수 입력:");
		int eng=scan.nextInt();
//		System.out.println("eng="+eng);
		
		//총점
		int total=(kor+math+eng);
		//평균
		double avg=total/3.0;
		//출력
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %03.2f ",avg); //%f, %d 0.2		
	}

}
