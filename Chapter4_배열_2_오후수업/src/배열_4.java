//16비트 -> 0,1
import java.util.Scanner;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int input=sc.nextInt();
//		System.out.println(Integer.toBinaryString(input)); -> 메소드 사용

		//저장 공간(0,1)
		int[] binary=new int[16];
		int index=15;
		while(true) {
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		for(int i=0;i<binary.length;i++) {
			//4칸마다 공백
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		

	}

}
