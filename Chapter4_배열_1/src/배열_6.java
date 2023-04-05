import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1=new int[10];
		int[] arr= {10,20,30,40,50};
		//1.배열의 크기 출력
		//2.3번째값을 300
		//3.5번쨰값을 출력
		
		System.out.println("배열의 크기"+arr.length);
		
		arr[2]=300;
		System.out.println(Arrays.toString(arr));
		
		System.out.println("5번째 값"+arr[4]);
		
		
		

	}

}
