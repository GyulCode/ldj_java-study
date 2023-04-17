package com.sist.main;

import lombok.Getter;
import lombok.Setter;
//롬복 자동으로 게터 세터를 생성해줌
@Getter
@Setter
class Sawon{
	private int sabun;
	private String name;
	private String detp;
	private String loc;
	private int pay;
}

public class 접근지정어_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1명 저장
		Sawon sa=new Sawon();
		// sa-> sabun, name, dept, loc, pay
		sa.setSabun(1);
		sa.setName("홍길동");
		sa.setDetp("개발부");
		sa.setLoc("서울");
		sa.setPay(3000);
		
		System.out.println(sa.getSabun()+" "
		+sa.getDetp()+" "
				+sa.getLoc()+" "
		+sa.getPay()+" ");

	}

}
