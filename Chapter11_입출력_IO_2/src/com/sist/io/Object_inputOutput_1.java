package com.sist.io;
/*
 *        
 */
import java.io.*;
import java.util.*;

public class Object_inputOutput_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		List<Sawon> list = new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","대리",4500));
		list.add(new Sawon(2,"마리오","게임부","과장",5500));
		list.add(new Sawon(3,"심심이","기획부","사원",3500));
		list.add(new Sawon(4,"이지금","자재부","부장",6500));
		list.add(new Sawon(5,"강씨","총무부","대리",4500));
		
		FileOutputStream fos=
				new FileOutputStream("c:\\java_datas\\sawon.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		// file단위 문자열 -> 객체 단위로 저장
		oos.writeObject(list);
		fos.close();
		oos.close();
		System.out.println("객체 단위 저장 완료");
		
				
		

	}

}
