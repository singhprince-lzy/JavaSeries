package chat;

import java.net.*;
import java.io.*;

public class Client {
	
	private Socket socket;
	private DataInputStream input;
	private DataOutputStream output;

	public Client(String ipadd,int port) {
		try {
			socket=new Socket(ipadd,port);
			input=new DataInputStream(System.in);
			
			output=new DataOutputStream(socket.getOutputStream());
		}catch(UnknownHostException exc) {
			System.out.println(exc);
			
		}catch(IOException i) {
			System.out.println(i);
		}
		
		String message=" ";
		while(!message.equals("Over")) {
			try {
				message=input.readLine();
				output.writeUTF(message);
			}catch(IOException i) {
				System.out.println(i);			}
		}
		
		
		try {
			input.close();
			output.close();
			socket.close();
		}catch(IOException i) {
			System.out.println(i);
		}
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		Client c=new Client("127.0.0.1",9000);
		
		
	}

}
