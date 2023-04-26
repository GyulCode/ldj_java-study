package com.sist.util;
import java.text.SimpleDateFormat;
/*
 *  Date : java.util
 *  1) 시스템의 현재 시간/날짜를 읽어오는 클래스
 *     -----
 *  2) Date클래스의 단점 -> 기능이 빈약하다
 *       |              날짜만 저장하는 클래스 (오라클의 데이터형과 호환)
 *      보완 -> calendar
 *  3) Date -> SimpleDateFormat-> java.text
 *  4) 사용처 : 웹(등록일)
 */
import java.util.*;

public class 라이브러리_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");// mm은 대문자로 구분
		System.out.println(sdf.format(date));
		/*
		 * 년도 : yyyy(2023) yyy(023)
		 * 월 : MM 01 M 1 // 대문자 주의
		 * 일 : dd 01 d 1
		 * 시간 : hh 01 h 1
		 * 분 : mm 01 m 1
		 * 초 : ss 01 s 1
		 * 
		 * 
		 */

	}

}
