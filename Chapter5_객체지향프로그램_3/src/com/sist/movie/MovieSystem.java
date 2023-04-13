package com.sist.movie;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;

/*
 * [{"startYearDate":"2023.04.12",
 * "endYearDate":"2023.04.12",
 * "startDate":"2023년 04월 12일(수)",
 * "endDate":"2023년 04월 12일(수)",
 * "movieCd":"20231089",
 * "showDt":"20230412",
 * "thumbUrl":"/common/mast/movie/2023/04/thumb/thn_30be7bc08e504eaab8cd9545aa64749d.jpg",
 * "movieNm":"존 윅 4",
 * "movieNmEn":"John Wick: Chapter 4",
 * "synop":"죽을 위기에서 살아난 ‘존 윅’은 ‘최고 회의’를 쓰러트릴 방법을 찾아낸다.\r\n비로소 완전한 자유의 희망을 보지만 NEW 빌런 ‘그라몽 후작’과 전 세계의 최강 연합은 \r\n‘존 윅’의 오랜 친구까지 적으로 만들어 버리고, 새로운 위기에 놓인 ‘존 윅’은 최후의 반격을 준비하는데...\r\n\r\n레전드 액션 블록버스터 &lt;존 윅&gt;의 새로운 챕터가 열린다!",
 * "prdtYear":"2023",
 * "indieYn":null,"artmovieYn":null,
 * "multmovieYn":null,
 * "showTm":"169",
 * "showTs":"5",
 * "director":"채드 스타헬스키","prNm":null,"dtNm":"(주)레드아이스 엔터테인먼트","repNationCd":"미국","movieType":"장편","moviePrdtStat":"개봉","genre":"액션","watchGradeNm":"청소년관람불가","openDt":"20230412","salesAmt":1144439006,"audiCnt":113149,"scrCnt":1525,"showCnt":4665,"rank":1,"rankInten":-1,"rankOldAndNew":"NEW","rownum":1}
 */
public class MovieSystem {
	
	Movie[] movie =new Movie[10];
	int menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("================메뉴===============");
		System.out.println("1.일별 박스오피스");
		System.out.println("2.실시간 예매율");
		System.out.println("3.좌석 점유율");
		System.out.println("4.상세보기");
		System.out.println("9.죵료하기");
		System.out.println("=================================");
		System.out.println("메뉴 선택: ");
		
		return sc.nextInt();		
	}
	//목록출력
	Movie[] movieListData(int no) {
		String[] strUrl= {
				"",
				"searchMainDailyBoxOffice.do",
				"searchMainRealTicket.do",
				"searchMainDailySeatTicket.do"
		};
		
		String url ="https://www.kobis.or.kr/kobis/business/main/"+strUrl[no];
		try {
			// [{},{},{}...] JOSN객체 표현법 
			// [] JSONArray
			// {} JSONObject
			Document doc=Jsoup.connect(url).get();
			//System.out.println(doc.toString());
			String msg=doc.toString();
			msg=msg.substring(msg.indexOf("["),msg.lastIndexOf("]")+1);
//			System.out.println(msg);
			JSONParser jp=new JSONParser();
			JSONArray arr=(JSONArray)jp.parse(msg);
			
			for(int i=0;i<arr.size();i++) {
				JSONObject obj=(JSONObject)arr.get(i);
				movie[i]=new Movie();
				movie[i].title=(String)obj.get("movieNm");
				movie[i].time=(String)obj.get("showTm");
				movie[i].genre=(String)obj.get("genre");
				movie[i].director=(String)obj.get("director");
				movie[i].story=(String)obj.get("synop");
			}			
		}catch(Exception ex) {}
		
		return movie;
	}
	
	Movie movieDetailData(int no) {
		return movie[no-1];
	}
	/*public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
		Movie[] mm=ms.movieListData(1);
		for(int i=0;i<mm.length;i++) {
			System.out.println((i+1)+"."+mm[i].title);
		}
	} */

}
