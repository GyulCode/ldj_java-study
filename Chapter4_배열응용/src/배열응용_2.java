import java.util.Arrays;

// 정수 10개의 저장공간 -> 임의로 초기화(1~100)
//최대값과 최소값의 위치를 구하라
/*
 * 1, 2, 3, 4, 5, 6, 7, 8, 10, 9
 * 
 */
public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)((Math.random()*100)+1);
		}
			System.out.println(Arrays.toString(arr));
			//최대
			int max =arr[0];
			//최소
			int min =arr[0];
			
			for(int i:arr) {
				if(max<i)
					max=i;
				if(min>i)
					min=i;
			}
		
			System.out.println("최대값:"+max);
			System.out.println("최대값:"+min);
			
			int index1=0, index2=0;
			for(int i=0; i<arr.length;i++) {
				if(arr[i]==max) {
					index1=i;
				}
				else if(arr[i]==min) {
					index2=i;
				}
			}
			System.out.println("최대값 위치 "+(index1+1));
			System.out.println("최소값 위치 "+(index2+1));
			
		

	}

}
