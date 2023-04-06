import java.util.Scanner;
public class 배열응용_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("년도를 입력하세용요오요오요ㅗ옹: ");
		int year=sc.nextInt();
		
		System.out.println("월 입력어억:");
		int month=sc.nextInt();
		
		System.out.println(year+"년 "+month+"월 ");
		System.out.println("\n");
		char[] strweek= {'일','월','화','수','목','금','토'};
		for(char c:strweek) {
			System.out.print(c+"\t");
		}
		System.out.println();
		
//		1. 1년도 1월 1일부터 ~ 전년도(2022.12.31)
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
//		2. 전달까지의 날수(2023.03.31)
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)|| year%400==0) {
			lastday[1]=29;
		}
		else
			lastday[1]=28;
		for(int i=0; i<month-1;i++) {
			total+=lastday[i];
		}
		
//		3. +1 -> 4월 1일자 요일
		total++;
		
		//요일구하기
		int week=total%7;
		
		//달력 구하기
		for(int i=1; i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0; j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				System.out.println();
				week=0;
			}
			
		}

	}

}
