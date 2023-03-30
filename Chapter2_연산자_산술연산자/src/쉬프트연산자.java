// <<, >> 쉬프트 연산자
/*
 * 10<<2
 * 1010(2진법) << 2 -> 1010(0)(0)=40
 * 
 * 7<<3
 * 111 -> 111000
 * 		  ------
 * 		  32 + 16 + 8 = 56
 * 
 * ***계산법
 * x<<y -> x*2^y
 * x>>y -> x/2^y
 * -------------
 * 9<<3 = 9*2^3
 * 
 * 10>>2
 * 10(1)(0) -> (0)(0)10
 * 	 -----제거 4가됨
 * 15>>3 -> 1이됨
 * 1111 -> 0001
 * 
 * 27 >> 3
 * 11(0)(1)(1) -> 11 
 * 
 */

public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10<<2);
		System.out.println(7<<3);
		System.out.println(15>>3);
		System.out.println(27>>3);

	}

}
