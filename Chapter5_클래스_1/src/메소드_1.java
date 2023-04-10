import java.util.Scanner;

/*
 *    메소드
 *    1) 구조화 프로그램(문장을 기능별로 나눠서 작업)
 *    2) 반복제거
 *    3) 메소드는 한개의 기능만 수행
 *    리턴형 : 처리후 결과값(한개만 설정이 가능)
 *    매개변수 : 사용자가 요청하는 값(여러개 보낼 수 있다)
 *      -> 3개이상이면 [], class
 *      
 *    형식)
 *       리턴형 메서드명 (매개변수)
 *       			 ------
 *       			 갯수와 상관없다
 *            -----
 *            한 자바파일안에 모든 메소드명은 달라야 된다(x)
 *            같은 메소드명이 있을 수 있다(매개변수가 틀리면 된다)=오버로딩
 *       ----
 *       요청 결과값(한개만) -> 여러개 : int[], class
 *       
 *       **사용자가 요청한값 = 매개변수를 받아서 처리후에 결과값을 보내주거나 화면에 출력
 *       요청값은 입력, 마우스클릭 등등 다양하다
 *       
 *       정수 두개를 입력하고 더한값을 받느다
 *       -> return a+b
 *       -> System.out.println("a+b"
 *       단은 보내고 해당단의 구구단을 출력
 *       -> 자체 출력이 편하다
 *       
 *       main메소드에서는 가급적이면 -> 연결 (변수 선언(x))
 */
// void 사용
// 구구단 -> 단을 입력 받아서 자체에서 출력이가능


public class 메소드_1 {
	static void gugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	static void process() {
		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력: ");
		int dan=sc.nextInt();
		
		gugudan(dan);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		

	}

}
