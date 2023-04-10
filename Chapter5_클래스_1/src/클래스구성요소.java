/*
 *    자바형식
 *    -----
 *    package 클래스의 위치 -> 한번 사용
 *    import 외부 라이브러리 불러오기 -> 여러번 사용이 가능
 *    public class ClassName
 *    {
 *       -----------------------------
 *       멤버 변수
 *       = 인스턴스 -> new 사용할때마다 메모리가 따라 생성
 *       = 정적변수(공유변수) -> 메모리가 한개만 생성
 *       -----------------------------
 *       생성자 : 메모리 할당시 호출되는 메소드
 *              멤법 변수에 대한 초기화를 담당
 *       -----------------------------
 *       메소드 : 특정작업을 수행하는 명령문의 집합
 *       -----------------------------
 *       main() : 프로그램의 시작점
 *       -----------------------------
 *       
 *       -----------------------------
 *    }
 *    oop답게 변환 (객체지향프로그램)
 *    1) 데이터 보호 (캡슐화)
 *    2) 재사용 (상속/포함)
 *    3) 수정, 추가(다형성) -> 오버라이딩/오버로딩
 *    
 *    클래스의 종류(추상클래스/인터페이스)
 *    예외처리
 *    ----------------------------------자바언어의 기본
 *    라이브러리 : 사용자정의, 자바에서 지원, 외부업체에서 지원(Jsoup 등..)
 *    
 *    메소드 기초
 *    --------
 *    메소드 : 한개의 기능을 수행할 목적
 *         1.메소드 제작 목적
 *           = 재사용(다른 클래스에서 사용하기 위해 만든다)
 *           = 중복된 코드를 제거
 *           ex) DB연결
 *              ---------------- 목록
 *              오라클 연결
 *              목록에 출력할 데이터를 읽기
 *              오라클 닫기
 *              ---------------- 데이터 삽입
 *              오라클 연결
 *              데이터 추가
 *              오라클 닫기
 *              ---------------- 데이터 갱신
 *              오라클 연결
 *              데이터 갱신
 *              오라클 닫기           
 *              ---------------- 데이터 삭제
 *              오라클 연결
 *              데이터 삭제
 *              오라클 닫기
 *              ----------------
 *              연결, 닫기가 반복되고있다 이부분을 메서드화 시킨다
 *           = 구조화된 프로그램 -> 단락을 나눠서 처리(에러 처리)
 *           
 *         2. 메소드 형식
 *            선언부
 *            public static void main(String[] arg)
 *            구현부
 *            {
 *            }
 *         3. 메소드 구성 요소
 *            결과값 메소드명(매개변수)
 *            ---1개      -----여러개 사용가능
 *            
 *            -> 사용자의 요청값을 받아서 처리 결과를 넘겨준다
 *               -----------매개변수     ----리턴형
 *            예) 로그인
 *               사용자 요청값 : id, pw
 *               결과값 : 로그인 여부(boolean)
 *               boolean isLogin(String id,String pwd)
 *            예) + 연산
 *               사용자 요청값(매개변수) : 사용자가 입력한 정수 2개
 *               결과값 : 정수 2개를 더한값
 *               boolean isLogin(String id,String pwd)
 *            
 *            메소드의 종류 크게 4개가 있음
 *              리턴형         매개변수
 *               o             o
 *              리턴형       메소드명(매개변수)
 *              String substring(int s, int e)
 *              -------------------
 *               o             x
 *              리턴형       메소드명()
 *              String      trim()
 *              double      random()
 *              -------------------             
 *               x             o
 *              void       소드명(매개변수)
 *              void main (String[] arg)
 *              void     println(String a)
 *              -------------------
 *               x             x
 *              void       메소드명()
 *              void      println()
 *              
 *              -------------------
 *              ***결과값 처리 -> 리턴형 : 기본형, 배열, 클래스 등등 다됨
 *              
 *            메소드 명
 *              = 알파벳이나 한글 사용 가능(대소문자구분)
 *              = 숫자 사용가능(앞에x)
 *              = 특수 문자 사용이 가능( _ , $ )
 *              = 예약어 키워드 x
 *              = 공백x
 *              -> 약속사항 : 소문자로 시작, 2개이상의 단어가 연결될때는-스네이크, 카멜 표기법사용
 *              매개변수 : 사용자가 요청한 값
 *                      입력값이 3개 이상이면 배열, 클래스를 주로 사용
 *                                   
 *            형식)
 *               두개 정수를 보내주고 더한값
 *               int add(int a, int b) //선언부
 *               {
 *                  //구현부
 *                  int c=a+b;
 *                  
 *                  return c;
 *                         -선언부의 자료형은 return과 동일한걸 권장하지만 커도 된다.
 *               }
 *               
 *               void gugudan()
 *               ---- 결과값이 없이 출력
 *               {
 *                  구구단 출력
 *                  
 *                  return 메소드는 종료시점이 return에서 종료
 *                **단 void일때는 생략이 가능! 없는게 아님 -> 생략시 컴파일러가 자동으로 return을 추가함 
 *               }
 *               
 *               코드 설계시 변수20%, 메소드 80%
 *               메소드 사용 방법에는 주로
 *                 1.재사용
 *                 2.가독성 : 보기편하다 (유지보수) : 단락나우기
 *                 3.반복제거 : 소스양을 줄인다
 *               즉 모든프로그램에서 -> 메소드 제작
 *                 1.사용자 입력
 *                 2.사용자 요청 처리 -> 세분화
 *                 3.결과값 출력
 *               
 *               
 *              
 *               
 *         4. 
 *            결과값 메소드명(매개변수)
 *            ---1개      -----여러개 사용가능           
 *               
 *            
 *            1.qkdzhr-fnxmwjdfl, dPdir 2.dht
 *            3.wjdcjrl-rlcnf1,2ghl
 *            
 *             
 *              
 */

