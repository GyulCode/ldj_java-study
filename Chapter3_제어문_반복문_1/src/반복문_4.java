//1-2+3-4+5-6+7-8+9-10 -> 값
//for -> 반드시 패턴이 있어야함
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0) {
				sum-=i;
			}
			else
				sum+=i;
		}
		System.out.println("총합 : "+sum);

	}

}
