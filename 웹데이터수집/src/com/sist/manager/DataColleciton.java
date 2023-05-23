package com.sist.manager;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.dao.*;
import com.sist.vo.*;

public class DataColleciton {
	public void foodCategoryData() {
		FoodDAO dao = FoodDAO.newInstance();
		try {
			//사이트 연결
			// https://try.jsoup.org/ 태그 긁는 사이트 분석
			Document doc = Jsoup.connect("https://www.mangoplate.com/").get();
			Elements title=doc.select("div.info_inner_wrap span.title"); //30개
			Elements subject=doc.select("div.info_inner_wrap p.desc"); //30개
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping"); //30개
			Elements link=doc.select("ul.list-toplist-slider a"); //30개
			/*
			 * 태그 잘오는지 확인
			System.out.println(title.toString());
			System.out.println("====================");
			System.out.println(subject.toString());
			System.out.println("====================");
			System.out.println(poster.toString());
			System.out.println("====================");
			System.out.println(link.toString());
			*/
			
			//속성값으로 태그 제외하고 갖고옴
			for(int i=0; i<title.size(); i++) {
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				System.out.println(link.get(i).attr("href"));
				System.out.println("===========================");
				CategoryVO vo= new CategoryVO();
				vo.setTitle(title.get(i).text());
				vo.setSubject(subject.get(i).text());
				vo.setLink(link.get(i).attr("href"));
				String p=poster.get(i).attr("data-lazy");
				p=p.replace("&", "#");
				vo.setPoster(p);
				dao.foodCategoryInsert(vo);
				/*
				 * 이미지에서는 &기호가 많음 이걸 #으로 교체 시켜줘야함
				 */
			}
			System.out.println("저장 완료!");
		} catch (Exception ex) {}
	}
	public static void main(String[] args) {
		DataColleciton dc=new DataColleciton();
		dc.foodCategoryData();
		
	}
	

}
