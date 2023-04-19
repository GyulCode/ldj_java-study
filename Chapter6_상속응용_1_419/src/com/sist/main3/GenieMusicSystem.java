package com.sist.main3;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthOptionPaneUI;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	protected Music[] musics=new Music[50]; //모든 사람에게 공유
	protected String title="지니뮤직 Top50";
	/*
	 *   1. 초기화
	 *      인스턴스 블록
	 *      static 블록***
	 *      -------------자동호출
	 *      생성자***
	 *      
	 *      예외처리
	 *      에러 -> 소스상에서 처리할 없는 상황 -> 심각한 에러
	 *             메모리 공간 부족      
	 *      예외 -> 수정이 가능한 가벼운 에러
	 *          -> 예외복구 / 예외회피
	 *          -> 비정상 종료를 방지하고 정상 수행이 가능하게 하기 위함이다
	 *          -> io,  net,  thread, web
	 *                                ---
	 *                                404(페이지를 못찾음) 500(소스상에러) 403 412 400
	 *                        ------
	 *                        충돌
	 *                  ---
	 *                  IP/URL
	 *             --   
	 *             파일 경로명, 파일명
	 *             
	 *          -> 에러
	 *             사용자 입력
	 *             프로그래머의 실수
	 */
	{
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); // 페이지 소스 불러오는중
			//html 문서 저장 공간
			// System.out.println();
			/*
			 * HTML -> tage <> -> Markup language
			 * <a> 값 </a>
			 * Element -> tag
			 * Elements -> 같은 태그 여러개를 모아준것
			 */
			// 노래명
			// 구분자 -> 모든 태그 class (중복)/ id(중복이 없다)
			// class -> . id-> #
			
			Elements title=doc.select("table.list-wrap td.info a.title");
			
			// 가수명
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			
			
			// 앨범명
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			
			
			Elements etc=doc.select("table.list-wrap td.number span");
			System.out.println(etc);
			for(int i=0; i<title.size(); i++) {
//				System.out.println("순위"+(i+1));
//				System.out.println("노래명"+title.get(i).text());
//				System.out.println("가수명"+singer.get(i).text());
//				System.out.println("앨범"+album.get(i).text());
				String s=etc.get(i).text();
				String state="";
				String value="";
				if(s.equals("유지")) {
					state="유지";
					value="0";
				}
				//2상승
				else {
					state=s.replaceAll("[0-9]", "");
					value=s.replaceAll("[가-힣]", "" );
				}
				/*
				 * split
				 * replaceAll
				 * ----------정규식 한글형태, 숫자형태 -> 패턴
				 */
				
			/*	System.out.println("상태"+state);
				System.out.println("등폭"+value);	
				System.out.println("========================"); */
				
				musics[i]=new Music();
				musics[i].setRank(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				musics[i].setState(state);
				musics[i].setIdcrment(value);
						
				System.out.println("등폭"+etc.get(i).text());
				
				
				System.out.println(title.get(i).text()+" "
						+singer.get(i).text());
				
			}
//			System.out.println(doc.toString());
		}catch(Exception ex) {}
	}
	
	public Music[] musicAllData() {
		return musics;
	}
	// 2. 기능 (어떤 기능) -> 메소드
//	public Music[] musicTitleFind(String fd) {
//		
//	}
	
	//2-1목록 출력 -> type=1 title, type2 singer, type3 album
	public Music[] musicFind(String fd, int type) {
		int i=0;
		for(Music m:musics) {
			boolean bCheck=false;
			if(type==1) {
				bCheck=m.getTitle().contains(fd);
				i++;
			}
				
			else {
				bCheck=m.getSinger().contains(fd);
				i++;
			}
				
		}
		System.out.println("i="+i);
		Music[] mm=new Music[i];
		for(Music m:musics) {
			boolean bCheck=false;
			if(type==1) {
				bCheck=m.getTitle().contains(fd);
				
			}
				
			else {
				bCheck=m.getSinger().contains(fd);
				
			}
			
			if(bCheck==true) {
				mm[i]=m;
				i++;
			}
		}
		return mm;
	}
	/*
	 *   결과값을 전송 : 리턴형
	 *   자체 출력 : void
	 */
	
	// 2-2. 검색
	public static void main(String[] args) {
		GenieMusicSystem g=new GenieMusicSystem();
		Music[] aa=g.musicFind("사", 1);
		for(Music a:aa) {
			System.out.println();
		}
	}

}
