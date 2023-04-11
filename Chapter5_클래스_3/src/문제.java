/*
 *    method - 140page
 *    1) 메소드 형식 -> 기능처리
 *       -------
 *       웹 -> 화면변경
 *       ----------메뉴 클릭, 버튼 클릭, 이미지 클릭
 *       화면전환
 *       
 *       리턴형 메소드명(매개변수...) -> 선언부
 *       {
 *          구현부
 *       }
 *       
 *    = 리턴형(리턴타입, 자료형)
 *      처리후 결과값 한개만 전송이 가능하다
 *      ***여러개인경우 : 배열, 클래스
 *      ***한개인 경우 : 일반 기본형, String
 *      
 *      1) 결과값이 있는 경우
 *      int [] method()
 *      {
 *         content;
 *         return (int)10.5;
 *      }
 *      -> int a = method();
 *      오라클에서 데이터 읽기 -> 브라우저로 보낸다 
 *      자바 : 데이터 관리(오라클, 스프링)
 *      자바스크립트 : 이벤트 처리(브라우저)
 *      NodeJS/ ReactJS / VueJS / Ajax / Redux / Vuex / Jquery
 *      
 *      2) 결과값이 없는 경우
 *      void method()
 *      {
 *         return; //종료
 *         생략해도 컴파일러가 자동으로 추가
 *          import 추가
 *          import java.lang.* -> 자동으로 추가
 *                 System
 *                 string
 *                 Math
 *                 ----
 *      }
 *      
 *      = 메소드명 -> 식별자와 동일
 *                 길이에 제한이 없다 -> 의미를 부여
 *                 getName()  setName -> 이런식으로
 *      
 *      
 *      
 *      
 *      
 */
import java.util.Arrays;
import java.util.Scanner;
public class 문제 {
	static void process1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("0~32767사이의 정수를 입력하세요: ");
		int num = sc.nextInt();

		// while문 사용법
		int [] binary = new int[16];
		int index=15;
		while(true) {
			binary[index]=num%2;
			num=num/2;
			if(num==0) {
				break;
			}
			index--;
		}
		for(int i=0; i<binary.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
				
		// api 사용법
//		System.out.println(Integer.toBinaryString(user));
		


		
		
	}
	
	static void process2() {
		int [] arr=new int[5];
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬전:\n"+Arrays.toString(arr));
		
		//ASC
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("오름차:\n"+Arrays.toString(arr));
		
		//DESC
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("내림차:\n"+Arrays.toString(arr));
		
		
		
		
	}
	
	static void process3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("년도 입력: ");
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+"는(은) 윤년입니다");
		}
		else
			System.out.println(year+"는(은) 윤년이 아닙니다");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process2();

	}

}
