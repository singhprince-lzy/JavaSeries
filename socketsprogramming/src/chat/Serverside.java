package chat;

import java.net.*;
import java.io.*;

public class Serverside {
	private Socket socket=null;
	private DataInputStream input=null;
	private ServerSocket ss=null;

	public Serverside(int port) {
		// TODO Auto-generated constructor stub
		
		try {
			ss=new ServerSocket(port);
			System.out.println("Server Started....");
			System.out.println("Waiting for client.....");
			socket=ss.accept();
			System.out.println("Client accepted..");
			
			input=new DataInputStream(new 
					BufferedInputStream(socket.getInputStream()));
			
			String Line=" ";
			while(!Line.equals("Over")) {
				try {
					Line =input.readUTF();
					System.out.print(Line);
					
				}catch(IOException i) {
					System.out.println(i);
				}
			}
			
			System.out.println("Closing connection..");
			socket.close();
			input.close();
		}catch(IOException i) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serverside s=new Serverside(9000);
		

	}

}
