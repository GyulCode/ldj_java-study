
public class 문제_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=1; i<=10;i++)
		{
			if(i%2==0) {
				sum-=i;	
			}
			else
				sum+=i;
		}
		System.out.println("최종 합은 "+sum);

	}

}
