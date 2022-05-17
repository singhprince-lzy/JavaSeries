package prince;
interface javat{
	public int i=10;
	public void show();
	public static void notshow() {
		System.out.println("This is from interface method notshow static");
	}

}

interface hero extends javat{
	void shoow();
}

class onee implements javat,hero{
	public void shoow() {
		System.out.println("From shoow of hero class");
	}
	public void show() {
		System.out.println("Value of the i is  inside onee "+ i);
	}
}

public class interfaceex {

	public interfaceex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onee obj =new onee();
		obj.show();
		obj.shoow();
		javat.notshow();
	}

}
