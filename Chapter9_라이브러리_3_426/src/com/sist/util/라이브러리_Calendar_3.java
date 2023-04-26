package com.sist.util;
//log파일에서 long형으로 숫자 값들어 왔을때 DATE로 다시 바꾸는거
import java.awt.desktop.ScreenSleepEvent;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class 라이브러리_Calendar_3 {
	
	public static void log() {
		SimpleDateFormat sdf=new SimpleDateFormat("mm분 ss초");
		long start=System.currentTimeMillis();
		Date date1=new Date(start);
		System.out.println(sdf.format(date1));
		for(int i=0;i<10; i++) {
			try
			{
				Thread.sleep(100);
			}catch(Exception ex) {}
		}
		long end=System.currentTimeMillis();
		long result = end-start;
		System.out.println(result);
		Date date2=new Date(end);
		System.out.println(sdf.format(date2));

	}
	
	public static void main(String[] args) {
//		long a=System.currentTimeMillis();
//		Date date=new Date(a);
//		System.out.println(date);
		log();
	} 
	

}
