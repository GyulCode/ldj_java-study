import java.util.Arrays;

// 1.달력 만들기
/*
 *   기능(구현할 메소드) 세분화 할수록 좋다
 *      1. 년도 / 월 -- 입력
 *      2. 1일자의 요일 확인
 *      3. 달력 출력
 *      -----------------
 *      ===> 재사용할 수 있는 메소드는 윤년체크 정도가 있ㄷr...😊💕🤞😎
 *      
 *   2. 숫자야구게임
 *      기능
 *         난수 발생
 *         사용자 입력
 *         비교
 *         힌트
 *         종료여부 확인
 *   
 *   
 *    40 30 10 50 20 -> select 정렬
 *    30 40
 *    10    30
 *    10       50
 *    10		  20--1회차
 *       30 40
 * 		 30    50
 *       20       30--2회차
 *          40 50
 *          30    40--3회차
 *             40 50--4회차
 * 
 */
public class 메소드조립법_1_정렬 {
	
	static void sort(int[] arr, int n) {// 1=asc 2=desc
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				boolean bCheck=false;
				if(n==1) {
					bCheck=arr[i]>arr[j];
				}
				else {
					bCheck=arr[i]<arr[j];
				}
					
				if(bCheck) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}									
			}
		}
	}
	
	static void sort2(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;						
				}
			}
		}
	}
	
	static void rand(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)((Math.random()*100)+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("😊💕🤞😎");
		int[] arr = new int[5];
		rand(arr);
		System.out.println("정렬전 : "+Arrays.toString(arr));
		sort(arr,1);
		System.out.println("정렬후 : "+Arrays.toString(arr));
		sort2(arr);
		System.out.println("정렬후 : "+Arrays.toString(arr));

	}

}
