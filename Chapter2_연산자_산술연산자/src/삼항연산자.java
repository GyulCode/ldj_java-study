/*
 *   (조건)?값1:값2
 *   ----
 *   true -> 값1
 *   false -> 값2
 *   ----> if ~else
 *   웹/게임
 *   --
 */

import java.util.Scanner; 
public class 삼항연산자 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int num=scan.nextInt();
		
		System.out.println(num%2==0?"짝수입니다.":"홀수입니다.");
		/*
		 * if(num%2==0) { System.out.println("짝수입니다."); }
		 * 
		 * else { System.out.println("홀수입니다."); }
		 */
		
		
	}


}
