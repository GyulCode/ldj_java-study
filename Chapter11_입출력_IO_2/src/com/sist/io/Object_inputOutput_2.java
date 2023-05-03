package com.sist.io;
import java.util.*;
import java.io.*;
public class Object_inputOutput_2 {
	
	public static void main(String[] args) throws Exception{
		FileInputStream out=
				new FileInputStream("c:\\java_datas\\sawon.txt");
		ObjectInputStream ois=
				new ObjectInputStream(out);
		List<Sawon>list=(List<Sawon>)ois.readObject();
		for(Sawon s:list) {
			System.out.println(s.getSabun()+
					s.getName()+
					s.getDept()+
					s.getJob()+
					s.getPay());
		}
		
	}

}
