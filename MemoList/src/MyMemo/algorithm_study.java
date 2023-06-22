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
<<<<<<< HEAD
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
=======
	static void ZeroCount(int n, int m) throws IOException{
		int count =0;
		char[] temp= {};
		for(int i=n;i<=m;i++) {
			temp = String.valueOf(i).toCharArray(); 
			//문자열로 저장시킬때 10 -> '1' | '0' 이렇게 하나씩 끊어서 저장된다!
			for(int j=0; j<temp.length;j++) {
				if(temp[j]=='0') {
					count++;
				}
			}
>>>>>>> branch 'master' of https://github.com/GyulCode/ldj_java-study.git
		}
<<<<<<< HEAD
		
=======
		out.write(count);
>>>>>>> branch 'master' of https://github.com/GyulCode/ldj_java-study.git
	}
	
<<<<<<< HEAD
	public static void main(String[] args) throws IOException{
		st = new StringTokenizer(in.readLine());
		int num = Integer.parseInt(st.nextToken());
		int loop = Integer.parseInt(st.nextToken());
		arr= new int[num];
		
		insertball(loop);
		
=======
	public static void main(String[] args) throws IOException {
		int number = Integer.parseInt(in.readLine());
		while(number > 0) {
			st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			ZeroCount(n, m);
			
			number--;
		}
		out.flush();
>>>>>>> branch 'master' of https://github.com/GyulCode/ldj_java-study.git
	}
	
}
