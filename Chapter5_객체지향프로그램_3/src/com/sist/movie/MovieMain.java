package com.sist.movie;
import java.util.Scanner;;
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieSystem ms=new MovieSystem();
		//Scanner sc=new Scanner()
		
		while(true) {
			int menu=ms.menu();
			if(menu==9) {
				System.out.println("프로그램 종료");
				break;
			}
			
			if(menu==1||menu==2||menu==3) {
				Movie[] mm=ms.movieListData(menu);
				int i=1;
				for(Movie m:mm) {
					System.out.println(i+"."+m.title);
					i++;
					
				}
			}
			if(menu==4) {
				Scanner sc=new Scanner(System.in);
				System.out.println("상세볼 영화번호 선택(1~10):");
				int no=sc.nextInt();
				Movie mm=ms.movieDetailData(no);
				System.out.println("영화명: "+mm.title);
				System.out.println("감독명: "+mm.director);
				System.out.println("상영시간: "+mm.time);
				System.out.println("장르: "+mm.genre);
				String story=mm.story;
				story=story.replace("&lt;","<");
				story=story.replace("&gt;",">");
				System.out.println("줄거리: "+mm.story);
			}
		}

	}

}
