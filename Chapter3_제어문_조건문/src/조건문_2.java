//정수를 입력 받아서 3의배수, 5의배수, 7의 배수인지 확인, 아닌경우에는 배수가 아니다.
//
public class 조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15; //(int)((Math.random()*100)+1); //1~100
		
		
		if(num%3==0)
			System.out.println(num+"는(은) 3의 배수입니다.");
		else if(num%5==0)
			System.out.println(num+"는(은) 5의 배수입니다.");
		else if(num%7==0)
			System.out.println(num+"는(은) 7의 배수입니다.");
		//if(!(num%3==0 || num%5==0 || num%7==0))
		else
			System.out.println("해당 배수가 아닙니다.");
		//else, else if 단일조건문, 다중조건문

	}

}
