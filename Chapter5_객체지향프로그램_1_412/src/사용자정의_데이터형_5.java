import java.util.Scanner;
class Sawon{

	//인스턴스 변수
	int sabun;
	String name;
	String dept; //부서
	String job; //직위
	String loc; //근무지
	long pay; //연봉
	
	//메모리 공간 1개만 설정 컴파일러에 의해 자동 생성
	//new없이 사용 가능***
	static String company;
	
}
public class 사용자정의_데이터형_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sawon.company="kkk";
//		클래스변수명.변수명 -> hong.company
//		클래스명.변수명 -> Sawon.company
//		공유변수, 클래스변수
		
		Sawon hong=new Sawon();
		hong.sabun=1;
		hong.name="홍단감자";
		hong.dept="농작물";
		hong.job="대리";
		hong.loc="서울";
		hong.pay=4500;
		hong.company="POTATO";
		
		Sawon shin=new Sawon();
		shin.sabun=2;
		shin.name="신라면";
		shin.dept="라면";
		shin.job="사원";
		shin.loc="서울";
		shin.pay=3300;
		shin.company="NongSim";
		
		Sawon park=new Sawon();
		park.sabun=1;
		park.name="박문수";
		park.dept="개발부";
		park.job="과장";
		park.loc="서울";
		park.pay=6200;
		park.company="NongSim";
		
		hong.company="Melon"; //저장공간이 1개만 있음
		shin.company="Paldo";
		park.company="OhDDuGi";
		System.out.println("회사명:"+hong.company);
		System.out.println("회사명:"+shin.company);
		System.out.println("회사명:"+park.company);
		
		hong.loc="부산";
		System.out.println("근무지: "+hong.loc);
		System.out.println("근무지: "+shin.loc);
		System.out.println("근무지: "+park.loc);
		
		
		//potato회사가 망했다 -> 회사명 변경 -> melon
		

	}

}
