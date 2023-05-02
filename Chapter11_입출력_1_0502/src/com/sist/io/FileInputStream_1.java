package com.sist.io;
/*
 *   FileInputStream : 단위 byte (1byte씩 읽어온다)
 *   -> 한글포함된 데이터는 읽을 수 있는데 한글이 깨진다
 *   zip ppt png -> 업로드/다운로드
 *   
 *   -> 주요메소드
 *      read() -> 1byte -> 리턴형 -> int
 *      close() 닫기
 *   -> 생성자
 *      new FileInputStream(File file)
 *      new FileInputStream(String path)
 * 
 */

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FileInputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 파일 읽기
			// system.in / system.out
			// 표준 입출력
			// 파일 읽기
			/*FileInputStream*/ FileReader fis= new /*FileInputStream*/FileReader("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\FileInputStream_1.java");
			int i=0; // 문자 1개의 문자를 읽어 온다 -> 문자번호를 넘겨준다 
			// 문자번호를 받는 변수

			// -1은 더이상 읽을 데이터가 없다는 뜻이다 -> EOF(문장의 끝) end of file 
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(IOException ex) {}


	}

}
