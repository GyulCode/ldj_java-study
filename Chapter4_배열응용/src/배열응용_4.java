/*
 *   숫자 야구게임
 *   1.컴 -> 임의의 숫자 3개 발생 (1~9까지 중복없는 난수)
 *     3 6 9
 *   2.사용자가 숫자를 입력해서 난수를 맞춘다.
 *   3.힌트
 *     2 9 6
 *     ------> 0S-2B
 *     3 7 8
 *     ------> 1S-0B
 *     3 9 8
 *     ------> 1S-1B
 *     3 6 9
 *     ------> 3S-0B
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열응용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3]; //난수 저장
		int[] user=new int[3]; //입력 저장
		
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {//중복제거
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com)); //컴의 발생 값
		//사용자 입력
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수 입력: ");
			int input=sc.nextInt();
			if(input<100 || input >999) {
				System.out.println("입력이 잘못됐어요 세자리 정수를 입력해 주세요!!");
				continue;
			}
			//사용자에게 입력받은 값을 각자리수에 저장
			user[0]=input/100;  //백의자리
			user[1]=(input%100)/10;  //10의자리
			user[2]=input%10;  //1의자리
			
			//단 같은 정수 입력이 불가하고
			if(user[0]==user[1] || user[2]==user[1] || user[0]==user[2]) {
				System.out.println("중복된 수는 사용 할 수 없습니다.");
				continue;
			}
			//0을 포함 할 수 없다.
			if(user[0]==0 || user[2]==0 || user[1]==0) {
				System.out.println("0을 포함할 수 없습니다.");
				continue;
			}
			
			//힌트준비
			int s=0,b=0;
			for(int i=0;i<com.length;i++) {
				for(int j=0;j<user.length;j++) {
					if(com[i]==user[j]) {
						if(i==j) {
							s++;
						}
						else {
							b++;
						}
						
					}
				}
			}
			//힌트제공
//			System.out.printf("Input:%d, Result:%dS-%db\n",input,s,b);
			System.out.println("===========");
			System.out.print("S:");
			for(int i=0;i<s;i++) {
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0; i<b;i++) {
				System.out.print("○");
			}
				
			System.out.println("\n===========");
			
			//종료시점 s3
			if(s==3) {
				System.out.println("You Win!");
				
				break;
			}
		}
		
		
		

	}

}
