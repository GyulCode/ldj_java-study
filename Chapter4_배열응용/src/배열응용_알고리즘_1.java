import java.util.Arrays;

/*
 *  정렬 : ASC(오름차)/DESC(내림차) 
 *  선택정렬 / 버블정렬
 *  선택정렬 (select sort)
 *  
 *  10 30 50 20 40 -> 10 20 30 40 50 / 50 40 30 20 10
 *  -- --
 *  30 10
 *  --    --
 *  50    30
 *  -- 	     --
 *  50	 	 20
 *  --          --
 *  50			40 ------------1라운드 0번 4번 비교(반복)
 *  ----------------
 *  50 10 30 20 40
 *     -- --
 *     30 10
 *     --     --
 *     30     20 
 *     --       -- 
 *     40		30------------2라운드 1번 3회
 *     -------------
 *  50 40 10 20 40
 *        -- --
 *        20 10
 *        --     --
 *        40     10 ----------3라운드 2번 2회
 *     -------------
 *     
 *     이런식으로 진행해서 50 40 30 20 10을 만든다.
 *     규칙성을 발견!
 *     i+j=4 -> j=4-i
 *     				-length-1
 *     
 */
public class 배열응용_알고리즘_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DESC정렬 내림차순
//		int[] arr=new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println("-------정렬전--------");
//		System.out.println(Arrays.toString(arr));
//		System.out.println("-------정렬후--------");
//		for(int i=0; i<arr.length-1;i++){
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
		
		//오름차순 ASC
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("-------정렬전--------");
		System.out.println(Arrays.toString(arr));
		System.out.println("-------정렬후--------");
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("===== for "+(i+1)+"회차 =====");
			System.out.println(Arrays.toString(arr)+"\n");
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
