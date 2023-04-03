/*
 *   자바에서 지원하는 반복문
 *   -----------------
 *   for : 반복 횟수가 지정된 경우 주로 사용 -> 2차(중첩) 공부 필->코테에서 기본적으로 나옴
 *    = 일반 for
 *    = for-each : 출력용(웹에서 가장 많이 등장:향상된 포문이라고도함)
 *   while : 반복 횟수를 모를경우 사용(선조거),(무한루프에서 주로 사용)
 *   do~while : 1회는 무조건 실행하는경우 사용(후조건)
 *   
 *   -> 유사한 내용을 여러번 출력을 할떄 사용 합계, 통계, 목록.. 등
 *   -> 형식)
 *      for
 *      for(int i=1;i<=10,i++) -> 10번수행
 *      for(int i=10; i>=1; i--) 가능
 *      {
 *      }
 *      초기값 : 시작점 -> 한번만 수행
 *      조건식 : 수행을 중단할때(종료점)
 *      증감식 : 초기값 ~ 조건식 -> false 일때까지 수행
 *      조건은 복합 대입도 가능 i+=3
 *      
 *      -> for문은 한문장만 수행이 가능
 *      	여러문장 사용시에는 {}를 이용해서 처리한다
 *      
 *			    1. → 2.↓   4.←			false(반복문 종료)  
 *      -> for(초기값; 조건식; 증감식)
 *      {			 3.↓  ↗
 *      			  true
 *      	3.반복 실행문장
 *      }
 *      초기값 -> 조건식에 대입 ->  false-> 종료(for)
 *      				  -> True -> 3)반복 수행문장 후행 -> 4)초기값 증가
 *    
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello Java를 10번 출력
		for(int i=0;i<10;i++)
			System.out.println((i+1)+". Hello Java");
		for(int i=1;i<=10;i++)
			System.out.println(i+". Hello Java");
//		for(int i=0;i<10;i++)
//			System.out.println("Hello Java");
		

	}

}
