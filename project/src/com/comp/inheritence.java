package com.comp;

public class inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12345432";
		int m=0, len=str.length();
		int j=len;
		for(int i=1;i<=len/2;i++) {
			if(str.charAt(i)==str.charAt(j-1)) {
				m=1;
				j--;
			}
			else
				m=0;
			if(m==1) 
				System.out.println("Palindrom");
		}
		
//		String str= "123454321";
//		System.out.println(str.charAt(2));
//		

	}

}
