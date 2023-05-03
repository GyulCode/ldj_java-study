package com.sist.io;
// bufferedReader / Writer
import java.io.*;
import java.nio.BufferUnderflowException;
import java.util.concurrent.ExecutionException;
public class 입출력_4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// 기반스트림
		FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt",true); // 이미 존재할 경우 덮어쓴다, **파일 날라감
//		FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt",true); // 이경우 같은 내용을 뒤에 붙여씀
		FileReader in = new FileReader("c:\\javaDev\\movie.txt");
		
		// 버퍼스트림
		BufferedWriter bw= new BufferedWriter(out);
		BufferedReader br=new BufferedReader(in);
		
		while(true) {
			String data=br.readLine();
			if(data==null)
				break;
			
			bw.write(data+"\n");
		}
		
		System.out.println("읽기/쓰기 완료");
		out.close();
		in.close();
	
		
		

	}

}
