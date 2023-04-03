//계절출력
/*
 * 3, 4, 5 : 봄
 * 6, 7, 8 : 여름
 * 9, 10, 11 : 가을
 * 12, 1, 2 : 겨울
 */
public class 다중조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=(int)(Math.random()*12)+1; //1~12
		System.out.printf("입력된달은 %d월 입니다.\n",month);
		if(month>=3 && month<=5)
			System.out.println(month+"월은 봄입니다.");
		else if(month>=6 && month<=8)
			System.out.println(month+"월은 여름입니다");
		else if(month>=9 && month<=11)
			System.out.println(month+"월은 가을입니다");
		//else if(month==12 || month==1 || month ==2)
		else
			System.out.println(month+"월은 겨울입니다");


	}

}
