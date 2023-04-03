//1부터 100까지의 합
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
//		for(int i=1; i<=100; i++)
//		{
//			sum=sum+i; // sum+=i
//			System.out.println("sum="+sum+",i="+i);
//		}
//		System.out.println("1~100까지의 합은"+sum);
//		
		sum = 0;
		int hol =0;
		for(int i=3; i<=100; i+=3)
		{
			sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
		for(int i=1; i<=100; i+=2)
		{
			hol+=i;
			System.out.println("hol="+hol+",i="+i);
		}
		System.out.println("1~100까지의 3의 배수 합은"+sum);
		System.out.println("1~100까지의 홀수의 합은"+hol);

	}

}
