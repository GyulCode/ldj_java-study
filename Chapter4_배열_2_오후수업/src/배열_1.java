import java.util.Arrays;

/*
 *   ***모아서 관리
 *      데이터 -> 배열 / ***클래스(핵심)
 *      명령문 -> 메소드(재사용)
 *   1.같은 데이터를 모아서 관리
 *     =연속적으로 메모리 배치
 *     =인덱스번호를 이용한다(0번부터)
 *     =고정적, 크기를 늘리거나 줄이기 어려움
 *     =배열 복사
 *       얕은 복사 -> 참조 or 별칭이라 불림 (같은메모리 주소를 활용)
 *         int[] arr1={};
 *         int[] arr2=arr1; -> 같은 메모리 주소를 활용
 *         
 *       깊은 복사 -> 데이터만 복사해오고 새로운 메모리를 만들어서 저장
 *         int[] arr1={};
 *         int[] arr2=arr1.clone()
 *         System.arraycopy() 
 *      =배열의 크기 : length
 *      =출력시에는 주로 -> for each(향상된 for)사용
 *        ---브라우저에서 있는그대로 출력해줌
 *        배열 / 컬렉션(데이터가 모아있어야 사용이 가능하다)
 *        -> 배열에 저장된 값을 한개씩 읽어 온다.
 *        int[] = arr{10,20,30,40,50}
 *        for(int a:arr)
 *        {
 *          a=10, a=20 ... a=50
 *        }
 *        
 *        char[] arr={'A','B','C'}
 *        for(char c:arr)
 *        {
 *          //c는 arr에 저장된 실 데이터를 갖고온다.
 *        }
 *          
 *          
 *      =초기값, 값을 변경시에는 일반 for문 사용
 *       
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		for(int i:arr) {
//			i=100;
			System.out.println("i="+i);
		}
		System.out.println(Arrays.toString(arr));

	}

}
