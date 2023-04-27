package com.sist.SeoulLocation;
// Vo -> Dao -> 전송 -> 관련된 데이터는 무조건 묶어서ㅂ낸다 (VO)
import java.util.*;

import com.sist.movie.MovieVO;

import java.io.*;
public class SeoulSystem {
	// 모든 사용자가 공통으로 접근함
	private static ArrayList datas=new ArrayList();
	private int curpage; // 프로그램 종료시까지 유지
	private int totalpage; // 
	
	static{
		// 데이터를 읽어서 메모리에저장 -> 초기화
		try {
			StringBuffer sb=new StringBuffer();
			int i=0;
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			
//			System.out.println(sb.toString());
			
			String[] locations=sb.toString().split("\n");
			
//			int k=0;
			for(String s:locations) {
//				System.out.println(s);
				StringTokenizer st=new StringTokenizer(s,"|");
				SeoulLocationVO vo=new SeoulLocationVO();
				vo.setNo(Integer.parseInt(st.nextToken()));		
				vo.setName(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAddress(st.nextToken());
				datas.add(vo);
				
				

			}
		}catch(Exception ex) {}	
		
	}
	 // 페이지별 데이터 출력
	 public ArrayList SeoulLocationData(int page) {
		 int totalpage=(int)(Math.ceil(datas.size()/10.0));
		// 28
		 int start=(page-1)*10;
		 int end=page*10;
		 if(page==totalpage) {
			 end=start+datas.size()%10;
		 }
		 ArrayList seouList =new ArrayList(datas.subList(start, end));
		 return seouList;
	 }
	 
	 
//	 public int seoultotalPage() {// int page
//		 return (int)(Math.ceil(datas.length/10.0)); // -> 27.3 -> 28page  ceil 올림 함수
//
//	 }
	 
	 // 메뉴
	 public int menu() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("========MENU=========");
		 System.out.println("1. 목록 출력(페이지별)");
		 System.out.println("2. 상세보기");
		 System.out.println("3. 명소검색");
		 System.out.println("4. 주소검색");
		 System.out.println("========MENU=========");
		 System.out.println("메뉴선택 : ");
		 return sc.nextInt();
		 
	 }
	 
	 // 검색 -> 이름
//	 public SeoulLocationVO[] nameFind(String fd) {
//		 int count=0;
//		 for(SeoulLocationVO vo:datas) {
//			 if(vo.getName().contains(fd)) {
//				 count++;
//			 }
//		 }
//		 // 고정 -> 가변(collection)
//		 SeoulLocationVO[] seoul=new SeoulLocationVO[count];
//		 int i=0;
//		 for(SeoulLocationVO vo:datas) {
//			 if(vo.getName().contains(fd)) {
//				 seoul[i]=vo;
//				 i++;
//			 }
//		 }
//		 return seoul;
//	 }
	 
	 // 주소 검색
//	 public SeoulLocationVO[] addressFind(String addr) {
//		 int count=0;
//		 for(SeoulLocationVO vo:datas) {
//			 if(vo.getAddress().contains(addr)) {
//				 count++;
//			 }
//		 }
//		 // 고정 -> 가변(collection)
//		 SeoulLocationVO[] seoul=new SeoulLocationVO[count];
//		 int i=0;
//		 for(SeoulLocationVO vo:datas) {
//			 if(vo.getAddress().contains(addr)) {
//				 seoul[i]=vo;
//				 i++;
//			 }
//		 }
//		 return seoul;
//	 }
//	 
	 public SeoulLocationVO seoulDetailData(int no) {
		 return (SeoulLocationVO)datas.get(no-1);
	 }
	 
	 
	 // 상세보기
	 public void process() {
		 System.out.println("★★★★★★★★ Seoul SEOUL ★★★★★★★★");
		 while(true){
			 int menu=menu();
			 if(menu==9) {
				 System.out.println("Promgram is quite!!");
				 break;
			 }
			 
//			 else if(menu==3) {
//				 Scanner sc=new Scanner(System.in);
//				 System.out.println("Entering the Word : ");
//				 String name=sc.next();
//				 SeoulLocationVO[] data=nameFind(name);
//				 System.out.println(name+"검색은"+data.length+"건입니다당");
//				 for(SeoulLocationVO vo:data) {
//					 System.out.println(vo.getNo()+"."+vo.getName()); 
//				 }
//				 
//			 }
//			 else if(menu==4) {
//				 Scanner sc=new Scanner(System.in);
//				 System.out.println("Entering the Address : ");
//				 String name=sc.next();
//				 SeoulLocationVO[] data=addressFind(name);
//				 System.out.println(name+"검색은"+data.length+"건입니다당");
//				 for(SeoulLocationVO vo:data) {
//					 System.out.println(vo.getNo()+"."+vo.getName());
//					 
//				 }
//				 
//			 }
			 else if(menu==1) {
				 Scanner sc=new Scanner(System.in);
				 while(true) {
					 System.out.println("Enter the Page number(1~28) : ");
					 curpage=sc.nextInt(); 
					 if(curpage<1||curpage>28) {
						 System.out.println("없는 페이지입니다");
						 continue;
					 }
					 break;
				 }
				ArrayList mList=SeoulLocationData(curpage);
				for(int i=0;i<mList.size();i++){
					SeoulLocationVO vo=(SeoulLocationVO)mList.get(i);
					System.out.println(vo.getNo()+"."+vo.getName());
				}
						
			
						 
			 }
			 

			 
			 
			 else if(menu==2) {
				 Scanner sc=new Scanner(System.in);
				 System.out.println("상세볼 번호 입력 1~273 : ");
				 //번호 예외처리 해주면 좋음
				 int no=sc.nextInt();
				 SeoulLocationVO vo=seoulDetailData(no);
				 System.out.println("번호"+vo.getNo());
				 System.out.println("명소"+vo.getName());
				 System.out.println("설명"+vo.getContent());
				 System.out.println("주소"+vo.getAddress());
				 
				 
			 }
		 }
		 
	 }
	 
	
	/*
	public static void main(String[] args) {
		SeoulSystem ss=new SeoulSystem();
		for(SeoulLocationVO vo:datas) {
			System.out.println(vo.getNo());
			System.out.println(vo.getName());
			System.out.println(vo.getAddress());
			System.out.println("===========");
		}
				
	}*/
	

}
