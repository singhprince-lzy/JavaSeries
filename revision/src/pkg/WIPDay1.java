package pkg;

class Vehicle{
	int x;
	int y;
}


public class WIPDay1 {

	public static void main(String[] args) {
		Vehicle car1=new Vehicle();
		Vehicle car2=car1;
		Vehicle car3=new Vehicle();
		car2=car3;
		car3.x=100;
		car3.y=200;
		car1.x=10;
		car1.y=12;
		car2.x=150;
		System.out.println(car1.x+" "+car3.x);
		
		
	}

}
