/*
 *   대입연산자
 *   연산순서 (좌->우) a+b+c...
 *   우->좌 a = b + 13 -> 오른쪽 연산이 끝나면 왼쪽 변수에 대입
 *   
 *   =
 *   (복합대입연산자)
 *   ***+= -> a+=b -> a=a+b
 *   ***-=
 *   *=
 *   /=
 *   %=
 *   <<=
 *   >>=
 *   &=
 *   |=
 *   ^=
 *   ---------
 *   
 *   +=
 *   ---
 *   int a=10;
 *   a+=10; ==> a+a10 -> 20
 *   
 *   
 */
public class 대입연산자 {
	
	public static void main(String[] args) {

		int a=10;
		a+=3;
		System.out.println(a);
		
	}

}
