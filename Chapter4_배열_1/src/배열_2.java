
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("최대값은 : "+max);

	}

}
