/*
 *    1. 난수발생
 *    2. 사용자 입력
 *    -----------
 *    3. 비교
 *    4. 힌트
 *    -----------
 *    5. 종료
 *    
 */

import java.util.Arrays;
import java.util.Scanner;
public class 메소드조립법_3 {
	
	//com 난수
	static int[] com(int[] com) {	
		for(int i=0;i<3;i++) { 
			com[i]=(int)(Math.random()*10)+1;  // 난수발생
			for(int j=0; j<i;j++) {
				if(com[i]==com[j]) {  // 새로운 난수가 이전 난수와 같다면 다시 입력
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com)); //정답테스트
		return com;
	}
	
	//user 입력
	static int[] user(int[] user) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {			
			//입력
			System.out.println("세자리 정수 입력: ");
			int input=sc.nextInt();
			
			//오류처리-1
			if(input<100 || input>999) { // 정상입력 && 오류입력 ||
				System.out.println("잘못된 입력입니다");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=(input%10);
			
			//오류처리-2
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 숫자는 입력이 불가합니다.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 입력할 수 없습니다.");
				continue;
			}
			else
				break;
		}
			
		
		return user;
	}
	
	static void play(int arr1[], int arr2[]) {
		while(true) {
			int s=0, b=0; //같은 자리 같은수 s , 같은수 b
			for(int i=0; i<3; i++) {
				for(int j=0; j<3;j++) {
					if(arr1[i]==arr2[j]) {					
						if(i==j) { //같은 자리, 같은 수
							s++;
						}
						else
							b++;
					}
				}
			}
			//힌트 및 결과 로직
			if(s==3) {
				System.out.println("You Win!!");
				break;
//				System.out.println("게임을 다시하시겠어요?(1=yes, 2=no)");
//				
//				break;
			}
			System.out.printf("input:%d, Result: S-%d B-%d\n\n",arr2,s,b);
//			user();
		}
	}
	
	static void process() {
		
		int[] com=new int[3];
		int[] user=new int[3];
		com=com(com);
//		System.out.println(Arrays.toString(com));
		user=user(user);
		play(com,user);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
		
/*		int[] com=new int[3];
		int[] user=new int[3];
		
		for(int i=0;i<3;i++) { 
			com[i]=(int)(Math.random()*10)+1;  // 난수발생
			for(int j=0; j<i;j++) {
				if(com[i]==com[j]) {  // 새로운 난수가 이전 난수와 같다면 다시 입력
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		Scanner sc=new Scanner(System.in);
		
		//사용자 입력
		while(true) {
			
			//입력
			System.out.println("세자리 정수 입력: ");
			int input=sc.nextInt();
			
			//오류처리-1
			if(input<100 || input>999) { // 정상입력 && 오류입력 ||
				System.out.println("잘못된 입력입니다");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=(input%10);
			
			//오류처리-2
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 숫자는 입력이 불가합니다.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 입력할 수 없습니다.");
				continue;
			}
			
			//계산 로직
			int s=0, b=0; //같은 자리 같은수 s , 같은수 b
			for(int i=0; i<3; i++) {
				for(int j=0; j<3;j++) {
					if(com[i]==user[j]) {					
						if(i==j) { //같은 자리, 같은 수
							s++;
						}
						else
							b++;
					}
				}
			}
			
			//힌트 및 결과 로직
			if(s==3) {
				System.out.println("You Win!!");
				break;
			}
			System.out.printf("input:%d, Result: S-%d B-%d\n\n",input,s,b);
			
			
			
		}*/
				

	}

}
