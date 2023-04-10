/*
 *    메소드 : 클래스의 구성 요소(동적)
 *    1) 특정 기능을 수행하는 명령문(연산자, 제어문)의 집합
 *    2) 한가지 기능만 수행 할 수 있게 한다
 *      예)
 *         댓글
 *         -----------댓글(class)
 *         댓글 목록 출력
 *         댓글 쓰기
 *         댓글 수정
 *         댓글 삭제
 *         -----------
 *         게시판(class)
 *         -----------
 *         글쓰기 - 메서드
 *         목록출력
 *         상세보기
 *         수정
 *         삭제
 *         -----------
 *    3) 메소드 구성요소
 *       선언부
 *       void display()
 *       구현부
 *       {
 *          처리구문
 *       }
 *       
 *       선언부
 *       [접근지정어][옵션] 리턴형 메소드명(매개변수...)
 *       					------
 *       					알파벳, 한글로 시작(알파벳은 대소문자 구분)
 *                          숫사사용 가능 (앞에x)
 *                          키워드x, 특수문자 _ $만 가능, 공백x
 *                          ***소문자로 시작한다
 *                     ----
 *                     기본형, 배열, 클래스
 *       --------
 *       public / protected / default / private
 *       
 *       static int add(int a, int b)
 *       {
 *          return a+b;
 *       }
 *       
 *       호출
 *       넘겨준 데이터를 받아서 저장
 *       int result=add(10,20) -> 30
 *       메소드 호출시에는 처음부터 끝까지 메소드구문을 수행한후 호출위치로 돌아온다
 *       
 *       메소드 만드는 방법
 *       리턴형과 매개변수의 필요 유무를 따져서 만든다 -> 정답은 없음
 *        o      o
 *        o      x
 *        x      o
 *        x      x
 * 
 */
import java.util.Scanner;
public class 문제1 {
	
	//1-1번
	static boolean idCheck(String id) {
		boolean chk=false;
				
		
		return chk;
	}
	
	//1-2번
	static String[] postfind(String add) {
		String[] dong = {""};
		
		return dong;
		
	}
	
	//1-3번
	static void gugudan() {
		
	}
	
	//2-1번
	static void method1() {
		for(int i=1; i<=10; i++) {
			System.out.print(i +" ");
		}
	}
	
	//2-2번
	static int sum() {
		int total=0;
		for(int i=1; i<=10; i++) {
			total+=i;			
		}
		
		return total;
	}
	
	//2-3번
	static int sum_N(int num) {
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
		int total=0;
		for(int i=1; i<=num; i++) {
			total+=i;			
		}
		return total;
	}
	
	//2-4번
	static double div(int num1, int num2) {
		return num1/(double)num2;
	}
	
	//2-5번
	static String Method5(String s) {
		String result="";
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				result+=s.charAt(i);
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				result+=(char)(s.charAt(i)-32);
			}
		}
		return result; 
	}
	
	//2-6번
	static void Method6(String s) {
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
//		StringBuffer sb=new StringBuffer();
//		sb.append(s);
//		String ss=sb.reverse().toString();
//		System.out.println(ss);
//		스트링 버퍼 사용
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a2=sum();
		System.out.println(a2);
		
		int a3=sum_N(100);
		System.out.println(a3);
		
		double a4=div(a3, a2);
		System.out.printf("%.2f\n",a4);
		
		String a5="Hello Java";
		String s5=Method5(a5);
		System.out.println(s5);
		
		Method6(a5);
		

	}

}
