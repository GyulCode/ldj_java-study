/*
 *   1. if~else if : 다중 조건문과 switch는 유사한 제어문
 *     = if ~else if : 범위가 있는 경우
 *     = switch 한개가 선택될 경우 (웹에서는 많이 사용하지 않는다)
 *   2. switch에서 문법 사항
 *     = switch에서 처리 할 수 있는 데이터형(char, String, 정수)
 *     = case 값:
 *     		종료시 break;
 *     = default : 생략이 가능
 *     = 여러개를 같은 문장으로 처리할때는
 *     		case10
 *     		case9
 *     		case8
 *     			처리문장; = no==10 || no==9 || no==8
 *   
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=(int)(Math.random()*15)+1;
		System.out.println("month"+month);
		switch(month)
		{
		case 1: case 2: case 12:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		default :
			System.out.println("해당하는 계절이 없습니다.");
		
			
			
		}

	}

}
