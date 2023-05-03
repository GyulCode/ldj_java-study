package com.sist.io2;
import java.io.*;
import java.util.*;
public class MusicSystem {
	// 데이터 읽기
	private static List<GenieMusicVO> list =
			new ArrayList<GenieMusicVO>();
	
	static {
		
		// 초기화 블럭
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("c:\\java_datas\\genie_music.txt");
			ois=new ObjectInputStream(fis);
			list=(List<GenieMusicVO>)ois.readObject(); // 객체단위로 저장
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception ex) {

			}
		}
	}
	
	public void musicCategoryData(int cno) {
		for(GenieMusicVO vo:list) {
			if(vo.getCno()==cno) {
				System.out.println(vo.getNo()+"."+vo.getSinger());
			}
		}
	}
	
	public static void main(String[] args) {
		MusicSystem ms=new MusicSystem();
		try {
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1), 팝(2), ost(3), 트롯(4), 재즈(4), 클래식(5)");
			String cno=in.readLine();
			ms.musicCategoryData(Integer.parseInt(cno));
		} catch (Exception ex) {
			
		}
	}

}
