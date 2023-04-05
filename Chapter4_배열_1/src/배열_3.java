/*
 * 3명의 학생이 국어, 영어, 수학 -> 총점, 평균, 학점, 등수
 * 2차원 배열[2][3]
 * 
 */
import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
		
		//object[][] student=new object[3][7]; Object는 모든 데이터를 통합할 수 있다.
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<kor.length; i++) {
			System.out.print((i+1)+"번째 국어 점수 입력: ");
			kor[i]=sc.nextInt();
			System.out.print((i+1)+"번째 영어 점수 입력: ");
			eng[i]=sc.nextInt();
			System.out.print((i+1)+"번째 수학 점수 입력: ");
			math[i]=sc.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//학점
		for(int i=0;i<kor.length;i++) {
			switch((int)avg[i]/10) {
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
				
				
			}
		}
		
		//등수
		for(int i=0; i<kor.length; i++) {
			rank[i]=1;
			for(int j=0; j<kor.length;j++) {
				if(avg[i]<avg[j])
					rank[i]++;
			}
		}
		
		
		System.out.println("==========성적표============");
		for(int i=0; i<kor.length;i++) {
			System.out.printf("%-5d %-5d %-5d %-7d %-7.2f %-3c%-5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
		

			
		
		

		
		
	}

}
