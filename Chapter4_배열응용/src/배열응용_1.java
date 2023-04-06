import java.util.Arrays;

/*
 * 배열 : 자료형이 같은 데이터를 모아서 관리
 *   	 -> 연속적으로 메모리에 배치(인덱스 하나당 자료형 크기만큼)
 *   	 -> 인덱스 번호로 접근한다.
 * 변수 : 한개의 값만 저장가능
 * 메모리 구조
 *   method Area -> method, static
 *   Stack -> 메모리 관리(지역변수, 매개변수)
 *   Heap  -> 동적 메모리 할당 (new) -> 배열 / 클래스
 * 배열의 선언
 *   데이터형[] 배열명; or 데이터형 배열명[];
 *   데이터형[] 배열명 = new : 메모리를 만들어주고 메모리의 주소값을 넘겨준다
 *   				 ----- malloc(sizeof(10)) -> 승격 연산자
 *   				  delete
 *   					 free() -> 개발자가 사용을 잘 안함 GC 사용 -> 사용하지 않거나/null값인 경우 자동으로 메모리회수를 한다 System.gc()
 *   데이터형 배열명[] = new 데이터형[크기결정];
 *  ex) int[] arr = new int[5];
 *      ---------   --------
 *      Stack		Heap(실제 데이터 저장)
 *      -----		--------
 *      arr이들어감	배열이 들어감 int[5]
 *      new가 메모리 선언 및 주소 알려줌
 *      실제 저장된 데이터의 메모리 주소를 이용해서 데이터 관리(참조변수)
 *      변수, 배열, 클래스 -> 초기화후에 사용
 *      클래스를 주로사용 || 10 | 10.5 | 'D' ||
 *      
 *      1.인덱스로 초기화
 *        int[] arr = new int[3];
 *        arr[0]=10;
 *        arr[1]=10;
 *        
 *      2.for문으로 초기화
 *      for(int i=0;i<arr.length;i++) for(int a:arr)
 *      {
 *        arr[i]=(i+1)*10 
 *      }
 *      
 *      3.선언과 동시에 초기화
 *      int[] arr = {1,2,3,4,5}; -> 자바스크립트에서는 [1,2,3,4,5] 대괄호를 사용함
 *      연산자 == != / === !== / = / EL
 *      
 *      char[] c = {'A','B'...};
 *      String[] s={"문자열","","",...} -> 웹 필수 80%이상
 *      
 *      4.배열의 확장/축소 ->길이가 고정이라 새로 만들어야한다.
 *        얕은복사 -> 주소는 동일하고 별칭이 다르다
 *        깊은복사 -> arr1=arr; -> 새로운 주소 만들기
 *        int[] arr={}
 *        int[] arr1=arr.clone() -> 같은크기
 *        -> arraycopy(배열1 시작인데스 배열2 시작인덱스 몇개)
 *        -> for를 이용해서 데이터값만 복사
 *        
 *        *** new를 이용하는 경우 -> 기본 디폴트 값이 설정된다.
 *        int[]   -> 0
 *        char[]   -> '\u0000'
 *        String[]   -> null (모든 클래스의 기본 디폴트는 null)
 *        
 *        
 *        double[]   -> 0.0
 *        boolean[]   -> false
 *        
 *      
 * 
 */
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char배열 선언 -> 26 초기값 A~Z

		char[] alpha=new char[26];
		//초기화
		char c='A';
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=c++;
		}
		//출력
		for(char a:alpha) {//배열, 컬렉션에서 주로사용
			System.out.print(a+" ");
		}
		//or
		System.out.println();
		System.out.println(Arrays.toString(alpha));
		
	}

}
