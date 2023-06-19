package MyMemo;

import java.io.*;
import java.util.StringTokenizer;
/*
 * 시간 복잡도
 * 0~N 입력한 과목수의 길이만큼 반복문을 수행한다 O(n)
 * 이런 O(n)이 main에서 1번 newAverage()메소드에서 2번 O(n)총 3번 있다 -> O(3n)
 * 상수는 생략하므로 복잡도는 O(n)이다.
 * 
 */

public class algorithm_study_2 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static double[] avg;
	static public void newAverage() throws IOException{
		// 과목의 최대값을 저장하는 변수 temp, 새로운 점수를 저장할 total, 새평균 newavg
		double temp=0;
		double total=0.0;
		double newavg=0;
		
		for(int i=0;i<avg.length;i++) {
			if(avg[i]>temp) {
				temp=avg[i];
			}
		}
		
		for(int j=0; j<avg.length;j++) {
			avg[j]/=temp;
			avg[j]*=100;
			total+=avg[j];
			if(j==(avg.length-1)){
				newavg=total/avg.length;
			}
		}
		out.write(String.valueOf(newavg));
		out.flush();
	}
	
	
	public static void main(String[] args) {
		try {
			int subject = Integer.parseInt(in.readLine());
			avg = new double[subject];
			
			st = new StringTokenizer(in.readLine());
			
			for(int i=0; i<avg.length;i++) {
				avg[i] = Integer.parseInt(st.nextToken());
			}
			newAverage();
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
