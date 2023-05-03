package com.sist.io;
// 파일 읽기

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *    Front-End
 *    html css javascript(es6)
 *    jquery
 *    vuejs -> vue3, vues
 *    reactjs -> redux, mobx
 *    -------
 *    Nodejs
 *    typeScript
 *    ---------
 *    시간상 못나갈듯
 *    
 *    Back-End
 *    스프링
 *    Jsoup, Json, Mybatis, jpa
 *    
 *    ------------------------------------------------
 *    입출력시 사용하는 라이브러리
 *    1) 메모리 입출력 : 표준입출력 -> System.in Sytem.out
 *    2) 파일 입출력 : 웹) 업로드 / 다운로드
 *       -> XML(SpringFramwork, Mybatis)
 *          JSon(JavaScript연동), Properties(Spring boot)
 *       -> 외우에서 데이터 읽기 임시 저장용(txt)
 *       csv 오라클 데이터 백업
 *       mysql, mssql mariaDB
 *       Mysql -> 오라클 -> CSV  
 *    3) 네트워크 입출력 : 웹서버 이미 구현(톰캣) -> CRUD
 *       자바 -> 입출력을 하기 위한 장치 -> stream
 *       데이터 이동
 *       1 byte 이동
 *          -바이트 스트림-
 *          ~inputstream
 *          ~outputstream
 *           read(), write(), IO -> CheckedException 예외처리는 기본
 *           IO라이브러리 사용시 반드시 닫기 close()
 *          
 *       2 byte 이동
 *          -문자 스트림-
 *          ~Reader
 *          ~Writer
 *           char
 *           read(), write()
 *           
 *    입출력 속도가 느린데 속도를 빠르게 하기 위해 Buffer 사용 -> 데이터를 모아 받고 한번에 전송
 *       String -> BufferedReader / BufferedWriter
 *       
 *      
 */
public class 입출력_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			
			long start = System.currentTimeMillis();
			
			// 다른폴더 파일을 복붙 
			fis=new FileInputStream("C:\\유틸\\eclipse-jee-2023-03-R-win32-x86_64.zip");
			BufferedInputStream bis=
					new BufferedInputStream(fis);
			
			fos=new FileOutputStream("c:\\java_datas\\eclipse3.zip");
			BufferedOutputStream bos=
					new BufferedOutputStream(fos);
			
			int i=0; // 읽은 바이트수
			byte[] buffer=new byte[1024]; // 파일복사
			while((i=bis.read(buffer,0,1024))!=-1) {
				bos.write(buffer,0,i);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("파일 복사시간: "+(end-start));
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		} finally {
			
			try {
				fis.close();
				fos.close();
			} catch (Exception ex) {

			}
		}
		

	}	

}
