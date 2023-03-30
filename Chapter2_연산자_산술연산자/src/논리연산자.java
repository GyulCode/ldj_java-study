// && ||
/*
 * (조건) && (조건)
 * -----    ----
 * 	 |       |
 * 	  -------
 * 		 |
 * 		결과
 * 
 * && -> 범위나 기간에 포함
 * 00 01 10 -> false
 * 11 -> true
 *  
 * || -> 범위나 기간을 벗어난 경우 : 행사
 * 00 -> false
 * 01 10 11 -> true
 * 
 * ->효율적 연산
 * () && ()
 *		 --  <-이부분을 연산 하는가 안하는가 
 * () || ()
 * --
 * true
 *       -- <-연산결과와 상관없이 true
 * int a=10;
 * int b=9;
 * 
 * (a<b) && ++b==a  //***이때 주의할건 a<b가 true라 뒤는 연산을 하지 않아 b=9가 된다.
 * 
 */
public class 논리연산자 {

	public static void main(String[] args) {
		
		//효율적 연산
//		 int a=10;
//		 int b=9;
//		 boolean bCheck =(a<b) || ++b==a;
////	 boolean cCheck =(a<b) && ++b==a;
//		 
//		 System.out.println(bCheck);
//		 System.out.println("b="+b);
		
//		 int a=100;
//		 int b=99;
//		 boolean bCheck = (a>b) && (b==a);
//		 System.out.println(bCheck);
//		 bCheck = (a>b) || (b==a);
//		 System.out.println(bCheck);
		
//		char c=(char)((Math.random()*26)+65);
//		boolean bCheck= c>'a' && c<='z';
//		System.out.println("c="+c);
//		System.out.println(bCheck);
		
//		char sex='M';
//		int score=87;
//		
//		boolean bCheck=(sex=='M' && score>=80);
////						true		true -> true
//		System.out.println(bCheck);
		
//		int a=10;
//		boolean bCheck = a%2==0 && a>2;
//		System.out.println(bCheck);
		
		int year=2024;
		boolean bCheck=((year%4==0 && year%100!=0) || (year%400==0));
		System.out.println(bCheck);
		
		
		
		
	}
}
