//계산기 제작
import java.util.Scanner;
public class 메소드_2 {
	// +
	static int plus(int a, int b) {
		return a+b;
	}
	// -
	static int minus(int a, int b) {
		return a-b;
	}
	// *
	static int mul(int a, int b) {
		return a*b;
	}
	// /
	static String div(int a, int b) {
		String res="";
		if(b==0) {
			res="0으로 나눌 수 없습니다.";
		}
		else {
//			res=a/b; //정수형이라 안되나..?
			res=a+"/"+b+"="+(a/(double)b);
		}
		return res;
	}
	
	static void process() {
		Scanner sc=new Scanner(System.in);		
		System.out.print("첫번째 정수를 입력하세요: ");
		int a=sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int b=sc.nextInt();
		System.out.println("연산자 입력(+,-,*,/): ");
		String op = sc.next();//문자열 입력은 next
		
		int res=0;
		switch(op) {
		case "+":
			res=plus(a,b);
			System.out.printf("%d+%d=%d\n",a,b,a+b);
			break;
		case "-":
			res=minus(a,b);
			System.out.printf("%d-%d=%d\n",a,b,a-b);
			break;
		case "*":
			res=mul(a,b);
			System.out.printf("%d*%d=%d\n",a,b,a*b);
			break;
		case "/":
			String s=div(a,b);
			System.out.println(s);
			break;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
