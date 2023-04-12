/*
 *    new, static
 *    1. 클래스의 구성요소
 *    class ClassName
 *    {
 *       1) 변수설정
 *          변수의 종류
 *          1. 클래스 영역에 선언하는 (멤버변수) = heap
 *             인스턴스 변수 : new를 사용할때 저장되는 변수, new설정에 따라 따로 저장
 *             = 클래스객체명.변수명
 *               Card c1= new Card()
 *               c.number=10
 *               ------------
 *             정적 변수 : 한개의 공간에 저장되는 변수
 *               Card c1=new Card()
 *               c1.number
 *               Card.number
 *               ------------프로그램 종료시까지 사용 변수
 *             
 *              
 *          2. 메소드 영역에 선언하는 변수 (지역변수) = stack
 *             메소드 종료시 사라지게됨
 *             1) 메소드 영역에 선언되는 변수
 *             void aaa()
 *                {
 *                   int a=10;
 *                }
 *             2) 매개변수
 *                void aaa(int a)
 *                {
 *                }
 *       
 *       자바 메모리 구조
 *       ---------------------------------------------------------
 *       Method Area : method, static
 *       Stack : 메모리 자체에서 관리(생성/소멸) -> 블럭변수
 *               매개변수, 지역변수
 *               -> 변수의 초기화가 안된다(반드시 초기화후 사용해야함)
 *       Heap : 프로그래머 영역(프로그래머가 직접 메모리 크기를 만들어서 저장)
 *              자동 소멸이 안됨 -> GC (System.gc())
 *              heap, method area -> 변수 저장시에 자동 초기화가 된다
 *              class Name{
 *                 int a; -> 0
 *                 double d; -> 0.0
 *                 boolean b; -> false
 *                 char c; -> '\u00000'
 *                 long l; -> 0L
 *                 String s -> null
 *              }
 *              
 *                
 *                
 *       ---------------------------------------------------------
 *          변수유형         선언위치         메모리저장            사용범위
 *       ---------------------------------------------------------
 *         인스턴스변수       클래스블럭     new:새로운 저장공간      클래스 전체      
 *         				class Name    heap 메모리에 저장
 *         			  {
 *                        int a;
 *                    }
 *       ---------------------------------------------------------             
 *          정적변수         클래스 블럭      컴파일시 자동 저장
 *                     static int a;
 *                     많이 사용되지는 않음
 *       ---------------------------------------------------------
 *          지역변수		class Name    메소드 호출시 마다 메소드 안에서만 사용기 가능
 *         			  {
 *                        void display()
 *                        {
 *                           int a=10;
 *                        }
 *                    }
 *                    반드시 초기화
 *       1) 메모리 저장
 *       메모리에서 저장된 상태 : 인스턴스=객체
 *         설계        ->       메모리에 저장      ->       활용         ->       소멸(메모리 해제) 
 *      class Card        Card c=new Card()    c.변수명 c.메소드명()         c=null gc()
 *      
 *      ***클래스는 한개에 대한 정보 설계
 *      맛집 : 5000개 -> 맛집 클래스 1개 생성후 5000개의 인스턴스를 저장공간에 저장한다.
 *          
 *       2) 생성자 설정 -> 필요시에만 사용 설정하지 않으면 컴파일러가 자동으로 생성해줌
 *       3) 메소드 설정
 *    }
 *    
 *    
 */
class Student{
	String name;
	int kor;
	int eng;
	int math;
}


public class 사용자정의_데이터형_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("s1"+s1);
		s1.name="홍길동";
		s1.kor=90;
		s1.eng=80;
		s1.math=70;
		Student s2=new Student();
		System.out.println("s2"+s2);
		s2.name="심청이";
		s2.kor=80;
		s2.eng=68;
		s2.math=70;
		Student s3=new Student();
		System.out.println("s3"+s3);
		s3.name="강간찬";
		s3.kor=90;
		s3.eng=80;
		s3.math=78;
		
		Student s4 =new Student();
		System.out.println(s4.name);
		
		System.out.println(s1.name+" "+s1.kor+" "+s1.eng+" "+s1.math);
		System.out.println(s2.name+" "+s2.kor+" "+s2.eng+" "+s2.math);
		System.out.println(s3.name+" "+s3.kor+" "+s3.eng+" "+s3.math);
		
		

	}

}
