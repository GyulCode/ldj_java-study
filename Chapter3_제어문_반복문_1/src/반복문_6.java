//updown Game
/*
 * 컴퓨터의 난수 발생(1~100) 사이 난수
 * -> 사용자 입력
 * -> 입력시 힌트
 * -> for문 횟수 ?
 * 		-> 무한루프 : for(;;) == while(true)
 */
import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*100)+1;
		int count=0;
		Scanner sc=new Scanner(System.in);
		

		
 
			for(;;) {
				System.out.println("1~100사이의 정수를 입력하세요: ");
				int user=sc.nextInt();
				
				if(user>=1 && user<=100) {
					
					count++;
					//힌트
					if(com>user){
						System.out.println("입력한 수보다 큰값을 입력하세요");
					}
					else if(com < user){
						System.out.println("입력한 수보다 작은값을 입력하세요");
					}
					else if(com==user){
						System.out.println("You Win!!");
						System.out.println("시도횟수"+count);
						System.exit(0);
					}
					
				}
				else
					System.out.println("범위 초과입니다 다시입력");
				

				}
			}				
		

}
