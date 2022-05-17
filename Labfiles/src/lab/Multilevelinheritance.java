package lab;
class vehicle{
	public void funv() {
		System.out.print("it is a vehicle.");
	}
}

class bus extends vehicle{
	public void funb() {
		System.out.print("This is bus and .");
	}
}

public class Multilevelinheritance {
	public static void main(String[] args) {
		bus b1=new bus();
		b1.funb();
		b1.funv();

	}

}
