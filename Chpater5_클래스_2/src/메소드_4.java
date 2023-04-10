//장르별 노래제목 출력
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
public class 메소드_4 {
	
	static int menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("============MENU============");
		System.out.println("1. 가요");
		System.out.println("2. POP");
		System.out.println("3. OST");
		System.out.println("4. 트롯");
		System.out.println("5. JAZZ");
		System.out.println("9. 종료");
		System.out.println("============================");
		System.out.print("메뉴선택 : ");
		int menu=sc.nextInt();
		return menu;
	}
	
	static void titlePrint(int no) {
		final String BASIC_URL="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230409&genrecode=";
		String[] url= {
				"",
				"M0100",
				"M0200",
				"M0300",
				"L0107",
				"M0500"
				};
		
//		 <td class="info">
//        <a href="#" class="title ellipsis" title="손이 참 곱던 그대" onclick="fnPlaySong('96696808;','1'); return false;" ontouchend="fnPlaySong('96696808;','1'); return false;">
//손이 참 곱던 그대</a>
		
//		try
//		{
//			Document doc=Jsoup.connect(BASIC_URL+url[no]).get();
//			Elements title=doc.select("tr.list td.info a.title");
//			for(int i=0;i<title.size();i++) {
//				System.out.println(title.get(i).text());
//			}
//				
//		}catch(Exception ex) {}
				
	}
	
	static void process() {
		while(true) {
			
			int m=menu();
			switch(m) {
			case 1:
				break;
				
			
			}
			if(m==9) {
				System.out.println("시스템 종료");
				break;
			}
			titlePrint(m);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
