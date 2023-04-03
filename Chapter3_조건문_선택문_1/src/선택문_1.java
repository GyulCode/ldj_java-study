/*
 *   switch ~case
 *   -> 범위를 지정하는 것이 아니라 특정값으로 설정
 *   -> 사용이 가능한 특정값은 char(문자), 정수, 문자열
 *   					 ''				 ""
 *   많이 사용되는 위치 : 게임(키보드별 처리), 메뉴별, 네트워크(기능별)
 *   웹 -> 화면 전환
 *   -> 형식)
 *   switch(문자, 문자열, 정수)
 *   {
 *   			B->입력시 case 'B', 'C', default문이 실행됨 -> break 사용할것!
 *     case 'A':
 *     		문장 1
 *     case 'B':
 *     		문장 2
 *     case 'C':
 *     		문장 3 
 *     default :
 *     		문장 4 //'A', 'B'의 값이 아닌경우 처리되는문장 생략가능
 *               
 *   }
 */
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=======메뉴=======");
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.로그아웃");
		System.out.println("4.맛집추천");
		System.out.println("5.레시피만들기");
		System.out.println("6.프로그램 종료");
		System.out.println("=================");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("메뉴를 입력하세요(1~6) : ");
		int menu=sc.nextInt();
		
		switch(menu)
		{
		case 1:
			System.out.println("로그인을 요청하셨습니다!!");
			break;
		case 2:
			System.out.println("회원가입을 요청하셨습니다");
			break;
		case 3:
			System.out.println("로그아웃을 요청하셨습니다");
			break;
		case 4:
			System.out.println("맛집추천을 요청하셨습니다");
			break;
		case 5:
			System.out.println("레시피 만들기를 요청하셨습니다");
			break;
		case 6:
			System.exit(0); //프로그램 완전 종료
			//0이면 정상 종료, 다른 번호면 비정상 종료
			//System.out.println("프로그램 종료를 요청하셨습니다");
			break;
		default : //없는메뉴 선택시
			System.out.println("없는 메뉴입니다.");
			
		}

			
			
			
		

	}

}
