package com.sist.util;

import java.util.Calendar;
import java.util.Scanner;

//date -> calendar

public class 라이브러리_Calendar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterint the year : ");
		int year =sc.nextInt();
		System.out.println("Enterint the month : ");
		int month =sc.nextInt();
		System.out.println("Enterint the day : ");
		int day =sc.nextInt();
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // 읽기시 0~11이라 맞춰 주기 위해 -1
		cal.set(Calendar.DATE, day);
		
		System.out.println("====년도 출력 ====");
		System.out.println("년도 : "+cal.get(Calendar.YEAR));
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1)); // 출력시 0~11 이라 +1 해줘서 1~12
		System.out.println("일 : "+cal.get(Calendar.DATE));
		String[] week= {"일","월","화","수","목","금","토"}; // month 0번부터 일은 1부터
		System.out.println("요일 : "+week[cal.get(Calendar.DAY_OF_WEEK)-1]); // week 1~7 (일~토)
		
		
		
		

	}

}
