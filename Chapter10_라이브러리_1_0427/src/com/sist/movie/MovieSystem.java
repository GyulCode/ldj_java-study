package com.sist.movie;
import java.util.*;
import java.io.*;

public class MovieSystem {
	private static ArrayList list=new ArrayList();
	
	static
	{
		try {
			// 파일 읽기
			FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
			// 읽을때 여러형태를읽음 이때 리턴이 정수형인가봄??
			int i=0; //한 글자씩 읽기
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1) { //-1 EOF -1은 읽은  파일에 마지막
				sb.append((char)i); // i에는 숫자로읽힌 값들이이음 문자열에 문자형으로 저장 
			}
			fr.close();
			
//			System.out.println(sb.toString()); // 자료 읽히는지 확인
			
			String[] movies=sb.toString().split("\n");
			for(String m:movies) {
				StringTokenizer st= new StringTokenizer(m,"|");
				MovieVO  vo=new MovieVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setTitle((st.nextToken()));
				vo.setGenre(st.nextToken());
				vo.setPoster(st.nextToken());
				vo.setActor(st.nextToken());
				vo.setRegdate(st.nextToken());
				vo.setGrade(st.nextToken());
				vo.setDirector(st.nextToken());
				list.add(vo);
				
			}
			
			
		}catch(Exception ex) {}
	}
	
//	public static void main(String[] args) {
//		MovieSystem ms =new MovieSystem();
//	}
	// menu
	public int movieMenu()
	{
		System.out.println("==========영화메뉴==========");
		System.out.println("1.목록 출력");
		System.out.println("2.상세 보기");
		System.out.println("3.영화 검색");
		System.out.println("9.시스템 종료");
		System.out.println("==========-----==========");
		Scanner sc=new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		return sc.nextInt();
	}
	
	// 목록출력 (페이지)
	public ArrayList MovieListData(int page) {
//		int pageSize=10;
		int totalPage=(int)(Math.ceil(list.size()/10.0));
		// 194 page
		int start=(page-1)*10;
		// 0, 10 20... 
		int end=page*10;
		// 10, 20, 30 ... subString 마지막은 -1이 되어서 10까지 끊어와도 된다
		if(page==totalPage) {
			end=(page*10)-(10-list.size()%10);
		}
		ArrayList movieList = new ArrayList(list.subList(start, end));
		return movieList;
	}
	// 상세보기
	public MovieVO movieDetailData(int no) {
		return (MovieVO)list.get(no-1);
				
	}
	// 영화 검색
	// 조립
	public void process() {
		while(true) {
			int menu=movieMenu();
			if(menu==9) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				Scanner sc=new Scanner(System.in);
				System.out.println("페이지 입력 : ");
				int page=sc.nextInt();
				ArrayList mList=MovieListData(page);
				for(int i=0;i<mList.size();i++){
					MovieVO vo=(MovieVO)mList.get(i);
					System.out.println(vo.getNo()+"."+vo.getTitle());
				}
						
			}
			else if(menu==2) {
				Scanner sc=new Scanner(System.in);
				System.out.println("상세볼 영화 번호 입력(1~1938) : ");
				int no=sc.nextInt();
				MovieVO vo=movieDetailData(no);
				System.out.println("====상세보기====");
				System.out.println("순위:"+vo.getNo());
				System.out.println("제목:"+vo.getTitle());
				System.out.println("장르:"+vo.getGenre());
				System.out.println("포스터:"+vo.getPoster());
				System.out.println("배우:"+vo.getActor());
				System.out.println("개봉일:"+vo.getRegdate());
				System.out.println("감독 : "+vo.getDirector());

			}
		}
	}
	
			

}
