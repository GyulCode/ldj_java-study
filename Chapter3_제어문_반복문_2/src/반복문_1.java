/*
 * 반복문 : 유사한 내용이 여러번 반복될떄 사용
 * 			ex)영화목록, 맛집목록, 메인화면, 상세보기, 페이징
 * 종류 :
 *      반복횟수가 정행져 있을 경우 : for
 *      반복횟수가 정행져 있지 않을 경우 : while
 *      한번이상 수행이 가능하게 : do~while
 *      ----------------------------
 *      자바 : 출력,제어 -> for
 *            데이터베이스, 네트워크 -> while
 * 형식)
 *      for
 *      		1     2    4  -> 1,2,3,4순
 *        for(초기값; 조건식; 증가식)
 *        {
 *          반복 수행문장  3
 *        }
 *        
 *      while
 *      초기값-------------1
 *      while(조건문)------2
 *      {
 *        반복문장 수행문장---3
 *        증가식-----------4 -> 2번이동 (true수행/false면 종료)
 *      }
 *      
 *      do~while
 *      초기값-------------1
 *      do{------
 *           반복 수행문장---2
 *           증가식--------3 -> 2번이동 (true수행/false면 종료)
 *      }while(조건문);-----4
 *      
 *      for->2차
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String[] food = {
				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
				"아삭아삭한 고추된장박이",
				"누텔라 견과류 토스트 만들기",
				"등갈비김치찜 김치넣고 푹푹 익히기만 하세요 복잡한건 정말 싫으네요 (양념도 초심플)",
				"시래기갈치조림 고추장 양념장 저녁메인반찬 추천"
				
		};
		String[] chef = {
				"루던",
				"돌하우스",
				"ddd516",
				"즐거운날랄라",
				"해피레시피류이"
				
		};
		for(int i=0; i<5; i++) {
			System.out.println(food[i]+"("+chef[i]+")");
		}*/
		
		/*
		 *  for(초기값;조건식;증가식)
		 *  {
		 *    반복 수행문장
		 *  }
		 */
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n===========");
		
//		System.out.println("=============");
//		//A~Z 출력
//		for(char c='A';c<='Z';c++) {
//			System.out.print(c+" ");
//		}
		char c='A';
		for(int i=0;i<26;i++) {
			System.out.print(c++ +" ");
		}
		System.out.println("\n===========");
	
		/*
		 * 조건식 -> 형식
		 * 초기값-----------1
		 * while(조건식)----2
		 * {
		 *   반복 수행문-----3
		 *   증가식 --------4
		 * }
		 * 
		 * 2번이 false면 종료
		 * ***무한루프 (네트워크 서버, 데이터베이스 값 읽기, 파일읽기)
		 * ***파일읽기 -> -1(EOF)
		 * 
		 */
		//1~10까지 출력
		int i=1; //초기값(시작점)
		while(i<=10) { //조건식(종료점) i가 10되면 끝!	
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n===========");
		
		c='A';
		i=0;
		while(i<26) {
			System.out.print(c++ +" ");
			i++;
		}
		System.out.println("\n===========");
		/*
		 * do~while : 후조건 -> 무조건 1번수행
		 * 형식)
		 * 		초기값 ----------1
		 *     do
		 *     {
		 *       반복실행 --------2
		 *       증가식 ---------3
		 *     }while(조건식) -- 4 -> true -> 2번 이동
		 *     						false 종료
		 *     조건식이 뒤에 있어서 while문과는 다르게 증가 후 조건과 비교하게됨
		 */
		i=1;
		do {
			System.out.print(i +" ");
			i++;
		}while(i<=10);
		System.out.println("\n===========");
		
		c='A';
		i=0;
		do {
			System.out.print(c +" ");
			c++;
			i++;
		}while(i<26);
		
		
		

	}

}
