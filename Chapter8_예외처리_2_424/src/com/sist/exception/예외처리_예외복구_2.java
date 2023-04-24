package com.sist.exception;
/*
 *   예외를 수정하는 것이 아니다 -> 에러발생한 소스를 건너뛴다
 *   형식
 *   --
 *   try
 *   {
 *      문장1
 *      문장2 -> 에러발생 -> catch로 이동
 *      문장3
 *      //try안에서 선언해 두면 밑에꺼는 pass
 *   }catch(예외처리 종류)
 *   {
 *      문장4
 *   }
 *   문장5
 *   문장6
 *   순서 : 1 4 5 6
 *   
 *   ***HTML은 중간문장을 건너뛰고 수행 인터프리터여서 그럼
 * 
 */

public class 예외처리_예외복구_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		}catch(ArithmeticException e) {//0나누기 오류
//			ArrayIndexOutOfBoundsException 배열범위 초과
			
		}

	}

}
