package com.sist.io;
import java.io.*;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
//		// file 설정
//		File file = new File("C:\\javaDev\\shcool.txt");
//		
//		// file존재여부 확인
//		if(!file.exists()) { // 파일이 존재하지 않는경우
//			file.createNewFile();
//		}
//		System.out.println("파일 만들기 성공");
			
//			File dir=new File("c:\\java_datas");
//			if(!dir.exists()) {
//				dir.mkdir();
//				System.out.println("폴더 만들기 완성");
//
//			}
			
			
			File dir=new File("c:\\java_datas");
			File[] files=dir.listFiles();
			for(File f:files) {
				if(f.isFile()) {
					System.out.println(f.getName()+" "+f.length());
				}else if(f.isDirectory()) {
					System.out.println(f.getName()+"DIR");
				}
			}
		
		}catch(Exception ex) {}	
	}

}
