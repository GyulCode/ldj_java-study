package com.sist.util;
/*
 *   라이브러리
 *   = 자바에서 지원
 *     java.lang ... java.net  , java.text , ... java.sql
 *   = 외부업체 지원
 *     JSoup(HTML parse) , 셀레니움 , MyBatis, Spring , DBCP
 *   = java.lnag
 *     import 생략가능 
 *     Object -> 최상위 클래스, 모든 데이터형을 받을 수 있다, 저장 일반 기본형, 사용자정의 클래스 -> 기본적으로 설정 OBject 형변환
 *     주요기능 
 *       clone() : 복제 (새로운 메모리 생성) -> 디자인 패턴(GOF 23)    
 *       finalize() : 소멸자 (자동 호출 -> 메모리해제)
 *       toString() : 객체를 문자열화
 *       equals() : 객체 비교
 *       System : gc() / System.out , System.in -> 표준입출력
 *       Math : 수학 
 *              round() 반올림
 *              ceil() 올림
 *              random() 난수
 *       StringBuffer : 문자열이 많은 경우 (제어)
 *              append() 문자열 결합
 *              delete() : 문자제거
 *              insert() : 문자열 추가
 *       String : 문자열을 쉽게 제어가 가능하게만든 클래스
 *                웹, 윈도우, 빅데이터 (Ai)
 *                equasl(), trim(), substrin()
 *                length(), valueof() contains()
 *                startsWith(), split(), replace() replaceall()
 *   = java.util : 사용빈도가 많다
 *     StringTokenizer : 문자얼 분리 / 쉽게 분리  
 *       counterToken() :  분리된 단어의 갯수
 *       hasMoretokens()  분리된 개수만큼 반복문 수행
 *       nextToken() : 실ㅈ 분리된 단어 읽기
 *   = Wrapper : 기본형을 클래스화
 *       Integer -> int
 *       Double -> double
 *       등등
 *       parseInt(), parseDouble(), parseBoolean()...
 *       웹은 무조건 데이터가 String
 *       요청 -> string -> 요청처리(응답)
 *   = Integer i=10 -> 실제값(리터럴) 대입 -> 오토박싱
 *     int a = new Integer(10) -> 기본형에서 클래스 객체값을 받는다 -> 언박싱
 *   = Random
 *       nextInt(int bound)
 *       nextInt(10) -> 0~9
 *   = Arrays : 배열을 쉽게 관리할 수 있다.
 *        sort()
 *        toString() : 배열 출력 : 정렬
 *        asList() : List형 변환
 *   = 날짜관련
 *        Date : 기능이 없다 -> 다른 프로그램과 호환
 *               오라클/MySQL에서 전송된 날짜 데이터를 받는 경우에 사용
 *               날짜 저장용으로 주로 사용
 *        Calendar : 날짜에 대한 기능이 필요시 사용 -> Date를 보완한 클래스
 *                   set() 년/월/일/시간/분/초
 *                   get() 
 *                   요일 읽기 -> get(Calendar.DAY_OF_WEEK)
 *                   각달의 마지막 날 -> getActualMaximum()
 *   = 배열을 대체
 *      = 3대 클래스
 *         =String , Integer , List
 *      컬렉션 (데이터를 쉽게 관리) -> 10개 (자동으로 저장공간이 설정)
 *      Collection
 *          1. List
 *                Arraylist
 *                Vector
 *                LinkedList - Queue
 *                제네릭스
 *          2. Set
 *                Hashset(o)
 *                TreeSet
 *          3. Map -> 인터페이스(키 값)
 *                HashMap(o)
 *                Hashtable(o)
 *   
 */
import java.util.*; //Calenadr Scanner
public class 라이브러리_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("년도 입력 : (2023 4)");
		int year=sc.nextInt();
		int month=sc.nextInt();
		
		// 추싱클래스는 미완성된 클래스메소드가 구현이 안되어 있음
		// 구현할 클래스를 이용한다, 싱글턴(NewInstance(), getInstance())
		Calendar cal=Calendar.getInstance(); // new를 사용 안하고 좌우에 생성자가 아닌 메소드로 초기화시키고 있다 -> 추상
		// 1일자의 요일을 가져온다.
		/*
		 * ex) 클래스명 객체명 = new 생성자() -> 추상, 상속, 인터페이스
		 *     클래스명 객체명 = 메소드() -> 추상클래스
		 */
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE,1);
		
		// 요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		// 입력달의 미자믹날
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		// 달력출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i=1; i<=lastday;i++) {
			if(i==1) {// 맨처음 -> 공백을 설정
				for(int j=0; j<week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {// 일요일이면 줄바꿈
				week=0;
				System.out.println();
			}
		}
				
		
		

	}

}