// 1. 3개의 정수를 받는다 - 메소드 1
// 2. 총점, 평균, 학점을 구해서 출력 - 메소드2,3,4,5 한번에 묶어서 하는거보다 분리해서 세분화 하는게 재사용성이 높음

/*
 *    메소드 호출
 *    -------
 *    리턴형이 있는 경우 ---> 
 *    int pHello(int a, int c)
 *    {
 *       return a+c;
 *    }
 *    
 *    int c=pHello(10,20)
 *    c -> 30이 된다
 *    ***중요한건 아까도 말했만 메소드의 리턴형(자료형)과 리턴받는 변수의 자료형이 같아야 한다(커도 가능하지만 맞추는걸 권장함) 
 *    
 *    리턴형이 없는경우(void) ----> 
 *    void gugudan()
 *    {
 *      ==구구단 출력
 *    }
 *    
 *    gugudan()
 *    -> 메소드를 호출하면 메소드 전체를 수행하고 호출한 주소로 돌아온다
 *    return은 대부분 마지막에 있지만 중간에 있을수도 있다
 *    
 *    
 */
import java.util.Arrays;
import java.util.Scanner;
public class 클래스구성요소 {
	/*
	 *   메소드
	 *   1) 인스턴스 메소드 -> 객체 생성시마다 따로 저장
	 *      class A
	 *      {
	 *         void display() {}
	 *      }
	 *      A a=new A() -> a.display()
	 *      A b=new A() -> b.display()
	 *      
	 *   2) 정적 메소드 -> 한개의 공간에만 저장(JVM에 의해 메모리에 자동 저장)
	 *      static
	 *   3) 추상 메소드 -> 선언만 하는 메소드(추상 클래스, 인터페이스)
	 *      abstract
	 *   4) 종단 메소드 -> 수정이 불가능한 메소드
	 *      final
	 */
	
	static int input(String subject)
	{
	Scanner sc=new Scanner(System.in);
	
	//반복제거
	System.out.print(subject+"입력: ");
	int value=sc.nextInt();
	return value;
	}
	
	static int totalGesan(int kor, int math, int eng, int his, int phy) {
		return kor+math+eng+his+phy;
		
	}
	
	static double avgGesan(int total) {
		return total/5.0;
	}
	
	static char scoreGesan(double avg) {
		char score='A';
		switch((int)(avg/10)) {
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default :
			score='F';
			break;		
		}
		return score;
	}
	
//	클래스 내부는 메소드 외부는 함수라고 부름 자바는 대부분 클래스 내부라 메소드라 함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		/* 여러번 입력해야하는데 이걸 생략시킴
		System.out.println("국어 입력: ");
		int kor=sc.nextInt();
		
		System.out.println("영어 입력: ");
		int eng=sc.nextInt();
		
		System.out.println("수학 입력: ");
		int math=sc.nextInt();
		
		System.out.println("국사 입력: ");
		int his=sc.nextInt();
		
		System.out.println("물리 입력: ");
		int phy=sc.nextInt();
		*/
		
		int kor=input("국어");
		int math=input("수학");
		int eng=input("영어");
		int his=input("역사");
		int phy=input("물리");
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("역사: "+his);
		System.out.println("물리: "+phy);
		
		//총점 계산
//		int total=kor+eng+math+his+phy;
		int total=totalGesan(kor,eng,math,his,phy);
		System.out.println("총점: "+total);
		
		//평균
//		double avg=total/5.0;
		double avg=avgGesan(total);
		System.out.printf("평균:%.2f\n",avg);

		//학점
		char score =scoreGesan(avg);
		System.out.println("학점: "+score);
			

		

	}

}
