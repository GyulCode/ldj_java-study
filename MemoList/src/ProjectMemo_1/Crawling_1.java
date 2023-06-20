package ProjectMemo_1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawling_1 {
	//크롤링
		public static void main(String[] args) {
			
			try {
				// 사이트 연결
				String url="https://gyeoniyrang.com/_subpage/kor/product/hospital.php?ca_id=76&dateStart=&dateEnd=&page=";
				
				for(int i=1; i<=10; i++) {
					String url1=url+Integer.toString(i);
					Document doc=Jsoup.connect(url1).get();
					Elements title=doc.select(".item-list3 .info .sbj");
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

