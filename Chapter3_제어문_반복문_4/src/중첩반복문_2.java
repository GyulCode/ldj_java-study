/*
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 *   
 *   ★★★★
 *   ★★★
 *   ★★
 *   ★
 *   
 *   출력 메커니즘 수열 공식법
 *   i=j   -> j<=i
 *   i+j=5 -> j=5-i
 *   
 *      ★
 *     ★★
 *    ★★★
 *   ★★★★
 *   ---------
 *    i    k   j  -> 관계식  i/k  i/j
 *   줄수  공백  별표          i+k=4 -> k=4-i
 *    1   3    1                i=j
 *    2   2    2
 *    3   1    3
 *    4   0    4
 *    
 *    
 *   ★★★★
 *    ★★★
 *     ★★
 *      ★
 *      
 *      ★
 *     ★★★
 *    ★★★★★
 *   ★★★★★★★    
 *  ★★★★★★★★★
 *  
 *  1  4
 *  2  2
 *  3  1
 *  4  0
 */
public class 중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=4;i++) {
//			for(int j=1; j<=i;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i=1; i<=4;i++) {
//			for(int j=1; j<=5-i;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=4;i++) {
//		for(int j=1; j<=5-i;j++) {
//			System.out.print(c++);
//		}
//		System.out.println();
//	}
		
//		char c='A';
//		for(int i=1; i<=4;i++) {
//			
//			for(int j=1; j<=i;j++) {				
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		for(int i=1; i<=4;i++) {
//			char c='A';
//			for(int j=1; j<=i;j++) {				
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		char c='A';
//		for(int i=1; i<=4;i++)
//		{
//			for(int j=1; j<=4;j++)
//			{
//				if(i==j)
//				{
//					System.out.print("#");
//				}
//				else
//				{
//					System.out.print(j);
//				}
//			}
//			System.out.println();
//		}
		
		
		char c='A';
		for(int i=1; i<=6;i++)
		{
			for(int j=1; j<=7-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
