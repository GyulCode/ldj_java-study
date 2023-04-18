package com.sist.main2;
/*
 * 1.캡슐화 데이터 보호
 * 데이터 은닉화 private, 메소드를 통해서 접근가능 다른클래스 연결 public
 * 
 * 사용자 정의 데이터형 : 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다
 * 사용자 정의 데이터형 : ~VO 
 * 
 * 인스턴스변수
 * 정적변수
 * 지역변수
 * 
 *    ***this
 *    this는 모든 클래스가 가지고 있다.
 *    객체 자신을 가리키는 참조변수다 static Object this -> new
 *    this는 생성자, 인스턴스메소드에서 사용이 가능하다
 *    static에서는 사용불가
 *    
 *    클래스메소드내에서는 사용할 수 없다
 *    인스턴스메소드, 개겣메소드
 *    객체명.메소드
 *    b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.

명시적 초기화 -> 
d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
e. 클래스변수보다 인스턴스변수가 먼저 초기화된다.

 *    
 * 
 */

class SutdaCard{
	private int num;
	private boolean isKwang;
	public int a;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
}




public class 문제 {
	private boolean at;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard sc=new SutdaCard();
		System.out.println(sc.a);

	}

}
