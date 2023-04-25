package com.sist.lib;
class Card{
	private int number;
	private String type;
	public Card() {
		number=7;
		type="♥";
	}
	public void print() {
		System.out.println(number+type);
	}
}

public class 라이브러리_Object_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1=new Card();
		c1.print();
		System.out.println("----------");
		
		try
		{
			Class clsname=Class.forName("com.stst.lib.Card");
			Object obj=clsname.getDeclaredConstructor().newInstance();
			
			//객체 생성
			((Card)obj).print();
		}catch(Exception ex) {}

	}

}
