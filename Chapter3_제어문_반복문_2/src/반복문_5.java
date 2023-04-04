// 가위바위보 게임
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int win=0, lose=0, same=0;
		
		while(true) {
			System.out.print("가위-0, 바위-1, 보-2, 종료-9: ");
			//사용자 난수 발생
			int com =(int)(Math.random()*3); //0,1,2
			int user=sc.nextInt();
			
			if(user==9) {
				System.out.println("게임 종료!!");
//				System.exit(0);
				break;
			}
			
			//사용자, 사용자의 가위바위보
			if(user==0)
				System.out.println("사용자 가위:");
			else if(user==1)
				System.out.println("사용자 바위:");
			else if(user==2)
				System.out.println("사용자 보:");
			
			//컴퓨터 값
			if(com==0)
				System.out.println("컴 가위:");
			else if(com==1)
				System.out.println("컴 바위:");
			else if(com==2)
				System.out.println("컴 보:");
			
			switch(com-user) {
			case -1: case 2:
				System.out.println("사용자 승리!!");
			win++;
			break;
			case 1: case -2:
				System.out.println("컴퓨터 승리!!");
			lose++;
			break;
			case 0:
				System.out.println("비겼다!!");
			same++;
			break;
			
			
			}
			
		
		}//while 종료
		 System.out.println("=======결과========");
		 int total=win+lose+same;
		 System.out.printf("%d전 %d승 %d패 %d무\n",total,win,lose,same);
		

	}

}
