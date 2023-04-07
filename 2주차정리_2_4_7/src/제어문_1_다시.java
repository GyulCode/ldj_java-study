/*
 *    1.조건문 / 선택문
 *      --------상세보기, 검색, 로그인, 아이디체크, 우편번호검색
 *      --------댓글, 수정, 삭제...
 *      형식)
 *      	if(조건문) -> 조건문(부정연산자, 비교연산자, 논리연산자)
 *          {
 *             출력내용 -> true일때만 수행하는 문장
 *          }
 *          예) -> 번호 3번인 내용을 출력해라 -> 상세
 *          -------------------------------
 *          단일조건 : 속도가 늦다(독립적인 문장) -> 중복적으로 수행할때는 사용
 *          ----------------------------------------------
 *          다중조건 : 조건이 많은 경우 해당되는 조건만 수행
 *          형식 : if{ 참(실행) / 거짓(다음꺼진행)} else if{참(실행) / 거짓(다음꺼진행 } else if{ 참(실행) / 거짓(다음꺼진행 } else{맞는게 없을떄 진행}
 *          
 *          
 *          true/false 나눠서 처리
 *          ------------------
 *          if(조건문)
 *          {
 *             조건이 true일때 처리
 *          }
 *          else
 *          {
 *             조건이 false일때 처리
 *          }
 *          
 *          예) 웹 -> 일반 사용자 
 *              if(로그인이 되었다면)
 *              {
 *                 main으로 이동해라
 *              }
 *              else
 *              {
 *                 회원가입으로 이동
 *              }
 *              if(id.equals("")
 *              
 *           선택문 : 네트워크, 게임 (키값)
 *           switch(정수, 문자, 문자열)
 *           {
 *              case "find":
 *              case "login":
 *                수행;
 *                break;
 *              case "logout":
 *                수행;
 *                break;
 *              default:
 *                조건이 없을때 수행할문장
 *                break;
 *              -------------------------------
 *              switch //같은 구문 블럭안에서 같은 변수를 넣으면 에러
 *              {
 *              case 1:
 *                 int a=10;
 *                 System.out.println(a);
 *                 break;
 *              case 2: 
 *                 int a=20;
 *                 System.out.println(a);
 *                 break;
 *              case 3:
 *                 int a=30;
 *                 System.out.println(a);
 *                 break;
 *              case 4:
 *                 문장4
 *                 break;
 *              
 *              case 5:
 *           }
 *      
 *    2.반복문
 *      --------목록, 페이징(화면출력)
 *      1) for : 반복횟수가 지정된 경우
 *      2) while : 반복횟수가 없는경우
 *        ->파일 읽기, 데이터베이스
 *      3) do~while : 한번이상 수행할떄 수행
 *    
 *    3.반복 제어문
 *       -------페이징
 */
