// 성적계산
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요(10 20 30) : ");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		int avg=(kor+eng+math)/3;
		//case는 중복할 수 없다. = 라벨이 중복되면 안됨
		//학점출력
		char score='A';
		switch(avg/10) {
		case 10: //100점이나 90점이나 둘다 A라 그냥 묶어둠
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default : //else
			score='F';
		}
		System.out.println("학점 : "+score);

	}

}
