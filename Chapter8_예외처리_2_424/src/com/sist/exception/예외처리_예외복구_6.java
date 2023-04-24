package com.sist.exception;
/*
 *   예외발생시 메세지 확인 -> 자바에서 지원
 *   getMessage() -> 에러에 대한 메세지만 전송
 *   -> 에러에 대한 숙달
 *   printStackTrace() -> 실행하는 과정 -> 어디서 에러가 발생 했는지 확인
 *   
 *   오라클 연결
 *   --- 게시판 (500줄)
 *   null - 7줄 에러
 */

public class 예외처리_예외복구_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr=new int[100];
					arr[100]=100;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			// 자바자체에서 오류가 어디서 났는지알려주는거
			e.printStackTrace();
			System.err.println(e.getMessage());
			
		}

	}

}
