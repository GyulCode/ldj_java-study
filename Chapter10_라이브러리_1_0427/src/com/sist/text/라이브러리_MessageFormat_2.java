package com.sist.text;

import java.text.MessageFormat;

public class 라이브러리_MessageFormat_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
//		String msg="{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t";
		
		String msg="이름:{0}\n 국어:{1}\n 영어:{2}\n 수학:{3}\n 총점:{4}\n 평균:{5}\n";
		//html에서 사용할떄 지정형식이 유용함
		//자주나옴

		
		Object[] obj1= {"Hong",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj1));
		Object[] obj2= {"Sim",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj2));
		Object[] obj3= {"Park",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj3));

	}
	

}
