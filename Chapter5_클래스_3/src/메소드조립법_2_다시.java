import java.util.Calendar;
import java.util.Scanner;

public class 메소드조립법_2_다시 {
	
	//입력
	static int input(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.println(msg+"입력 : ");
		return sc.nextInt();
	}
	
	//총일수 week 구하기
	static int getweek(int year, int month) {
		int total=(year-1)*365
		+(year-1)/4
		-(year-1)/100
		+(year-1)/400;
		
		int[] lastday= {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		if((year%4==0 && year%100!=0)||(year%400==00)) {
			lastday[1]=29;
		}else
			lastday[1]=28;
		//전달까지 총 날수
		for(int i=0;i<month-1;i++) {
			total+=lastday[i];
		}
		//매월 1일자 요일확인
		total++; //+1
		int week=total%7; //%7
		
		return week;
		
	}
	
	
	static void preocess() {
		int year=input("년도");
		int month=input("월:");
		System.out.println(year+"년도"+ month+"월");
		int week=getweek(year,month);
	}

	public static void main(String[] args) {/*
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.print("년도입력: ");
//		int year =sc.nextInt();
//		
//		System.out.print("월입력: ");
//		int month =sc.nextInt();
		
//		int total=(year-1)*365
//		+(year-1)/4
//		-(year-1)/100
//		+(year-1)/400;
//		
//		int[] lastday= {
//				31,28,31,30,31,30,
//				31,31,30,31,30,31
//		};
//		
//		if((year%4==0 && year%100!=0)||(year%400==00)) {
//			lastday[1]=29;
//		}else
//			lastday[1]=28;
//		//전달까지 총 날수
//		for(int i=0;i<month-1;i++) {
//			total+=lastday[i];
//		}
//		//매월 1일자 요일확인
//		total++; //+1
//		int week=total%7; //%7
		
		//출력
//		System.out.printf("%d년도 %d월\n",year,month);
		
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0; i<strWeek.length;i++) {
			System.out.print(strWeek[i]+"\t");
		}
		
		System.out.println("\n");
		
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println("\n");
			}
		}
		
		
		//util 패키지 안에 달력
//		Calendar cal=Calendar.getInstance();
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH, month-1);
//		cal.set(Calendar.DATE, 1);
//		int week1=cal.get(Calendar.DAY_OF_WEEK);
//		int last=cal.getActualMaximum(Calendar.DATE);
*/
	}

}
