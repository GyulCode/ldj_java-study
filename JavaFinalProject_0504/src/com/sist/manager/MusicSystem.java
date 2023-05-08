package com.sist.manager;
import java.io.*;
import java.util.*;
public class MusicSystem {
	// 데이터 읽기 //추후에 여긴 오라클로 바꿈
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
	
	// 뮤직 데이터 20개씩 나눠서 전송
	public List<GenieMusicVO> musicListData(int page){
		List<GenieMusicVO> gList=new ArrayList<GenieMusicVO>();
		int j=0;
		int rowSize=20;
		int start=(page-1)*rowSize;
		
		/*
		 * 1page -> 0~19
		 */
		for(int i=0; i<list.size();i++) {
			if(j<rowSize && i>=start) {
				gList.add(list.get(i));
				j++;
			}
		}
		return gList;
	}
	
	
	// 총페이지
	public int musicTotalPage() {
		return (int)(Math.ceil(list.size()/20.0));
	}
	
	public List<GenieMusicVO> musicCategoryData(int cno) {
		List<GenieMusicVO> mList=
				new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo:list) {
			if(vo.getCno()==cno) {
				mList.add(vo);
			}
		}
		return mList;
	}
	public List<GenieMusicVO> musicFindData(String title){
		List<GenieMusicVO> mList=
				new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo: list) {
			if(vo.getTitle().contains(title)){
				mList.add(vo);
			}
		}
		return mList;
		
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
