import java.util.Arrays;

public class 메소드_3 {
	
	static int[] rand() {
		int[] arr=new int[5];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	static void rand2(int[] arr) {
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//리턴형
		int[] arr1=rand(); 
		System.out.println(Arrays.toString(arr1));
		
		//매개변수를 이용해서 값을 채운다 --> 활용도가 높다***
		int[] arr2=new int[5];
		rand2(arr2);
		System.out.println(Arrays.toString(arr2));
		//단 위와같은 방법들은 콜바이 레퍼런스 주소를 주는 배열,클래스만 가능
		

	}

}
