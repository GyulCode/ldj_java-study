import java.util.Arrays;

/*
 *    연산자, 제어문 -> 형식, 용도
 *    1) 형식
 *      초기값은 한번 수행
 *      for(초기값;조건석;증가식)
 *      {
 *         반복수행 문장
 *      }
 *      메커니즘
 *      초기값 -> 조건식 -> 수행문장 -> 증가식
 *      조건식이 false가 나올때까지 수행
 *      
 *      초기값
 *      while(조건문)
 *      {
 *          수행문장
 *          증가식
 *      }
 *      증가식을 수행하고 조건문이 false가 나오면 연산 종료
 *      반복문 제어
 *      break / continue
 *      break -> 반복중단(조건) / 게임 -> esc에 break를 걸어두는것!
 *      반복문, switch에서 사용
 *      
 *      continue -> 반복문에서만 사용이 가능
 *      종료하는 것이 아니라 -> 이동 for(증가식으로) while(조건식으로) 이동시킨다
 *      
 *      주의점)
 *      1. break, continue 밑에는 소스 코딩이 불가능 하다
 *      2. break, continue 자신이 속한 반복문만 제어가능
 *      
 *      if문 각각의 구분
 *      if
 *      ----
 *      if
 *      else if
 *      ----
 *      if
 *      ----
 *      if
 *      ----
 *      else
 *      
 *      
 *      
 *      
 *      
 * 
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println(arr);
		int[] arr2=arr; //주소값이 동일한 배열임 새배열이 아니다!
		System.out.println(arr2);
		arr2[0]=10;
		System.out.println(arr[0]);
		int [] arr3=arr.clone(); //새로운 배열을 만드는거
		int[] arr4 =Arrays.copyOfRange(arr3, 1, 3);
		//주소에 의한 참조 -> 메모리 주소 이용해서 실제 데이터 관리
		
		System.out.println(Arrays.toString(arr4));

	}

}
