/*
 *    같은 자바파일에 클래스 여러개 만들 수 있다.
 *    public은 한개의 class에서만 사용이 가능하다
 *    ->권장사항 파일을 따로 만든다.
 */

class Category{
	int no;
	String poster;
	String title;
	String subject;
	
}
/*
 *   멤버변수(인스턴스변수)
 *   ---------------
 *   1. 기본형
 *   2. 배열
 *   3. 클래스
 */
class FoodHouse{
	int no; //중복이 안된 숫자 -> primary key-> 상세보기
	int cno; //참조키 -> foreign key
	String[] poster=new String[5];
	String name;
	double score;
	
	String address1, address2;
	String tel;
	String type;
	String price;
	String parking;
	String stime, etime;
	String hol;
	String menu;
	
	
	
	
}

public class 사용자정의_데이터형_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
