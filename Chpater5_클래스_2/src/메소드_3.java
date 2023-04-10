//char를 한개 보내서 -> 대/소문자 -> boolean
import java.util.Scanner;
public class 메소드_3 {
	
	static String isAlpha(char c) {  //
		String result="";
		if(c>='A' && c<='Z') {
			result = "대문자 입니다";
		}
		else if(c>='a' && c<='z') {
			result = "소문자 입니다";
		}
		else
			result ="잘못된 입력입니다.";
		return result;
	}
	
	static void process() {
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳 입력: ");
		String s=sc.next();
		char c=s.charAt(0); // INDEX번째 문자 한개를 읽어와서 char로 변환
		
		String result = isAlpha(c);
		System.out.println(c+"는"+result);
		//가급적이면 결과값이 여러개인경우 -> 문자열로 처리
			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		

	}

}
