import java.util.Arrays;

//빈도수 구하기
public class 배열응용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		// 빈도
		int[] result=new int[10];
		for(int i=0;i<arr.length;i++) {
			result[arr[i]]++;
		}
		for(int i=0; i<result.length;i++) {
			System.out.println(i+": "+result[i]);
		}
		int max=result[0];
		int min=result[0];
		int index1=0, index2=0;
		for(int i=0;i<result.length;i++) {
			if(max<result[i]) {
				max=result[i];
				index1=i;
			}
			if(min>result[i]) {
				min=result[i];
				index2=i;
			}
				
		}
		System.out.println("빈도수가 가장 많은 수: "+index1+"값은: " +max);
			System.out.println("빈도수가 가장 많은 수: "+index2+"값은: "+min);
//		System.out.println("빈도수가 가장 큰값: "+index1);
//		System.out.println("빈도수가 가장 작은값: "+index2);
	}

}
