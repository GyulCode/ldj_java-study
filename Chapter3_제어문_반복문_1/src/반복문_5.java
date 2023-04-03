//사용자의 입력을 받아서 (구구단) => 3
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("입력받을 단을 입력하세요");
		int dan = sc.nextInt();
		System.out.println("======="+dan+"단========");
		
		for(int i=1; i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}

	}

}
