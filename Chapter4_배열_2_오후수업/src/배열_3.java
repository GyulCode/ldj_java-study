import java.util.Scanner;
//년도 / 월 / 일 -> 요일 => calendar(메소드 활용) 로직만 맛보기
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("년도를 입력하세요:");
		int year=sc.nextInt();
		System.out.println("월을 입력하세요:");
		int month=sc.nextInt();
		System.out.println("일을 입력하세요:");
		int day=sc.nextInt();
		
		// 요일
		char[] strWeek= {'일','월','화','수','목','금','토'};
		// 각달의 마지막날
		int[] lastday={31,28,31,30,31,30,
				31,31,30,31,30,31};
		
		if(year%4==0 && year%100!=0||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		//1년도 1월 1일 ~전년도까지의 총날수
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		
		//전달까지의 합
		for(int i=0; i<month-1;i++) {
			total+=lastday[i];
		}
		total+=day;
		//요일 구하기
		int week=total%7;
		
		System.out.printf("%d년도 %d월 %d일은 %c요일입니다.",year,month,day,strWeek[week]);
	}

}
