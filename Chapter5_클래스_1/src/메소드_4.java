import java.util.Arrays;

/*
 *       리턴형      매개변수
 *   1번   o          o
 *   2번   o          x
 *   3번   x          o
 *   4번   x          x
 *     
 *    1) 2단 ~ 9단까지 구구단 출력 (4번)
 *       static void gugudan()
 *       {
 *       }
 *    2) id,pwd를 받아서 로그인하면 true, 아니면 false (1번)
 *       static boolean login(String id, String pwd)
 *    3) 검색어를 입력받아서 검색된 노래명들을 출력 (3번)
 *       static void find(String fd)
 *       
 *       static String[] find(String fd) - 노래들일 경우 리턴이 여러개이니까 배열
 *        
 *        
 *    4) 5개 정수를 넘겨주고 정렬된 정수를 받는다
 *       static (int[]) sort(int a, int b, int c, int d, int e)
 *       static (int[]) sort(int[] arr) 결과값이 여러개일때는 배열사용
 *    
 */

//6개의 난수를 발생해서 -> 전송받은 다음 -> 총합, 평균
public class 메소드_4 {
	
	//6개 난수 발생
	static int[] rand() {
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		return arr;
	}
	
	//최대값, 최소값
	static int max(int[] arr) {
		int m=arr[0];
		for(int a:arr) {
			if(m<a)
				m=a;
		}
		return m;
		
	}
	
	static int min(int[] arr) {
		int m=arr[0];
		for(int a:arr) {
			if(m>a)
				m=a;
		}
		return m;
		
	}
	
	
	static void process() {
		int[] arr=rand(); //얕은복사
		int total=0;
		for(int a:arr) {
			total+=a;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합: "+total);
		System.out.printf("평균:%.2f\n",total/(double)arr.length);
		int max = max(arr);
		int min = min(arr);
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
		System.out.println("둘의 차이"+(max-min));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
