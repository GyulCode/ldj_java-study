// 3의배수, 5의배수 7의 배수 -> 갯수
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0, a5=0, a7=0; // 합
		int c3=0, c5=0, c7=0; //갯수
		
		int i=1;
		while(i<=100) { //공배수는 둘다 측정되어야함
			if(i%3==0) {
				a3+=i;
				c3++;
			}
			if(i%5==0) {
				a5+=i;
				c5++;
			}
			if(i%7==0) {
				a7+=i;
				c7++;
			}
				
			i++; //증가식
		}
		System.out.println("======결과값=======");
		System.out.println("1~100사이의 3의 배수의 합: "+a3+"갯수: "+c3);
		System.out.println("1~100사이의 5의 배수의 합: "+a5+"갯수: "+c5);
		System.out.println("1~100사이의 7의 배수의 합: "+a7+"갯수: "+c7);
		
		int max = c3, min=c3;
		if(max<c5)
			max=c5;
		if(max<c7)
			max=c7;
		
		if(min>c5)
			min=c5;
		if(min>c7)
			min=c7;
		System.out.println("최대값: "+max+"\t최소값: "+min);

	}

}
