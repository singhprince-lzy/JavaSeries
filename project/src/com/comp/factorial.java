package com.comp;
class fact{
	int factr(int val) {
		int result;
		if(val==1)return 1;
		result=factr(val-1)*val;
		return result;
	}
}

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact f=new fact();
		System.out.println(f.factr(1));	
		System.out.println(f.factr(2));	
		System.out.println(f.factr(3));	
		System.out.println(f.factr(4));	
		System.out.println(f.factr(5));	
		
	}

}
