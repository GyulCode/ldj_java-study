import java.util.Arrays;
import java.util.Scanner;

/*
 *   클래스 구성요소
 *   변수 : 프로그램 종료시까지 유지하는 변수(전역변수, 멤버변수)
 *         메소드 안에서 사용되는 변수(지역변수)
 *         기본형 / 참조형
 *         ----
 *         정수 : int, long 실수 : double  논리 : boolean 
 *         참조형 : 데이터가 여러개(메모리 주소를 이용해서 연결) 배열(1차원)-같은크기 데이터형, 클래스-다른 크기의 데이터형
 *   생성자 : 변수에 초기화, 클래스를 메모리에 저장시 사용
 *   메소드 : 기능을 수행, 다른 클래스와 연결 메세지***
 *          ----연산자/ 제어문(명령문)
 *          명령문의 집합
 *          -> 1 다른 클래스와 통신
 *          -> 2 재사용 목적 -> 객체지향
 *   ----------------------------------------
 *   1. 메소드 형식
 *      [접근지정어][옵션]리턴형 메소드명(매개변수...)
 *      public static/final/abstract
 *   2. 메소드 종류
 *   	리턴형     매개변수
 *      ---------------
 *        o        o
 *      String substring(int a)
 *      String replace(String s1, String s2)
 *      ---------------
 *        o        x
 *      String trim()
 *      double random()
 *      ---------------
 *        x        o
 *      String substring(int a)
 *      String replace(String s1, String s2)   
 *        
 *   3. 메소드 구성요소
 *      = 리턴형(처리 결과물)->화면출력(요구에 맞는 데이터)
 *        여러개는 배열,클래스로 - 검색, 상세보기 등등
 *        한개인 경우 기본형- 최대값, 최소값, 합, 평균
 *         
 *      = 매개 변수( 사용자 요청 값) : 3개이상 배열, 클래스
 *      
 *      = 메소드명
 *        알파벳으로 시작(대소문자 구분)
 *        숫자 멘앞에 빼고 사용가능
 *        특수문자 사용이 가능( _, $ )-> 
 *        _ : 주로 임시메소드 _main()
 *        _ : 단어가 2개이상 board_write(), board_insert 등등
 *        키워드 사용 금지
 *        약속 : 소문자 시작
 *        *** 변수는 같은 이름으로 사용이 불가능하다
 *        *** 메소드는 같은 이름을 사용할 수 있다.(오버로딩)-> 메소드 이름은 같으나 매개변수의 갯수나 자료형 또는 리턴형이 다름 / 나중에 오버라이딩 조심)
 *        *** 매개변수(갯수를 알지못할때)
 *            1. 장바구니 -> 가변매개변수
 *               생긴방식(int...arg) / (Object...arg)
 *   
 *         
 *   
 */
public class 메소드_1 {
	//사용자가 원하는 갯수만큼 난수 발생 (1~100)
	//사용자 -> 갯수(매개변수)
	//리턴형 -> 배열
	//예약 가능날 / 불가능날
	static int[] rand(int count) {
		int[] arr = new int[count];
		for(int i= 0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// void java.io.PrintStream.println() - 라이브러리의 메소드는 원형 확인
		// printf(String format, Object... args) - ...구조 확인 입력 값의 수를 모를때 유용
		Scanner sc=new Scanner(System.in);
		System.out.println("난수 갯수 입력: ");
		int count = sc.nextInt();
		int[] arr=메소드_1.rand(count); //자기 클래스에서는 메소드_1 생략가능
		// 메소드 호출
		// (메소드명(매개변수값)) -> 자신 클래스에서 호출
		// 클래스명.메소드명(매개변수) -> 타 클래스에서 호출시
		System.out.println(Arrays.toString(arr));
		
		

		

	}

}
