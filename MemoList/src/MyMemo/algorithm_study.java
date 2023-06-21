package MyMemo;

import java.io.*;
import java.util.StringTokenizer;

/*
 * 배열갯수 N 반복횟수 M
 * 범위 i ~ j 입력값 k // 배열 슬라이싱
 * 시간복잡도 특정 범위(i j를 갖는 for문)을 M회 반복한다 O(Mn) -> O(n)
 */

public class algorithm_study {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] arr;
	
	static public void insertball(int loop) {
		try {
			while(loop-- > 0) {
				st = new StringTokenizer(in.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				for(int st=i-1; st<=j-1; st++) {
					arr[st]=k;
				}
			}
			for(int i=0; i<arr.length;i++) {
				//System.out.print(arr[i]+" ");
				//out.write(String.valueOf(arr[i])+"\n");
				out.write(Integer.toString(arr[i])+" ");
				
				//integer.tostring -> null값이 예외처리가 될수 있다.
				//Integer.toString() 은 주어진 Integer 객체가 null 인 경우 NullPointerException 을 던질 수 있습니다 .
				//string.valueof(내부적으로 Integer.toString() 메서드를 사용한다. )
				//String.valueOf() 는 String.valueOf(Object obj) 메서드 로 이동하여 null 을 반환 하기 때문에 예외를 throw하지 않습니다.
				//https://recordsoflife.tistory.com/997
			}
			out.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		st = new StringTokenizer(in.readLine());
		int num = Integer.parseInt(st.nextToken());
		int loop = Integer.parseInt(st.nextToken());
		arr= new int[num];
		
		insertball(loop);
		
	}
	
}
