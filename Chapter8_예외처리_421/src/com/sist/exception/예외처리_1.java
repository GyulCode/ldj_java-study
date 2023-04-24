package com.sist.exception;
/*
 *   에러 -> 컴파일(javac) / 실행시(java)
 *          Check         UnCheck -> 생략
 *            |
 *     자바문법(반드시 예외처리)
 *   에러
 *     수정이 불가능한 에러(심각한 오류) : 메모리 부족, 윈도우 덤프 -> Error
 *     수정이 가능한 에러(가벼운 오류) : 소스상에서 수정이 가능
 *     -> 파일읽기 (파일명이 틀리다), 배열 인덱스를 벗어난 경우 -> Exception(예외처리)
 *    
 *   에러가 발생
 *     1. 프로그래머의 실수
 *        초기값이 없는 상태에서 비교
 *        배열 인덱스 오류
 *        파일명 오류
 *     2. 사용자 입력 오류
 *        계산기 나누기 -> 0
 *        정수 -> 문자열...
 *        ---------------웹에서 유효성 검사
 *     예외처리 : 견고한 프로그램을 만들기 위해 사용
 *              비정상을 방지하고 정상상태를 유지
 *              사전에 에러를 방지하는 프로그램
 *   1. 예외처리 방식
 *      고려할 점 if : 예외처리
 *      예외처리 복잡한 에러, if로 해결이 불가능
 *      웹 404파일이 없는경우, 500(소스오류), 415한글변환, 400값을 잘못받은 경우 , 403접속 거부
 *   2. 예외처리 종류
 *      예외발생시 -> 복구
 *         try ~catch
 *         형식)
 *            try
 *            {
 *               정상수행문장
 *               int a=10;
 *               int b=0;
 *               double d=a/(double)b;  -> 0으로 나누는 오류발생 Catch로 이동
 *               System.out.Println(d); -> 이문장은 실행이 안됨 예외 처리가 되어도 안됨!!
 *            }catch(Exception e)
 *            {
 *               예외발생시 처리하는 영역
 *            }catch(ArrayIndexOut OfBoundsException e)
 *            {
 *               
 *            }catch(나누기...)
 *            
 *            사용자로부터 문자열을 받아서 정수 변경후에
 *            배열에 저장
 *            나누기를 한 후에 출력
 *            
 *            
 *      예외발생시 -> 회피
 *         throws                  
 *      예외발생시 -> 테스트
 *         throw
 *      사용자 정의 예외
 *         지원하지 않는 예외가 존재    
 *      
 *      예외처리의 계층구조
 *      
 *              Object
 *                 |
 *              Throwable
 *                 |
 *         ------------------
 *       error           exception
 *                           |
 *                    ------------------------- --------------------    
 *             CheckException(존재x)                          UnCheckException(존재x)
 *                    |                                              |
 *                    |                                      RuntimeException
 *              IOException(입출력)         							 |
 *                 java.io -> 클래스가 동일       				NumberFormatException
 *              SQLException(오라클 연동)						문자열 -> 정수형으로 변경
 *                 java.sql -> 네트워크 통신					윈도우/웹
 *                 자바응용프로그램 <----> 오라클					주소란
 *                 client             server				main.jsp?page=1
 *                 ->웹에서 출력하는 모든 데이터 -> 오라클			-> " 1"오류
 *              ClassNotFoundException(리플렉션)				NullPointerException
 *              -> 클래스명이 틀린경우							->객체 초기화가 안된상태
 *              	                                        ->침조할 주소가 없는 경우(선언)
 *              	                                        ArrayIndexOfOutBoundsException
 *                                                          -> 배열범위 초과시 발생
 *                                                          ArithmeticException
 *                                                          0 나누기 에러
 *                                                          ClassCastException
 *                                                          -> 형변환이 틀린 경우
 *                                                          IllegallArgumentException
 *                                                          -> 부적절한 인자 전달
 *                                                          IndexBound
 *                   
 *   263page
 *   예외의미 -> 프로그램에서 돌발적으로(의도하지 않은 상황)에서 문제가 발생시
 *   프로그램은 에러시 비정상으로 종료 -> 방지하고
 *   정상적으로 종료가 가능하게 만드는 과정(예외처리)
 *       
 */
class AAAA{
	public void display() {
		System.out.println("A:displasy is called");
	}
}
class BBBB{
	
}
class CCCC extends BBBB{
	public void disp(int a, int b, int c) {
		System.out.println(1);
	}
	
}

public class 예외처리_1 {
	static String s; // null 값
	static A a=new A(); // null 값 new로 새로 할당해 줘야함
	
	
	public static void main(String[] args) {
		String ss="Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("K"),ss.lastIndexOf("J")));
//		CCCC cc=(CCCC )new B();
		System.out.printf("%d %c %s\n",10,20,30);
		System.out.println(10/0);
		System.out.println("1");
		int[] arr=new int [2];
		arr[2]=10;
		System.out.println("2");
		if(s.equals("Hello"));
		{
			System.out.println("OK");
		}
		System.out.println("3");
		
		int a=10;
		int b=0;
		
		if(b!=0) {
			int c=a/b;
			System.out.println("c: "+c);
			
		}
		else //예외처리
		{
			System.out.println("0으로 나눌 수 없습니다!!");
		}
		//1. 정상적으로 종료가 되게 만든다
		//2. 우선적 -> if문으로 처리가 가능한지 -> 자바에 제공하는 예외처리를 이용한다
		//3. if는 주로 사용하는게 검색용도, 사용자 입력제한
		String page=" 1";
		System.out.println(Integer.parseInt(page));
		
		
		
	}

}
