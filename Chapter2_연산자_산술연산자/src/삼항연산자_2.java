/*
 *   컴퓨터 / 사용자 -> 가위바위보
 *   가정 0-가위, 1-바위, 2-보
 *   
 *   컴퓨터 난수(0~2)
 *   사용자 입력
 *   컴퓨터/ 사용자 확인
 *   결과값
 */
import java.util.Scanner;
public class 삼항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컴 난수 발생
		Scanner scan = new Scanner(System.in);
		int com=(int)(Math.random()*3);
		
		//사용자 입력
		System.out.println("가위(0), 바위(1), 보(2) 입력 : ");
		int user=scan.nextInt();
		
		//확인
		System.out.println(com==0?"컴퓨터 가위":"");
		System.out.println(com==1?"컴퓨터 바위":"");
		System.out.println(com==2?"컴퓨터 보":"");
		
		System.out.println(user==0?"플레이어 가위":"");
		System.out.println(user==1?"플레이어 바위":"");
		System.out.println(user==2?"플레이어 보":"");
		
		System.out.println("=====결과=====");
		
		/*
		 * 경우의수로 코드수 감소
		 */

		/*
		 * System.out.println(com==0 && user ==0?"비김" : ""); System.out.println(com==0
		 * && user ==1?"유저승" : ""); System.out.println(com==0 && user ==2?"컴승" : "");
		 * 
		 * System.out.println(com==1 && user ==0?"컴승" : ""); System.out.println(com==1
		 * && user ==1?"비김" : ""); System.out.println(com==1 && user ==2?"유저승" : "");
		 * 
		 * System.out.println(com==2 && user ==0?"유저승" : ""); System.out.println(com==2
		 * && user ==1?"컴승" : ""); System.out.println(com==2 && user ==2?"비김" : "");
		 */
		int res =com-user;
		System.out.println(res==0?"비김":"");
		System.out.println(res==-1 || res==2?"유저승":"");
		System.out.println(res==-2 || res==1?"컴터승":"");


		

	}

}
