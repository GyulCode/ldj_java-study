package MyMemo;

import java.io.*;

public class algorithm_study_2 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static int num, index=0;
	static int[] temp;
	
	// static이 아닌 메소드는 static변수를 인자로 넣을 수 없다. -> 왜?
	static boolean perfectnum(int num) {
		temp = new int[num];
		int compare=0;
		index=0;
		
		//약수 구하기
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				temp[index++]=i;
			}
		}
		
		//약수들의 합
		for(int i=0;i<index;i++) {
			compare+=temp[i];
		}
		if(compare==num) {
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// 약수 찾기 -> 약수들의 합 비교 -> 맞으면 출력
		// -1 입력시 종료
		
		boolean ans = false;
		
		while(true) {
			
			try {
				num = Integer.parseInt(in.readLine());
				
				if(num==-1) {
					break;
				}
				
				ans = perfectnum(num);
				
				if(ans==true) {
					System.out.print(num+" = ");
					for(int i=0; i<index;i++) {
						if(i==index-1) {
							System.out.println(temp[i]);
							break;
						}
						System.out.print(temp[i]+" + " );
					}
				}
				else {
					System.out.println(num+" is NOT pefect.");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
