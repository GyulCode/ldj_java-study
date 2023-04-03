/*
 * 중첩 switch
 * 
 *   if문 중첩
 *   if()
 *   {
 *   	if()
 *   	{
 *   
 *   	}
 *   }
 *   
 *   switch()
 *   {
 *   	case 값:
 *   		switch
 *   		{
 *   			
 *   		}
 *   
 *   
 *   }
 *   
 */

//가위 바위 보
/*
 * 		가위
 * 		  가위
 *		  바위
 *		  보
 *		바위
 *		  가위
 *		  바위
 *		  보
 *		보
 *		  가위
 *		  바위
 *		  보
 */
import java.util.Scanner;
public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터가 먼저 가위바위보를 제시한다
		int com = (int)(Math.random()*3);//0가위, 1바위, 2보
		
		// 사용자 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("0-가위, 1-바위, 2-보 : ");
		int user = sc.nextInt();
//		String[] result = {"가위","바위","보"};
		
		//출력
		switch(com)
		{
		case 0:
			System.out.println("컴퓨터:가위");
			break; //break문 밑에서 코딩시 오류
		case 1:
			System.out.println("컴퓨터:바위");
			break;
		case 2:
			System.out.println("컴퓨터:보");
			break;
		}
		
		switch(user)
		{
		case 0:
			System.out.println("플레이어:가위");
			break; //break문 밑에서 코딩시 오류
		case 1:
			System.out.println("플레이어:바위");
			break;
		case 2:
			System.out.println("플레이어:보");
			break;
		}
		// 비교 -> 결과 출력
		
		switch(com)
		{
		case 0: //가위
			switch(user)
			{
			case 0:
				System.out.println("비겼습니다");
				break;
			case 1:
				System.out.println("사용자가 이겼습니다");
				break;
			case 2:
				System.out.println("컴퓨터가 이겼습니다");
				break;		
			}
			break;
		case 1: //바위
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터가 이겼습니다");
				break;
			case 1:
				System.out.println("비겼습니다");
				break;
			case 2:
				System.out.println("사용자가 이겼습니다");
				break;		
			}
			
			break;
		case 2: //보
			switch(user)
			{
			case 0:
				System.out.println("사용자가 이겼습니다");
				break;
			case 1:
				System.out.println("컴퓨터가 이겼습니다");
				break;
			case 2:
				System.out.println("비겼습니다");
				break;		
			}
			break;
		}
		// 변수 설정 -> 변수에 대한 처리(연산자, 제어문) -> 결과값을 출력
		
		
		
		
		

	}

}
