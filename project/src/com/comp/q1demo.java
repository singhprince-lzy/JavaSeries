package com.comp;
//use of the static block for the demonstration.  
class StaticBlock{
	static double rootof2;
	static double rootof3;
	
	static {
		System.out.println("Inside the static block");
		rootof2=Math.sqrt(2.0);
		rootof3=Math.sqrt(3.0);
	}
	
	StaticBlock(String msg){
		System.out.println(msg);
		
	}
	
}

public class q1demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb=new StaticBlock("Inside constructor");
		
		System.out.println("Square root of thr 2 "+sb.rootof2);
		System.out.println("Squareroot of the 3 "+sb.rootof3);

	}

}
