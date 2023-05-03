package com.sist.io;
// 파일 읽기
// FileInputStream 1byte / FileReader (2byte)
// 한글이 포함 -> 무.조.건 reader
import java.io.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader=null;
		
		try {
			reader=new FileReader("c:\\javaDev\\movie.txt");
			
			BufferedReader in = new BufferedReader(reader); //buffered 8192byte씩 읽음
			
			int i=0;
			// int read() -> 글자의 아스키 코드값을 읽어옴(숫자로 되어 있음)
			// int read(byte[], int, int) -> 읽은 바이트수
			long start = System.currentTimeMillis();
			
			/*
			while((i=in.read())!=-1) { // 한글자씩 읽기 buffer 0.866초 일반 0.877초
				System.out.print((char)i);
			}
			*/
			
			while(true) {
				String data=in.readLine(); // 줄씩읽어 오기 buffer 0.035초
				if(data==null){
					break;
				}
				System.out.println(data);
			}
			
			long end=System.currentTimeMillis();
			System.out.println("파일 복사시간: "+(end-start));
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		} finally {
			
			try {
				reader.close();
			} catch (Exception ex) {
				
			}
			
		}
		

	}

}
