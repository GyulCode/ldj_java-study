package MyMemo;

import java.io.*;

public class algorithm_study {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	// static이 아닌 메소드는 static변수를 인자로 넣을 수 없다. -> 왜?
     static void perfectnum(int num){
		int index=0, compare=0;
		int[] temp = new int[num];
		
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
		
		try {
			if(compare!=num){
				out.write(num+" is NOT pefect.");
			}
			
			System.out.print(num+" = ");
			
			for(int i=0; i<index;i++) {
				System.out.println(index +"랑"+ i);
				if(i==index-1) {
					System.out.println(temp[i]);
					break;
				}
				out.write(temp[i]+" + ");
			}
		
		
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// 약수 찾기 -> 약수들의 합 비교 -> 맞으면 출력
		// -1 입력시 종료
		
		while(true) {
			
			try {
				int num = Integer.parseInt(in.readLine());
				
				if(num==-1) {
					break;
				}
				
				perfectnum(num);
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}