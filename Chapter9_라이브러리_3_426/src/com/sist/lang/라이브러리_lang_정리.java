package com.sist.lang;
/*
 *   java.lang -> 기본 (가장 많이 사용되는 클래스의 집합)
 *   **import를 생략할 수 있다.
 *   
 *   Object : 최상위 클래스 -> 모든 클래스 Object상속
 *            ------- 데이터형으로 사용(가장 큰 데이터형)
 *            Object o=10 , 10.3 , "" , 'A', true , new 클래스()
 *            여러개의 데이터형을 묶어서 관리
 *            Object[] oo ={10,,10.4,'A'}
 *            리턴형 / 매개변수 -> 대부분 Object
 *            -> 형변환 제네릭스
 *            기본형 = 클래스 = 오토박싱
 *            클래스 = 기본형값 = 언박싱
 *         -> 기능
 *            1) clone : 복제
 *            2) toString : 객체를 문자열화
 *            3) finalize : 소멸자
 *            4) equals : 비교(기본 ->주소값, 실제값을 비교 -> 오버라이딩
 *            
 *   String : 문자열 저장 클래스
 *            기능
 *            length()
 *            substring()
 *            trim()
 *            charAt()
 *            replace()
 *            equals()
 *            startsWith()
 *            contains()
 *            indexOf()
 *            lastIndexOf()
 *            valueOf()
 *            
 *   StringBuffer : append() 문자열 결합
 *   Wrapper : 
 *             int
 *             long      
 *             double    Double
 *             boolean
 *             ->기본형을 객체형으로 저장, 문자열을 기본형으로 변경할때
 *             Integer.parseInt(), Boolean.parseBoolean()
 *   Math : 수학
 *          = random() : 난수발생 (0.00 ~ 0.99)
 *          = ceil() : 올림메소드
 *          = round() : 반올림 메소드, 평균, 통계
 *   System 
 *          = System.currentTimeMills() : 실제 기간을 -> long
 *            로그파일 -> 웹
 *          = System.gc() : 가비지 컬렉션 호출 (메모리회수)
 *          = System.out : 화면 출력(OutputStream)
 *          = System.in : 키보드 입력값, 파일(inputStream)
 */


import java.util.*;

public class 라이브러리_lang_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List list=new ArrayList();
//		list.add("AAA");
//		list.add(1);
//		String a=(String)list.get(0);
//		int b=(Integer)list.get(1);
//		
//		int aa=new Integer(10); //일반데이터형도 받을 수는 있다
		String s="abcdefg";
		System.out.println(s.substring(1,3));
		
		
		

	}

}
