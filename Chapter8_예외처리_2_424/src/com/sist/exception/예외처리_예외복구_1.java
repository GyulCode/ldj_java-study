package com.sist.exception;
//p267 try~catch(예외복구)
/*
 *   try : 정상실행하는 코딩
 *   catch : 예외가 발생했을때 복구하는 과정(여러개 사용이 가능) -> 순서는 계층구조를 따라감
 *   예외처리 -> 소스상에서 수정이 가능(가벼운 에러)
 *      사전에 에러를 방지하는 프로그램
 *      비정상 종료를 방지하고 정상 종료가 가능하게 만드는 목적
 *      계층구조(상속도)
 *      Object 모든 클래스의 상위 클래스(모든 클래스는 Object상속을 받는다)
 *         |         
 *      Throwable : 에러의 최상위 클래스
 *         1. Error : 처리가 불가능 -> 메모리부족, 스레드 충돌(윈도우와 관련)
 *         2. Exception : 처리가 가능 -> 0으로 나누기, 정수변환의 문제, 형변환, 파일명오류, 웹에서 URL/IP틀린경우, 객체가 null일때 접근
 *      
 *      Exception : 예외처리 최상위 클래스
 *         1. CheckedException : 컴파일시에 예외처리를 했는지 여부 확인 반드시 예외처리를 해야한다
 *         2. UnCheckedException : 컴파일시에 예외처리를 확인하지 않는다 필요시에만 예외처리
 *         
 *         Exception
 *            |
 *   -----------------------
 *   1) CheckedException : 컴파일시
 *      IOException : 파일 입출력, 메모리 입출력, 네트워크 입출력(java.io)
 *      SQLException : 오라클 연결(오라클이 인식하는 단어 : SQL)
 *         JDBC == DBCP == ORM(MyBatis, JPA)
 *         Web = 핵심(데이터베이스 연동)
 *      MalformedURLException : IP/Web URL
 *         (java.net)
 *      ClassNotFounException : 클래스이름으로 메모리 할당 -> 클래스명, 패키지명 오류
 *         스프링에서주로 사용하는기술(리플렉션) -> 단 리플렉션은 private까지 접근이 가능..!
 *      
 *      A a=new A(); Class.forName("A")
 *      InterruptedException : 쓰레드(한개의 프로세스안에서 여러개의 프로그램을 동시에 사용가능)
 *         충돌과 관련
 *      java.lang / java.util -> 예외처리와 관련이 없다
 *      예외처리는 필수 : 정상상태를 유지 -> 견고한 프로그램을 만든다
 *   2) UnCheckedException : 예외처리는 필요한 경우에만 사용
 *        Exception
 *            | 
 *     RuntimeException : 계산기 0나누기는 0이 입력전까지 오류가아님 (프로그램 실행시 발생오류)
 *     사용자 입력, 프로그램 실수
 *            |
 *     NumberFormatException : 정수변환에서 에러
 *        Wrapper : 기본형을 사용하가 쉽게 클래스형으로 제작
 *        boolean -> Boolean
 *        int -> Integer
 *        double -> Double
 *        
 *        Integer.parseInt(" 10"); 공백오류 -> 윈도우/Web(문자열만 사용)
 *        웹에서 전송된 데이터를 받는 경우
 *        String getParameter() -> 정수형변환
 *        Jsoup : 데이터 수집(String)
 *        ArrayIndexOutOfBoundsException : 배열범위 초과
 *           컬렉션
 *           
 *        ArithmeticException : 0으로 나눌경우
 *        NullPointerException : 객체나 배열에 주소가 없는경우
 *           A a; , int[] arr;  -> null
 *           ---new() A가없다
 *        ClassCastException : 클래스 형변환이 잘못된 경우
 *        B b=(B)new A();
 *        
 *        예외처리의 기본 p267
 *        try ~catch
 *        형식)
 *           try
 *           {
 *              정상수행이 가능한 코딩
 *           }catch(예외처리의 종류 설정)
 *           {
 *              수행과정에서 오류발생시 처리되는 부분
 *           }
 *           
 *           try catch -> 소스 전체 처리
 *                        ---------- 
 *                        부분 처리 : 제외
 *   
 *     
 *      
 *    
 */

public class 예외처리_예외복구_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		for(int i=1; i<=10; i++) {
//			try {
//				
//			int j=(int)(Math.random()*3); //012
//			int k=i/j;
//			System.out.println("i="+i+", j="+j);
//			
//			}catch(Exception ex)
//			{
//				System.out.println("0으로 나눌 수 없다");
//			}
//			
//		}
		
		
		try
		{
			for(int i=1; i<=10; i++) {
				
				int j=(int)(Math.random()*3); //012
				int k=i/j;
				System.out.println("i="+i+", j="+j); //for문 탈출하게됨 예외 발생으로
			}
				

		}catch(Exception ex)
		{
			System.out.println("0으로 나눌 수 없다");	
		}
	}
}
