package com.sist.lang;
/*
 *   StringBuffer
 *   ------------
 *   1. String 고정형 -> 변경이 되면 새로운 메모리를 생성 원본은 그대로 유지
 *   예) String s= "Hello Java";
 *      s=s.substring(0,5) //공백까지 잘라옴
 *   
 *   2. String을 보완 -> 가변형 -> StringBuffer(비동기) / StringBuilder(동기)
 *   **프로그램에서 동기(한개씩수행) / 비동기 동시에 여러개 일 수행
 *   
 *   네트워크 : 클라이언트(요청) / 서버(응답)
 *     -> 오라클 (자바(요청->SQL)/오라클 서버)
 *     
 *     -> 웹(클라이언트/ 서버)
 *                  ----JSP/Spring
 *   
 */
import java.io.*;
import java.net.*;
import java.nio.Buffer;
//-> 클래스 -> 
public class 라이브러리_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			StringBuffer sb=new StringBuffer();
					URL url=new URL("https://www.10000recipe.com/recipe/list.html");
					HttpURLConnection conn=(HttpURLConnection)url.openConnection();
					
					if(conn!=null) {
						while(true) {
							BufferedReader br=new BufferedReader(
									new InputStreamReader(conn.getInputStream(),"UTF-8"));
							
							String msg=br.readLine();
							if(msg==null) break;
							sb.append(msg+"\n");
							
							
						}
						conn.disconnect();
					}
					System.out.println(sb.toString());
		} catch (Exception ex) {ex.printStackTrace();
			// TODO: handle exception
		}

	}


}
