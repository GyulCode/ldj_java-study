
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var age = 26;
		var beverage = (age >= 21) ? "Beer" : "Juice";
		
		int count =0;
		for(int i=2; i<=30;i++) {
			if(i%2==0) {
				count++;
				System.out.printf("%2d\t",i);
				if(count==3) {
					System.out.println("");
					count=0;
				}
				//또는
//				if(i%3==0)
//					System.out.println();
			}

		}

			

	}

}
