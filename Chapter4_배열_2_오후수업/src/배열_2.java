/*
 *   알파벳 10개 저장하는 공간
 *   char[] alpha =new char[10];
 *   배열 변수가 3개이상이면
 * 
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.선언
		int[] arr=new int[5]; //new 동적메모리 할당...
		//2.초기화
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)((Math.random()*100)+1);
		}	
		//3.출력
		for(int i:arr) {
			System.out.println(i+" ");
		}
		//4.제어
		// 정렬
		//5.결과값 출력

	}

}
