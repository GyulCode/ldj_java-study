package 자바1일차_자바특징;

public class Car extends Vehicle{
	
	Car(){
		System.out.println("Car 생성자 ");
	}
	
	String s="Car";
	
	public void Bu2() {
		System.out.println("car의 오버라이딩된 부222");
		super.Bu2();
	}
	
	public void Bu3() {
		System.out.println("car의 부33");
		
	}
	

}
