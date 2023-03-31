/*문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
*/
public class 문제_6번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c=(char)((Math.random()*58)+65);
		if(c>='A' && c<='Z')
		{
			System.out.println("입력문자는 대문자입니다."+c);
		}
		else
		{
			System.out.println("입력문자는 소문자입니다."+c);
		}

	}

}
