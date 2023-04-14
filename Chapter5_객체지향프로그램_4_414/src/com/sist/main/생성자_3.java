package com.sist.main;

import java.io.FileReader;

/*
 * 1|쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 */
class Movie{
	String no;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
	
}
class MovieSystem{
	Movie[] movies=new Movie[1938];
	
	//파일 읽기를 위해 생성자 사용
	MovieSystem() {
		String data="";
		StringBuffer sb=new StringBuffer();
		
		try {
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1) {//파일 1개씩 읽어 옴
//				data+=(char)i; //파일 읽어올때 숫자로 읽어와서 바꿔줘야함
				data=String.valueOf((char)i);
				sb.append(data);
			}
			fr.close();
			System.out.println(sb.toString());
		}catch(Exception ex) {}
		
		String msg=sb.toString();
		String[] movie=msg.split("\n");
		int i=0;
		for(String m:movie) {
			String[] ss=m.split("\\|");
			movies[i]=new Movie();
			movies[i].no=ss[0];
			movies[i].title=ss[1];
			movies[i].genre=ss[2];
			movies[i].poster=ss[3];
			movies[i].actor=ss[4];
			movies[i].regdate=ss[5];
			movies[i].grade=ss[6];
			movies[i].director=ss[7];
			i++;
		}
		
	}
}

public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieSystem ms = new MovieSystem();
		for(Movie m:ms.movies) {
			System.out.println(m.title);
		}

	}

}
