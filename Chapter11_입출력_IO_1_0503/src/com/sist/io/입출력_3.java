package com.sist.io;
// 파일 쓰기
import java.io.*;
public class 입출력_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter out = null; // BufferedWriter
		 
		FileReader in =null; // BufferedReader
		
		try {
			// 1. 파일 만들기
			File file=new File("C:\\java_datas\\movie.txt");
			if(!file.exists()) { //파일이 없을경우 생성
				file.createNewFile();
			}
			
			// 파일읽기
			in=new FileReader("c:\\javaDev\\movie.txt");
			out=new FileWriter(file);
//			out=new FileWriter("C:\\java_datas\\movie.txt"); // 두형식 모두 가능
			
			// 생성된 파일쓰기
			int i=0;
			while((i=in.read())!=-1){
				out.write(i); //(char)없어도 되네
			}
			System.out.println("파일 읽기/쓰기 완료");
			
		} catch(Exception ex) {
			
		} finally {
			try {
				out.close();
			} catch (Exception ex) {
				// TODO: handle exception
			}
		}

	}

}
