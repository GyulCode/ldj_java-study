package MyMemo;

import java.io.*;
import java.util.*;

public class Study_test {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] cardnum ;
	static int temp=0;
	
	static int compare(int arr[], int n, int m) {
		int answer = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1;j++) {
				for(int k=j+1; k<n; k++) {
					temp = arr[i]+arr[j]+arr[k];
					
					if(m==temp) {
						return temp;
					}
					if(answer<temp && temp<m) {
						answer=temp;
					}
					
				}
			}
		}
		return answer;
	}
	 
	public static void main(String[] args) {
		 
		try {
			st = new StringTokenizer(br.readLine()); 
			int n = Integer.parseInt(st.nextToken()); // 카드 갯수는 3~100
			int m = Integer.parseInt(st.nextToken()); // 카드의 합은 10~300,000
			
			cardnum = new int[n];
			
			st = new StringTokenizer(br.readLine()); //진열될 카드의 값들 각값은 100,000이하
			for(int i=0; i<n; i++) {
				cardnum[i] = Integer.parseInt(st.nextToken());
			}
			
			int answer=compare(cardnum,n,m);
			System.out.println(answer);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
    
}
