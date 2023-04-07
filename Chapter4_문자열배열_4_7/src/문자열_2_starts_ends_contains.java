import java.util.Scanner;
public class 문자열_2_starts_ends_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title={"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear","사건의 지평선","OMG","심 (心)","I Don't Think That I Like Her","사랑은 늘 도망가","건물 사이에 피어난 장미","우리들의 블루스","빙글빙글 (Prod. by R.Tee)","가질 수 없는 너","After LIKE","다시 만날 수 있을까","밤이 무서워요 (Lonely Night)","이제 나만 믿어요","London Boy","파이팅 해야지 (Feat. 이영지)","Polaroid","무지개","Attention","아버지","A bientot","LOVE DIVE","손이 참 곱던 그대","사랑인가 봐","사랑해 진짜","연애편지","보금자리","인생찬가","ANTIFRAGILE","NIGHT DANCER","Dangerously","Zero","The Drum","Like Crazy","바보가슴","Nxde","사랑하기 싫어","새삥 (Prod. by ZICO) (Feat. 호미들)","That's Hilarious","Nostalgia","흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야","Monologue","VIBE (Feat. Jimin of BTS)","Dynamite","오르트구름","그때 그 순간 그대로 (그그그)","다정히 내 이름을 부르면","TOMBOY","너의 모든 순간","해요 (2022)","Pink Venom","Unholy","Shut Down","취중고백","Dreamers (Music from the FIFA World Cup Qatar 2022 Official Soundtrack) (Feat. FIFA Sound)","그라데이션","Stay","That That (Prod. & Feat. SUGA of BTS)","사랑하지 않아서 그랬어","Loving You Girl (Feat. Hkeem)","고백","Set Me Free Pt.2","내가 아니라도","Cookie","Love Me Like This","Say I Love You","보고싶었어","나의 X에게","NOT SORRY (Feat. pH-1) (Prod. by Slom)","Candy","D N D","그대를 알고","그중에 그대를 만나","아모르 파티","ELEVEN","너를 보는게 지친 하루에","Rush Hour (Feat. j-hope of BTS)","Butter","아로하","봄날","When I Get Old","Say My Name","잘가요","희재","2002","모든 날, 모든 순간 (Every day, Every Moment)","정이라고 하자 (Feat. 10CM)","나의 목소리로","Blueming","FEARLESS","발걸음","당신을 만나","Every Second","봄여름가을겨울 (Still Life)","LOVE me","나비무덤","딱 10CM만","결국엔 너에게 닿아서","자격지심 (Feat. ZICO)","Off My Face","밤하늘의 별을 (2020)","인생은 뷰티풀","신호등","빛이 나는 사람","Face-off","주마등","Permission to Dance","오래오래","Bad Habits","주저하는 연인들을 위해","슬픈등","친구","Celebrity","Made You Look","Bad","Love story","약속 (約束)","INVU","Il Mare Calmo Della Sera","Alone","벚꽃 엔딩","떠나보낼 준비해 둘걸 그랬어","내 기쁨은 너가 벤틀리를 끄는 거야","At My Worst","내 손을 잡아","사계 (Four Seasons)","Love in Portofino","마지막 사랑","Left and Right (Feat. Jung Kook of BTS)","위대한 사랑 (Un Amore Cosi Grande)","나비 (Outro)","비와 당신","우린 그렇게 사랑해서","OHAYO MY NIGHT","Poppy (Korean Ver.)","Stronger (What Doesn't Kill You)","strawberry moon","풍등","Yet To Come","Ai Wo Tsutaetaidatoka","Feel My Rhythm","찰나가 영원이 될 때 (The Eternal Moment)","예뻤어","새벽에 걸려온 너의 전화는","라일락","오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)","어떻게 이별까지 사랑하겠어, 널 사랑하는 거지","그댄 행복에 살텐데 (2022)","That's Not How This Works (Feat. Dan ＋ Shay)","Cupid","on the street","한 페이지가 될 수 있게","비도 오고 그래서 (Feat. 신용재)","바라만 본다","Next Level","첫눈처럼 너에게 가겠다","Weekend","있잖아","Switch","BETELGEUSE","팡파레","헤픈 우연","WHEN I MOVE","En Garde (준비,시작!)","도깨비불 (Illusion)","Tiny Riot","사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)","마이웨이 (MY WAY) (Prod. by R.Tee)","건배","회전목마 (Feat. Zion.T & 원슈타인) (Prod. by Slom)","GHOST TOWN","12 : 45 (Stripped)","에잇 (Prod. & Feat. SUGA of BTS)","트위스트고고","너의 번호를 누르고 (Prod. by 영화처럼)","그대가 내 안에 박혔다 (그내박)","Expectations","시작","언제나 사랑해","MY BAG","나와 함께 가시렵니까","봄 사랑 벚꽃 말고","KISS ME (Feat. BIG Naughty)","처음부터 너와 나","너를 생각해","Way Back Home","오래된 노래","오.내.언.사 (Guitar Ver.)","Crazy","바람 같은 사람","스티커 사진","좋아 (JOAH)","사나이 청춘","비 오는 날 듣기 좋은 노래 (Feat. Colde)","밥 한 번 먹자"};
		String[] singer={"IVE (아이브)","Zior Park","지수 (JISOO)","NewJeans","NewJeans","STAYC (스테이씨)","윤하 (YOUNHA)","NewJeans","DK (디셈버)","Charlie Puth","임영웅","H1-KEY (하이키)","임영웅","헤이즈 (Heize)","#안녕","IVE (아이브)","임영웅","주주 시크릿","임영웅","임영웅","부석순 (SEVENTEEN)","임영웅","임영웅","NewJeans","임영웅","임영웅","IVE (아이브)","임영웅","멜로망스 (MeloMance)","임영웅","임영웅","임영웅","임영웅","LE SSERAFIM (르세라핌)","imase","Charlie Puth","NewJeans","Alan Walker","지민","송하예 & 한빈 (포맨)","(여자)아이들","지아 (Zia)","지코 (ZICO)","Charlie Puth","우디 (Woody)","장범준","테이 (Tei)","태양","방탄소년단","윤하 (YOUNHA)","WSG워너비 (가야G)","경서예지 & 전건호","(여자)아이들","성시경","#안녕","BLACKPINK","Sam Smith & Kim Petras","BLACKPINK","김민석 (멜로망스)","정국 & 방탄소년단","10CM","The Kid LAROI & Justin Bieber","싸이 (Psy)","임한별","Peder Elias","멜로망스 (MeloMance)","지민","주호","NewJeans","NMIXX","우디 (Woody)","WSG워너비 (4FIRE)","경서","이영지","NCT DREAM","Apink (에이핑크)","송하예","김호중","이홍기 (FT아일랜드)","IVE (아이브)","송하예","Crush","방탄소년단","조정석","방탄소년단","Christopher & 청하","Say Yes!","주호","성시경","Anne-Marie","폴킴","BIG Naughty (서동현)","김호중","아이유 (IU)","LE SSERAFIM (르세라핌)","DK (디셈버)","김호중 & 송가인","Mina Okabe","BIGBANG (빅뱅)","BE'O (비오)","포맨 (4MEN)","10CM & BIG Naughty (서동현)","WSG워너비 (가야G)","BE'O (비오)","Justin Bieber","경서","김호중","이무진","김호중","지민","김호중","방탄소년단","죠지","Ed Sheeran","잔나비","김호중","김호중","아이유 (IU)","Meghan Trainor","Christopher","볼빨간사춘기","김호중","태연 (TAEYEON)","김호중","지민","버스커 버스커 (Busker Busker)","임한별","김승민","Pink Sweat$","아이유 (IU)","태연 (TAEYEON)","김호중","신예영","Charlie Puth & 정국 & 방탄소년단","김호중","김호중","이무진","강민경 (다비치) & 잔나비 최정훈","디핵 (D-Hack) & PATEKO","STAYC (스테이씨)","Kelly Clarkson","아이유 (IU)","이찬원","방탄소년단","Aimyon","Red Velvet (레드벨벳)","마크툽 (Maktub)","DAY6 (데이식스)","한동근","아이유 (IU)","마크툽 (Maktub)","AKMU (악뮤)","최유리","Charlie Puth","FIFTY FIFTY","j-hope & J. Cole","DAY6 (데이식스)","헤이즈 (Heize)","MSG워너비 (M.O.M)","aespa","에일리 (Ailee)","태연 (TAEYEON)","폴킴","꾹꾹이","Yuuri","다비치","헤이즈 (Heize)","카라 (KARA)","En Butter","aespa","Sam Ryder","호미들","저스디스 (JUSTHIS) & R.Tee & 던말릭 (DON MALIK) & 허성현 (Huh) & KHAN & 맥대디 (Mckdaddy) & Los","이찬원","sokodomo","Benson Boone","etham","아이유 (IU)","이찬원","#안녕","순순희 (기태)","Anne-Marie & 민니 ((여자)아이들) & (여자)아이들","가호 (Gaho)","케이시 (Kassy)","(여자)아이들","이찬원","HIGH4 & 아이유","기리보이","볼빨간사춘기","주시크 (Joosiq)","숀 (SHAUN)","Standing Egg (스탠딩 에그)","이찬원","Gnarls Barkley","이찬원","21학번","박재범","이찬원","에픽하이 (EPIK HIGH)","이찬원"};
		
		
		//1.startsWith : 시작문자열이 같은 경우
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("검색어 입력: ");
//		String fd=sc.next(); //문자열을 받을때 next()사용
		/* nextInt() -> 정수
		 * nextDouble() -> 실수
		 * nextBoolean() -> true/false
		 * next() -> 문자열
		 */
		
		/*
		for(String s:title) {
			if(s.startsWith(fd)){
				System.out.println(s);
//				try {
//					Thread.sleep(500);
//				}catch(Exception ex) {}
			}
		}
		System.out.println("------끝나는문자-------");
		for(String s:title) {
			if(s.endsWith(fd)) {
				System.out.println(s);
			}
		}
		
		System.out.println("----------contains(포함)----");
		for(String s:title) {
			if(s.contains(fd)) {
				System.out.println(s);
			}
		}*/
		
		
		while(true) {
			System.out.println("======menu======");
			System.out.println("1.목록");
			System.out.println("2.노래명에서 찾기");
			System.out.println("3.가수명에서 찾기");
			System.out.println("4.종료");
			System.out.println("===================");
			System.out.println("메뉴선택(1~4): ");
			
			int menu=sc.nextInt();
			// 오류처리
			if(menu<1 || menu>4) {
				System.out.println("메뉴 선택 오류 입니다!");
				continue;
			}
			// 종료시점
			if(menu==4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			if(menu==1) {
				for(int i=0;i<title.length;i++) {
					System.out.println((i+1)+"."+title[i]+" ["+singer[i]+"]");
				}
			}
			
			if(menu==2) {
				System.out.println("검색어 입력(노래명):");
				String fd=sc.next();
				for(String s:title) {
					if(s.contains(fd)) {
						System.out.println(s);
					}

				}
			}
			
			if(menu==3) {
				//오라클 -> JOIN 사용
				System.out.println("검색어 입력(가수명):");
				String fd=sc.next();
				for(int i=0;i<singer.length;i++) {
					if(singer[i].contains(fd)) {
						System.out.println(title[i]);
					}
				}
			}
		}//while
	}

}
