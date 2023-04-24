package com.sist.exception;
/*
 *    배열에 데이터를 저장 -> 범위초과
 *    나누기를 처리 -> 0
 *    기타 예외 -> 통합
 *    예외 처리는 계층구조가 중요하다
 *    크기에 순서가 있어서 가장큰 예외처리는 마지막에 적어둬야지 안그러면 작은친구들이 에러발생함
 *    RuntimeException > ArrayIndexOutOfBoundsException
 *    runtime에러를 위에 적으면 오류임
 *    
 *    
 */

public class 예외처리_예외복구_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=2;
			System.out.println(arr[0]/arr[1]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열범위 초과");
			
		}catch(ArithmeticException e){
			System.out.println("0나누기 에러");
			
		}catch(RuntimeException e){
			System.out.println("기타 에러");
			
		}
		System.out.println("프로그램 종료");

	}

}
