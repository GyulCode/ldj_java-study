//조건문 (if)

public class 비교연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1=(char)((Math.random()*26)+97);
		char c2=(char)((Math.random()*26)+97);
		
//		char c2=(char)(Math.random()*26)+97 ; //함수사용시 괄호 필수
		char c3=(char)24.56 +65;
		char c4= 'c'+4;
		
		System.out.println("test"+c3);
		System.out.println("test"+c4);
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		// 'A'=65 'a'=97
		
		boolean b1=c1==c2;
		System.out.println(b1);

		b1=c1!=c2;
		System.out.println(b1);
		
		b1=c1<c2;
		System.out.println(b1);
		
		b1=c1>c2;
		System.out.println(b1);
		
		b1=c1<=c2;
		System.out.println(b1);
		
		b1=c1>=c2;
		System.out.println(b1);

	}

}
