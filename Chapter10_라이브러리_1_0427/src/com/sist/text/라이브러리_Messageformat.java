package com.sist.text;
import java.text.*;

public class 라이브러리_Messageformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="이름:{0}\n성별:{1}\n나이:{2}\n";
		Object[] obj= {"홍길동","남자",26};
		System.out.println(MessageFormat.format(msg, obj));

	}

}
