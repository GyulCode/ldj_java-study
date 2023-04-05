import java.util.Arrays;

public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,'A','B',100,15}; //int형 배열에 double형 자료가 들어오며 오류, 작은 char, short는 가능
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		double[] arr2= {10,'A','B',100,10.7};
		System.out.println(Arrays.toString(arr2));
		char[] arr3= {'A',66,'C',78,97}; //int를 포함할 수 있다.
		System.out.println(Arrays.toString(arr3));
		boolean[] arr4=new boolean[5];
		System.out.println(Arrays.toString(arr4));
		byte[] arr5=new byte[5];
		System.out.println(Arrays.toString(arr5));
		//int[] arr; -> null(주소가 없을경우)

	}

}
