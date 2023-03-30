/*
 * 단항연산자
 * a++ a-- ++a --a
 * ->
 * 산술연산자 (쉬프트, 비트)
 * ->
 * 대입연산자, 삼항연산자
 * ----------------
 * <- 연산방향
 * int a=10
 * int a=b+c
 * ----------------> () : 최우선순위
 * 
 * 왼쪽에 오른쪽으로
 * 비교연산자 -> 결과값(boolean) -> true/false
 * == 같다
 * != 같지않다
 * < 작다   (왼쪽기준) a<b 
 * > 크다
 * <= 작거나 같다
 * >= 크거나 같다
 * 
 * 7==6 false
 * 7!=6 true
 * -----byte, int, short , long, double, float, boolean, char
 * "a"=="a" -> equals() ***
 * 'A'<'B' -> 65<66 -> true
 * 
 * 
 * 
 */

public class 비교연산자 {
	
	public static void main(String[] args) {
		
		int a=(int)(Math.random()*100)+1;
		/*
		 * (int)(Math.random()*100)+1;
		 * 		------------
		 * 			1(0.0~0.99)
		 * 						-----
		 * 						2(0.0~99.0)
		 * ----
		 *  3 0~99
		 *  							---
		 *  							1~100
		 * 
		 */
		
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//1. ==
		boolean b1=a==b;
		System.out.println("a==b : "+b1);
		
		//2. !=
		boolean b2=a!=b;
		System.out.println("a!=b : "+b2);
		
		//3. <
		boolean b3=a<b;
		System.out.println("a<b : "+b3);
		
		//4. >
		boolean b4=a>b;
		System.out.println("a>b : "+b4);
		
		//5. <=
		boolean b5=a<=b;
		System.out.println("a<=b : "+b5);
		
		//6. >=
		boolean b6=a>=b;
		System.out.println("a>=b : "+b6);
		
		
	}

}
