package com.comp;

public class prince1 {

	public prince1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String msg ="This is the test";
		String encmsg="";
		String decmsg="";
		int key=2;
		
		System.out.println("Original message :"+msg);
		System.out.println();
		
		//this is the encrypted message that will be delivered to the client.
		for(int i=0;i<msg.length();i++) {
			encmsg=encmsg+(char)(msg.charAt(i)^key);
		}
		
		System.out.println("Encryptec message :"+encmsg);
		
		
		for(int i=0;i<msg.length();i++) {
			decmsg=decmsg+(char)(encmsg.charAt(i)^key);
		}
		System.out.println("Decrypted  message :"+decmsg);
	}

}
