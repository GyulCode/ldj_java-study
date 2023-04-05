import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[20];
		for(int i=0; i<arr.length;i++) {
			int n=(int)(Math.random()*2);
			if(n==0) {
				arr[i]=(char)((Math.random()*26)+65);
			}
			else
				arr[i]=(char)((Math.random()*26)+97);
		}
		System.out.println(Arrays.toString(arr));
		
		//대문자, 소문자
		int count1=0, count2=0;
		for(char c:arr) {
			if(c>='A' &&c<='Z') {
				count1++;
			}
			else
				count2++;
		}
			System.out.println("대문자 갯수:"+count1);
			System.out.println("소문자 갯수:"+count2);
		
	

	}

}
