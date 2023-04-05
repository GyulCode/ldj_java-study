// 임의의 정수 10개를 받아서 최대/최소 구하기
import java.util.*;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		//1.일반 for
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr)); 
		
		//2.for-each -> 배열, 컬렉션 -> 데이터를 여러개 모아서 관리
		/*
		 * for(int a:arr)
		 */
		//출력용 -> ***웹브라우저 주로 사용하니 양식 확인
		for(int a:arr) { //vue, React 에서 자주씀
			System.out.println(a+" ");
		}
		
		//최대값, 최소값
		int max=arr[0];
		int min=arr[0];
		
		for(int a:arr) {
			if(max<a)
				max=a;
			if(min>a)
				min=a;
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		

	}

}
