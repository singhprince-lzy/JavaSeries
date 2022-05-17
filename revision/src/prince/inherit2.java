package prince;
//example for showing the superclass reference and subclass object.

class a{
	int a;
	void show() {
		System.out.println("By default value of a in base class is "+a);
	}
}
class b extends a{
	int c;
	void show(int p) {
		a=p;
		System.out.println("Value of a in child is  "+a);
		System.out.println();
	}
}

public class inherit2 {

	public inherit2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj = new b();
		
		
		obj.show(10);
		obj.show();
		

	}

}
