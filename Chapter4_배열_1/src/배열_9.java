import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,50};
		int[] arr2= new int[10];
		//-------------------시작-------시작-갯수
		System.arraycopy(arr1, 2, arr2, 3, 3); //인덱스 0번부터 총3개 즉 2번까지 or arr1.length
		
		System.out.println(Arrays.toString(arr2));

	}

}
