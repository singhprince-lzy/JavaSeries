package pkg;

public class lab1 {
	static int i;
	//this is normal calling of varargs #function1
	static void varargs(int...p) {
		System.out.println("The length of this varargs is: "+p.length);
		for(int k=0;k<p.length;k++) {
			System.out.println("value "+(k+1)+" is: "+ p[k]);
		}
	}
	//Overloading of the var args #function 2
	static void varargs(String...p) {
		System.out.println("The length of this varargs is: "+p.length);
		for(int k=0;k<p.length;k++) {
			System.out.println("value "+(k+1)+" is: "+ p[k]);
		}
	}
	// #function 3
	static void varargs(double...p) {
		System.out.println("The length of this varargs is: "+p.length);
		for(int k=0;k<p.length;k++) {
			System.out.println("value "+(k+1)+" is: "+ p[k]);
		}
	}
	
	//static block show
	static {
		System.out.println("Currently you are in the static block of code.");
	}

	public lab1() {
		// TODO Auto-generated constructor stub
		System.out.println("Under constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Under main");
		lab1 lab= new lab1();
		lab.i=10;
		System.out.println("value of the i is: "+lab.i);
		System.out.print("");
		lab1.varargs(1);
		lab1.varargs(1,2,3);
		lab1.varargs("prince","Nitesh","Bittu","vikash");
		lab1.varargs(10.5,12.456);
		lab1.varargs(1,2);
		//lab1.varargs(); #here it should be ambigious because of overloading.
		System.out.println("The program is ende successfully.");
	}

}
