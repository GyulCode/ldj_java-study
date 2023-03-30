/*
 * 
 */
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=(int)(Math.random()*2); //0,1
		char c1=(char)((Math.random()*26)+65); //대문자
		char c2=(char)((Math.random()*26)+97); //소문자
		char res=no==0?c1:c2;
		System.out.println(res);
		System.out.println(res>='A' && res <='Z'?
				res+"는(은) 대문자입니다.":res+"는(은) 소문자입니다.");
		
		

	}

}
