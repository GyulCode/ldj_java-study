package MyMemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * 배열갯수 N 반복횟수 M
 * 범위 i ~ j 입력값 k // 배열 슬라이싱
 * 시간복잡도 특정 범위(i j를 갖는 for문)을 M회 반복한다 O(Mn) -> O(n)
 */

public class algorithm_study {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static int n;
	
	public static void main(String[] args) {
		try {
			
			String a= in.readLine();
			n = a.length();
			int ans=1;
			char com[] = new char[n];
			
			for(int i=0; i<n; i++) {
				com[i] = a.charAt(i);
			}
			int k = n;
			// 012345
			// 05 14 23
			//01234
			//04 13 
			 //같은지 다른지 검사
			 for(int i=0; i<n/2;i++) {
				 if(com[i]!=com[(n-1)-i]) {
					 ans=0;
					 break;
				 }
			 }
			 out.write(Integer.toString(ans));
			 out.flush();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
