/*
 *    자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복제어
 *    -> 변수/연산자/제어문
 *    		-------------메소드
 *     	 여러개
 *     ***자바에서 지원하는 모든 제어문은 밑에 있는 명령문만 제어 할 수 있다.
 *       if(조건)
 *         문장1 -> 제어가능
 *         문장2 -> if와 관련없음
 *       -> 한개이상 명령문을 수행시에는 반드시 { } 로 묶어준다.
 *       
 *   ->조건문
 *     =단일 조건문
 *       if(조건 -> 부정연산자 (!), 비교연산자, 논리연산자)
 *       {
 *         조건이 true일 경우에만 수행하는 문장을 작성
 *       }
 *     =선택 조건문
 *     =다중 조건문
 *   ->선택문
 *     
 *   ->반복분
 *     =while
 *     =do~while
 *     =for
 *       =일반 for
 *       =향상된 for -> for each(웹에서 핵심기술)
 *   ->반복제어문
 *     =break;
 *     =continue;
 *   ====================응용(연산자) -> 54page
 */
//조건문 (단일 조건문) -> 짝수/홀수

import java.util.Scanner;
public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num=scan.nextInt(); //5 입력
		if(num%2==0) {
			System.out.println(num+"는 짝수입니다.");
			System.out.println("num="+num); //if와는 관련없이 그냥 출력 {}지정이 안됨
		}
		if(num%2!=0) {
			System.out.println(num+"는 홀수입니다.");
			System.out.println("프로그램 종료!!"); //if와는 관련없이 그냥 출력 {}지정이 안됨
		}
		

	}

}
