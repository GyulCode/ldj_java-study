package com.sist.exception;
/*
 * finally -> 생략이 가능
 * finally -> try를 수행, catch를 수행 관계없이 무조건 수행되는 문장
 * 파일 닫기, 오라클 연결 해제, 서버 연결 해제, 오라클 연결, 네트워크 연결
 * 
 * 
 *   try
 *   {
 *      정상수행
 *      ->에러(예상치 못한 에러 발생가능)
 *   }catch(예상되는 예외클래스)
 *   {
 *      에러 발생시 처리
 *      ->에러 확인, 복구 가능, 오류 메세지 전송
 *   }
 *   finally -> 생략가능
 *   {
 *      ***무조건 수행하는 문장 코딩
 *      파일닫기, 오라클 해제, 서버 해제
 *   }
 *   -> 목적 예외처리
 *   -> 멀티 예외처리
 */

public class 예외처리_예외복구_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=0;
			System.out.println(arr[0]/arr[1]);
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// 동시에 두개의 예외처리
			// TODO: handle exception
			System.out.println("에러 발생");
		}
		System.out.println("Program is terminated");

	}

}
