import java.util.Arrays;

//선택정렬 -> 문자
/*
 *   
 *   B C A E D -> ASC(ABCD 순) / DESC(EDCBA 순)
 *   - -
 *   B C
 *   -   -
 *   A   B
 *   -     -
 *   A     E
 *   -       -
 *   A       D
 *   ----------
 *   A C B E D
 *   
 */

public class 배열응용_알고리즘_2_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ASC
//		char[] arr =new char[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(char)(((int)(Math.random()*26))+65);
//		}
//		System.out.println("------------정렬전-------------");
//		System.out.println(Arrays.toString(arr));
//		System.out.println("------------정렬후-------------");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					char temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}		
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		//DESC
		char[] arr =new char[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char)(((int)(Math.random()*26))+65);
		}
		System.out.println("------------정렬전-------------");
		System.out.println(Arrays.toString(arr));
		System.out.println("------------정렬후-------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}		
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
