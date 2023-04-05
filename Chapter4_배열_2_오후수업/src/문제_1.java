import java.util.Arrays;
import java.util.Scanner;

public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제_1번
//		continue
		
		// 문제_2번
//		i>50
		
		// 문제_2-1번
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++){
//				if(j==2)
//					continue;
//				System.out.print("i="+i+",j="+j+"  ");
//			}
//			System.out.println("");
//		}
		
		// 문제_3번
//		4번
		
		// 문제_4-1번
//		char[] arr=new char[10];
		// 문제_4-2번
//		int[] arr={1,2,3,4,5};
		// 문제_4-3번
//		char[] arr={'일','월','화','수','목,'금','토'};
		// 문제_4-4번
//		boolean[] arr= {true,false,true,false};
		
		// 문제_5번
//		for(int i=0; i<alpha.length; i++)

		
		// 문제_6번
//		Scanner sc=new Scanner(System.in);
//		System.out.println("양의 정수 10개를 입력하시오: ");
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println(Arrays.toString(arr));

		//출력 강사님 
//		for(int i:arr) {
//			if(i%3==0) {
//				System.out.print(i+" ");
//			}
//		}
		
		//출력 내방법
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%3==0) {
//				System.out.print(arr[i]+" ");
//			}
//		}
		
		
		// 문제_7번
//		int[] arr=new int[10];
//		int total=0;
//		double avg=0;
//		
//		for(int i=0; i<arr.length;i++) {
//			arr[i]=(int)((Math.random()*10)+1);
////			System.out.println("생성된 정수 : "+arr[i]); //내방법
//		}
//		System.out.println(Arrays.toString(arr)); 
//		
//		for(int i=0; i<arr.length;i++) {
//			total+=arr[i];
//		}
//		avg=total/(double)arr.length;
//		System.out.printf("평균은 %.2f",avg);
		
		// 문제_8-1번
//		int[] arr=new int[5];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("5개의 정수를 입력하시오: ");
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("------출력-------");
//		for(int i=0;i<arr.length;i++) {
//			System.out.printf("%d ",arr[i]);
//		}
		
		// 문제_8-2번
//		char[] arr=new char[10];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("10개의 문자를 입력하시오: ");
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.next().charAt(0);
//		}
//		System.out.println("------출력-------");
//		for(int i=0;i<arr.length;i++) {
//			System.out.printf("%c ",arr[i]);
//		}
		
		// 문제_8-3번
//		int[] arr=new int[10];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("10개의 정수를 입력하시오: ");
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("------출력-------");
//		System.out.printf("%d %d %d",arr[2],arr[4],arr[9]);
		
		
		// 문제_8-4번
//		int[] arr = new int[10];
//		int max=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("10개의 정수를 입력하시오: ");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(max < arr[i]) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
		
		// 문제_9-1번
		int[] arr = new int[10];
		int total=0;
		double avg=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)((Math.random()*100)+1); //점수 발생
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i:arr) {
			total+=i;
		}
		avg=total/(double)arr.length; //우선순위 ()부터 double이 먼저됨
		System.out.printf("총점: %d 평균은: %.2f",total,avg);
		
		//문제_9-2번
//		int[] arr={95,75,85,100,50};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-(i+1);j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp =arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}		
//		}
//		System.out.println(Arrays.toString(arr));
		
		
//		System.out.println(Arrays.toString(arr));
		

	}

}
