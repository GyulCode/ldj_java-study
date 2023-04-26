package com.sist.program;
// Vo -> Dao -> 전송 -> 관련된 데이터는 무조건 묶어서ㅂ낸다 (VO)
import java.util.*;
import java.io.*;
public class SeoulSystem {
	// 모든 사용자가 공통으로 접근함
	private static SeoulLocationVO[] datas=new SeoulLocationVO[273];
	private int curpage; // 프로그램 종료시까지 유지
	private int totalpage; 
	
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
			
			int k=0;
			for(String s:locations) {
//				System.out.println(s);
				StringTokenizer st=new StringTokenizer(s,"|");
				datas[k]=new SeoulLocationVO();
				datas[k].setNo(Integer.parseInt(st.nextToken()));
				datas[k].setName(st.nextToken());
				datas[k].setContent(st.nextToken());
				datas[k].setAddress(st.nextToken());
				k++;
			}
		}catch(Exception ex) {}	
		
	}
	 // 페이지별 데이터 출력
	 public SeoulLocationVO[] seoulList(int page) {
		 SeoulLocationVO[] data=
				 new SeoulLocationVO[10];
		 int j=0; //10개씩 나눠주는 변수
		 int start=(page*10)-10; //시작점 (for)
		 /*
		  * 1page 0~9
		  * 10~19
		  * 20~29
		  */
//		 int k=0;
		 for(int i=0; i<datas.length;i++) {
			 if(j<10 && i>=start) {
				 data[j]=datas[i];
//				 k++;
				 j++; 
			 }
		 }
		 return data;
						 
	 }
	 public int seoultotalPage() {// int page
		 return (int)(Math.ceil(datas.length/10.0)); // -> 27.3 -> 28page  ceil 올림 함수

	 }
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
	 public SeoulLocationVO[] nameFind(String fd) {
		 int count=0;
		 for(SeoulLocationVO vo:datas) {
			 if(vo.getName().contains(fd)) {
				 count++;
			 }
		 }
		 // 고정 -> 가변(collection)
		 SeoulLocationVO[] seoul=new SeoulLocationVO[count];
		 int i=0;
		 for(SeoulLocationVO vo:datas) {
			 if(vo.getName().contains(fd)) {
				 seoul[i]=vo;
				 i++;
			 }
		 }
		 return seoul;
	 }
	 
	 // 주소 검색
	 public SeoulLocationVO[] addressFind(String addr) {
		 int count=0;
		 for(SeoulLocationVO vo:datas) {
			 if(vo.getAddress().contains(addr)) {
				 count++;
			 }
		 }
		 // 고정 -> 가변(collection)
		 SeoulLocationVO[] seoul=new SeoulLocationVO[count];
		 int i=0;
		 for(SeoulLocationVO vo:datas) {
			 if(vo.getAddress().contains(addr)) {
				 seoul[i]=vo;
				 i++;
			 }
		 }
		 return seoul;
	 }
	 
	 // 상세보기
	 public void process() {
		 System.out.println("★★★★★★★★ SIST MOVIE ★★★★★★★★");
		 while(true){
			 int menu=menu();
			 if(menu==9) {
				 System.out.println("Promgram is quite!!");
				 break;
			 }
			 else if(menu==3) {
				 Scanner sc=new Scanner(System.in);
				 System.out.println("Entering the Word : ");
				 String name=sc.next();
				 SeoulLocationVO[] data=nameFind(name);
				 System.out.println(name+"검색은"+data.length+"건입니다당");
				 for(SeoulLocationVO vo:data) {
					 System.out.println(vo.getNo()+"."+vo.getName()); 
				 }
				 
			 }
			 else if(menu==4) {
				 Scanner sc=new Scanner(System.in);
				 System.out.println("Entering the Address : ");
				 String name=sc.next();
				 SeoulLocationVO[] data=addressFind(name);
				 System.out.println(name+"검색은"+data.length+"건입니다당");
				 for(SeoulLocationVO vo:data) {
					 System.out.println(vo.getNo()+"."+vo.getName());
					 
				 }
				 
			 }
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

				 int totalpage=seoultotalPage();
				 System.out.println(curpage+" page / "+totalpage+" Total page");
				 SeoulLocationVO[] data=seoulList(curpage);
				 for(SeoulLocationVO vo:data) {
					 if(vo!=null) {
						 System.out.println(vo.getNo()+"."+vo.getName());
					 }
				 }
						 
			 }
			 else if(menu==2) {
				 Scanner sc=new Scanner(System.in);
				 System.out.println("상세볼 번호 입력 1~273 : ");
				 //번호 예외처리 해주면 좋음
				 int no=sc.nextInt();
				 System.out.println("번호"+datas[no-1].getNo());
				 System.out.println("명소"+datas[no-1].getName());
				 System.out.println("설명"+datas[no-1].getContent());
				 System.out.println("주소"+datas[no-1].getAddress());
				 
				 
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
