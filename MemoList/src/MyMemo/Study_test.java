package MyMemo;

import java.io.*;
import java.util.*;

public class Study_test {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] cardnum ;
	final int b = 5;
	int compare(int arr[], int n, int m) {
		
		int a=1;
		return a;
	}
	
	public static void main(String[] args) {
		
		try {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			cardnum = new int[n];                  
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				cardnum[i] = Integer.parseInt(st.nextToken());
			}
			
		} catch (Exception ex) {
			
		}
	}
	
    
    
}
