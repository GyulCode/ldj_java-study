// while
// 갯수 모를떄 사용 예시
import java.io.*;
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i=0;
			FileReader fr=
					new FileReader("C:\\javaDev\\javaStudy\\Chapter3_제어문_반복문_2\\src\\반복문_3.java");
			while((i=fr.read())!=-1) //-1 파일 종료 
			{
				System.out.print((char)i);
			}
			
		}catch(Exception ex) {}
		

	}

}
