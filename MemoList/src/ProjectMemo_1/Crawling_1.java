package ProjectMemo_1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawling_1 {
	//마이펫 #container .list .subject
	//견이랑 : .item-list3 .info .sbj
	//크롤링
		public static void main(String[] args) {
			
			try {
				// 사이트 연결
				String url="https://bemypet.kr/lounge/";
				
				for(int i=76035; i<=76045; i++) {
					String url1=url+Integer.toString(i);
					Document doc=Jsoup.connect(url1).get();
					Elements title=doc.select(".qaDetail_qaDetailQuestion__AXVqt .qaDetail_qaDetailTop__O4CyB");
					Elements cont=doc.select(".qaDetail_qaDetailQuestion__AXVqt .qaDetail_qaDetailTop__O4CyB");
					Elements img=doc.select(".qaDetail_qaDetailQuestion__AXVqt .qaDetail_qaDetailTop__O4CyB");
					Elements id=doc.select(".qaDetail_qaDetailQuestion__AXVqt .qaDetail_qaDetailTop__O4CyB");
					for(int j=0; j<title.size();j++) {
						System.out.println("제목:"+title.get(j).text());
						System.out.println("----------------------------------");
					}
				}
				System.out.println("저장완료");
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		}
}

