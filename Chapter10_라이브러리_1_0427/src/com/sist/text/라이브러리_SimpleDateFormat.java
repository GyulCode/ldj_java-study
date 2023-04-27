package com.sist.text;
/*
 *  java.text -> 출력 형태를 만들어서 사용(변경)
 *    SimpleDAteFormat : 날짜변환
 *    Decimalformat : 숫자변환
 *    ----------------------가격출력 10,000원
 *    MessageFormat : 데이터베이스 -> Insert, Update
 */
import java.util.*;
import java.text.*;
//import java.sql.*;

public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date=new Date(); //util 과 sql 패키지 둘다 date를 갖고 있어서 따로 지정이 필요함
		java.util.Date date=new java.util.Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
		// yyyy-mm-dd 또는 /을 사용
		System.out.println(sdf.format(date));
		/*
		 * yyyy  rrrr
		 * MM    mm
		 * dd    dd
		 * hh    hh24
		 * mm    mi
		 * ss    ss
		 */

	}

}
