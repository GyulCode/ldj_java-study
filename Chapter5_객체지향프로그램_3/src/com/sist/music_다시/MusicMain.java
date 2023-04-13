package com.sist.music_다시;
import java.util.Scanner;

public class MusicMain {
	public static void main(String[] args) {
		
		//music데이터를 담아둔다
		MusicSystem ms=new MusicSystem();
		
		while(true) {
			int menu=ms.menu();
			if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				Music[] mm=ms.musicListData();
				for(int i=0; i<50; i++) {
					System.out.println((i+1)+"."+mm[i].title);
				}
				System.out.println("=====================");
			}
			else if(menu==2) {
				Scanner sc=new Scanner(System.in);
				System.out.println("검색어 입력: ");
				String fd=sc.next();
				Music[] mm=ms.musicFindData(fd);
				for(int i=0;i<mm.length;i++) {
					System.out.println((i+1)+"."+mm[i].title);
				}
			}
			else if(menu==3) {
				Scanner sc=new Scanner(System.in);
				System.out.println("뮤직번호 선택(1~50): ");
				int no=sc.nextInt();
				Music mm=ms.musicDetailData(no);
				System.out.println("곡명:"+mm.title);
				System.out.println("가수명:"+mm.singer);
				System.out.println("앨범:"+mm.album);
				String s=mm.state;
				if(s.equals("유지")) {
					s="-";
				}
				else if(s.equals("상승")) {
					s="상승"+mm.modify;
				}
				else if(s.equals("gkrkd")) {
					s="하강"+mm.modify;
				}
				System.out.println("등폭:"+s);
				
				}
			}
		}
	

}
