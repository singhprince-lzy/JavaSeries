package prince;

import pkg.*;
 

abstract class ones{
	int i;
	abstract void getname();
	static {
		System.out.println("This is abstract class");
	}
}

final class two extends ones{
	int j=10;
	String na="Prince";
	void getname() {
		System.out.println("This is my name "+na);
		i=j;
		System.out.println("Value of i is "+i);
	}
}

public class abstractex {

	public abstractex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two obj =new two();
		obj.getname();
		lab1 l= new lab1();
		
		

	}

}
