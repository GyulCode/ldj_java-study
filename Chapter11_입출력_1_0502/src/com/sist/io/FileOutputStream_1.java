package com.sist.io;
import java.util.*;
import java.io.*;

public class FileOutputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 파일 지정
			File file=new File("c:\\java_datas\\school.txt");

			// 파일 존재 여부 확인
			if(!file.exists()) {
				file.createNewFile(); // 파일 만들기 명령
			}
			// 파일이 존재할때 사용
			FileOutputStream fos = new FileOutputStream(file,true);
			
			String msg="안녕하세요 지금은 파일 입출력을하고 있습니다\r\n";
//			System.out.println((int)'안');
			fos.write(msg.getBytes());
			//  String
			fos.close();
			System.out.println("저장 완료");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
