import java.util.Scanner;
/*
 *   같은 문자열인지 확인
 *   -> 기본형 (==, !=)
 *   -> 문자열 비교(equals(), !equals())
 *   -> login -> id,password
 */
public class 문자열_3_equals_Ignore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="hong";
		final String PWD="H1234";
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디입력:");
		String id=sc.next();
		System.out.println("비밀번호 입력: ");
		String pwd=sc.next();
		// 이때 주의할점이 있다.
		// String -> 문자열 저장이 아니고 값이 저장된 메모리 주소가 저장된다!!! 그래서 ==으로 비교하면 오류가남
		// 이럴때는 equals()를 사용하면된다 메모리에 저장된 실제 문자열 비교 / 대소문자 구분
		// 대소문자를 구분하지 않는 기능 -- 검색 equalsIgnoreCase()사용
		// 로그인, 아이디 찾기, 아이디 중복체크, 비밀번호 찾기
		
		//로그인
		if(id.equalsIgnoreCase(ID) && pwd.equalsIgnoreCase(PWD)) {
			System.out.println(id+"님 로그인되었습니다");
		}
		else {
			System.out.println("아이디나 비밀번호가 틀립니다");
		}
			
		
		

	}

}
