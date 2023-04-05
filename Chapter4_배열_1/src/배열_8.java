import java.util.Arrays;

public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={10,20,30,40,50};
		int[] arr2=arr1.clone(); //깊은 복사가 아니라 별칭 하나 더 주는 느낌, 하나를 더 만들려면 clone()사용 / copy아님 주의!
		
		//주소값 확인
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("arr1"+Arrays.toString(arr1));
		System.out.println("arr2"+Arrays.toString(arr2));
		
		System.out.println("======== 값 변경 =========");
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		arr2[3] = 400;
		arr2[4] = 500;
		System.out.println("arr1"+Arrays.toString(arr1));
		System.out.println("arr2"+Arrays.toString(arr2));
		
		//복제
		int[] arr3= new int[10]; //복제시 배열의 크기가 작으면 오류!!
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr3));

	}

}