import java.util.Scanner;
import java.io.*;
public class 제어문_1_다시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//case구문 정리
		/*int i=1;
		// 또는 a를 전역으로 선언해서 사용
//		그러면 따로 구문블럭 설정없이 사용가능
		switch(i) 
		{
		 case 1:{
			 int a=10;
             System.out.println(a);
             break;
         }
		 case 2:{
			  int a=20;
              System.out.println(a);
              break;
         }
		 case 3:{
			 int a=30;
             System.out.println(a);
             break;
		 }
		 case 4:{
			  int a=40;
              System.out.println(a);
              break;
		 }*/
		 
		//***페이징 기법 홈페이지 페이지 설정
		while(true)
		{
		String[] title={"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear","사건의 지평선","OMG","심 (心)","I Don't Think That I Like Her","사랑은 늘 도망가","건물 사이에 피어난 장미","우리들의 블루스","빙글빙글 (Prod. by R.Tee)","가질 수 없는 너","After LIKE","다시 만날 수 있을까","밤이 무서워요 (Lonely Night)","이제 나만 믿어요","London Boy","파이팅 해야지 (Feat. 이영지)","Polaroid","무지개","Attention","아버지","A bientot","LOVE DIVE","손이 참 곱던 그대","사랑인가 봐","사랑해 진짜","연애편지","보금자리","인생찬가","ANTIFRAGILE","NIGHT DANCER","Dangerously","Zero","The Drum","Like Crazy","바보가슴","Nxde","사랑하기 싫어","새삥 (Prod. by ZICO) (Feat. 호미들)","That's Hilarious","Nostalgia","흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야","Monologue","VIBE (Feat. Jimin of BTS)","Dynamite","오르트구름","그때 그 순간 그대로 (그그그)","다정히 내 이름을 부르면","TOMBOY","너의 모든 순간","해요 (2022)","Pink Venom","Unholy","Shut Down","취중고백","Dreamers (Music from the FIFA World Cup Qatar 2022 Official Soundtrack) (Feat. FIFA Sound)","그라데이션","Stay","That That (Prod. & Feat. SUGA of BTS)","사랑하지 않아서 그랬어","Loving You Girl (Feat. Hkeem)","고백","Set Me Free Pt.2","내가 아니라도","Cookie","Love Me Like This","Say I Love You","보고싶었어","나의 X에게","NOT SORRY (Feat. pH-1) (Prod. by Slom)","Candy","D N D","그대를 알고","그중에 그대를 만나","아모르 파티","ELEVEN","너를 보는게 지친 하루에","Rush Hour (Feat. j-hope of BTS)","Butter","아로하","봄날","When I Get Old","Say My Name","잘가요","희재","2002","모든 날, 모든 순간 (Every day, Every Moment)","정이라고 하자 (Feat. 10CM)","나의 목소리로","Blueming","FEARLESS","발걸음","당신을 만나","Every Second","봄여름가을겨울 (Still Life)","LOVE me","나비무덤","딱 10CM만","결국엔 너에게 닿아서","자격지심 (Feat. ZICO)","Off My Face","밤하늘의 별을 (2020)","인생은 뷰티풀","신호등","빛이 나는 사람","Face-off","주마등","Permission to Dance","오래오래","Bad Habits","주저하는 연인들을 위해","슬픈등","친구","Celebrity","Made You Look","Bad","Love story","약속 (約束)","INVU","Il Mare Calmo Della Sera","Alone","벚꽃 엔딩","떠나보낼 준비해 둘걸 그랬어","내 기쁨은 너가 벤틀리를 끄는 거야","At My Worst","내 손을 잡아","사계 (Four Seasons)","Love in Portofino","마지막 사랑","Left and Right (Feat. Jung Kook of BTS)","위대한 사랑 (Un Amore Cosi Grande)","나비 (Outro)","비와 당신","우린 그렇게 사랑해서","OHAYO MY NIGHT","Poppy (Korean Ver.)","Stronger (What Doesn't Kill You)","strawberry moon","풍등","Yet To Come","Ai Wo Tsutaetaidatoka","Feel My Rhythm","찰나가 영원이 될 때 (The Eternal Moment)","예뻤어","새벽에 걸려온 너의 전화는","라일락","오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)","어떻게 이별까지 사랑하겠어, 널 사랑하는 거지","그댄 행복에 살텐데 (2022)","That's Not How This Works (Feat. Dan ＋ Shay)","Cupid","on the street","한 페이지가 될 수 있게","비도 오고 그래서 (Feat. 신용재)","바라만 본다","Next Level","첫눈처럼 너에게 가겠다","Weekend","있잖아","Switch","BETELGEUSE","팡파레","헤픈 우연","WHEN I MOVE","En Garde (준비,시작!)","도깨비불 (Illusion)","Tiny Riot","사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)","마이웨이 (MY WAY) (Prod. by R.Tee)","건배","회전목마 (Feat. Zion.T & 원슈타인) (Prod. by Slom)","GHOST TOWN","12 : 45 (Stripped)","에잇 (Prod. & Feat. SUGA of BTS)","트위스트고고","너의 번호를 누르고 (Prod. by 영화처럼)","그대가 내 안에 박혔다 (그내박)","Expectations","시작","언제나 사랑해","MY BAG","나와 함께 가시렵니까","봄 사랑 벚꽃 말고","KISS ME (Feat. BIG Naughty)","처음부터 너와 나","너를 생각해","Way Back Home","오래된 노래","오.내.언.사 (Guitar Ver.)","Crazy","바람 같은 사람","스티커 사진","좋아 (JOAH)","사나이 청춘","비 오는 날 듣기 좋은 노래 (Feat. Colde)","밥 한 번 먹자"};
			System.out.println("총"+title.length+"곡");
			int page=0;
			if(page==0)
				page=1;
			
			int j=0;
			int rowSize=10;
			int pagecnt=(page*rowSize)-rowSize; // 시작위치 1페이지 0~9 2페이지 10~19
			
			for(int i=0; i<title.length;i++) {
				if(j<rowSize && i>=pagecnt) {
					System.out.println((i+1)+"."+title[i]);
					j++;
				}
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("페이지 입력: ");
			page=sc.nextInt();
			break;
	}
			
			System.out.println("while 사용");
			try {
				FileReader fr= new FileReader("C:\\javaDev\\javaStudy\\2주차정리_2\\src\\제어문_1.java");
						int i=0;
				while((i=fr.read())!=-1) {
					System.out.println((char)i);
				}
			}catch(Exception ex) {}
			
	}
}
			
				

			              

