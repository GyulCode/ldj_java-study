/*
 * 배열 : 관련된 데이터를 여러개 모아서 한개의 이름으로 관리
 *  	 ---------            --------
 *      자료형(데이터형) 동일
 *     1)데이터를 배열로 모아서 관리 -> 연속적인 메모리 공간을 만든다.
 *     2)고정적이다 (지정되면 추가, 삭제 불가)
 *       -------가변형 (컬렉션 프레임워크 제공)
 *     3)한개의 이름으로 사용한다(구분자:인덱스)->0,1,2
 *     ex)
 *     int a=10, b=20, c=30, d=40, e=50;
 *     0---------------
 *     
 *     4---------------
 *     
 *     8---------------
 *     
 *     12---------------
 *     
 *     16---------------
 *     
 *     20---------------
 *            30---> c
 *     24---------------
 *     
 *     28---------------
 *     
 *     배열 -> 데이터를 5개를 만들어 달라
 *     -------------------------
 *      10 | 20 | 30 | 40 | 50 
 *     ------------------------- 
 *     |    |    |         |
 *    100  104  108  ...  116
 *   arr  arr+1 arr+2 ..  arr+4
 *    각 번지의 자료값을 갖고 오는방식
 *    100+0*4 = arr[0]
 *    100+1*4 = arr[1]
 *    100+2*4 = arr[2]
 *    -----------------인덱스 번호는 0~갯수만큼
 *    index번호는 순차적으로 만들어 진다
 *    갯수확인 = length
 *    
 *    1. 배열 선언
 *      데이터형[] 배열명; -> 권장
 *      데이터형 배열명[]; -> c언어 파생형태
 *      
 *    2. 배열 초기화
 *      1)선언과 동시에 초기화
 *        데이터형[] 배열명={1,2,3,4,5} -> 5개를 동시에 저장
 *        데이터형[] 배열명=new 데이터형[10];
 *        
 *     ***new를 사용하게 되면 자동으로 기본 디폴트값을 채운다
 *        byte, short, int -> 0
 *        long -> 0L  char -> '\0'  boolean -> false
 *        float -> 0.0F  double -> 0.0
*        
 *    3. 데이터 읽기
 *      int a=10;
 *      sysout
 *      int[] arr ={10,20,30...50}
 *      sysout(arr[1]) -> 20
 *      
 *    4.변경
 *      int a=10;
 *      a=20;
 *      
 *      
 *      int[] arr={10,20,30,40,50};
 *      arr[3]=200; -> arr{10,20,30,200,50};
 * 
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 3개를 연속적을 배치 -> 배열
		/*
		 * 5개 변수 -> 10000개
		 */
		/*int[] arr=new int[5];  // ***new로 선언해서 0,0,0,0,0으로 선언과 동시에 초기화
		
		for(int i=0; i<5; i++) {
			System.out.println("arr["+i+"]"+arr[i]); 
			
		}*/
		
		int a1=(int)((Math.random()*100)+1);
		int a2=(int)((Math.random()*100)+1);
		int a3=(int)((Math.random()*100)+1);
		int a4=(int)((Math.random()*100)+1);
		int a5=(int)((Math.random()*100)+1);
		
		int a6=(int)((Math.random()*100)+1);
		int a7=(int)((Math.random()*100)+1);
		int a8=(int)((Math.random()*100)+1);
		int a9=(int)((Math.random()*100)+1);
		int a10=(int)((Math.random()*100)+1);
		
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		System.out.println("a3="+a3);
		System.out.println("a4="+a4);
		System.out.println("a5="+a5);
		
		System.out.println("a6="+a6);
		System.out.println("a7="+a7);
		System.out.println("a8="+a8);
		System.out.println("a9="+a9);
		System.out.println("a10="+a10);
		
		int max=a1;
		if(max<a2)
			max=a2;
		if(max<a3)
			max=a3;
		if(max<a4)
			max=a4;
		if(max<a5)
			max=a5;
		if(max<a6)
			max=a6;
		if(max<a7)
			max=a7;
		if(max<a8)
			max=a8;
		if(max<a9)
			max=a9;
		if(max<a10)
			max=a10;
		
		
		
	}

}
