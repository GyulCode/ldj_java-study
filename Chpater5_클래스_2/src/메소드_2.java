//ID, PWD를 받아서 로그인 처리
import java.util.Scanner;
/*
 *    리턴형은 경우의 수
 *    두개 -> boolean
 *    세개 -> int, String
 *           ID가 없는 경우 1번  ->  가독성으로 표기시 NO_ID
 *           ID존재 PWD 틀림 2번 -> NO_PWD
 *           로그인 3번  ->  
 *           ----------------
 *           1. 재사용
 *           2. 견고
 *           3. 가독성 -> 유지보수 신입들이 대부분 이거부터함
 */
public class 메소드_2 {
	
	static String isLogin(String id, String pwd) {
		String[] ids= {"hong","park","shim","lee","kang"};
		String[] pwds= {"1234","3456","4567","5678","6789"};
		String[] names= {"홍길","박문수","심청이","이순신","k강감찬"};
		
		//id검색
		int index=0;
		boolean bCheck=false;
		for(int i=0; i<ids.length;i++) {
			if(id.equals(ids[i])) {
				bCheck=true;
				index=i;
				break;
			}
		}
		
		String result="";
		if(bCheck==true) { //ID존재시 PWD검색
			if(pwd.equals(pwds[index])) {
				result=names[index];
			}
			else {
				result="NO_PWD";
			}			
		}
		else {//ID가 없을경우
			result="NO_ID";
		}
		
		return result;
	}
	
	static void process() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ID 입력: ");
		String id=sc.next();
		
		System.out.println("pwd 입력: ");
		String pwd=sc.next();
		
		String result=isLogin(id, pwd);
		if(result.equals("NO_ID")) {//id오류
			System.out.println("아이디가 존재하지 않습니다");
		}
		else if(result.equals("NO_PWD")) {//pwd 오류
			System.out.println("비밀번호가 틀렸습니다");
		}
		else { // 로그인 상태
			System.out.println(result+"님 로그인되었습니다.");
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		

	}

}
