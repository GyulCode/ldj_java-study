package com.sist.io;
import java.io.*;
import java.net.*;

/*
 *    URlConnection
 *       1. HttpURLConnection
 *       2. HttpsURLConnection
 */

public class 입출력_5 {
	public static void main(String[] args) throws Exception{
		URL url=new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn =
				(HttpURLConnection)url.openConnection();
		
		// 연결이 되었다면
		if(conn!=null) {
			// 브라우저는 1Byte 씩 전송해줌
			// InputStreamReader : 1Byte -> 2Byte로 받을 수 있도록 해줌 ***************
			// 만약 한글이 깨진다면 UTF-8 적용
			BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			while(true) {
				String data=in.readLine();
				if(data==null) break;
				System.out.println(data);
				
			}
			in.close();
			conn.disconnect();
			
			
		}
		
	}

}
