package fileHandeling;
import java.io.*;

public class Lec43ss {

	public static void main(String[] args) throws IOException,FileNotFoundException {
//********Reading from file using Bufferedinput stream
		BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\mobile.csv"));
		String s;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		br.close();
		
		
//********Writing using BufferedOutputStream*********
//		String s="Hi Prince what are your long term and short term goal can you pplease tell me";
//		BufferedWriter b1= new BufferedWriter(new FileWriter("C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\Test.txt"));
//		b1.write(s);
//		b1.close();
		
		
		
//********Reading using fileinputStream**************
//		File f1= new File("C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\mobile1.csv");
//		FileInputStream fin= new FileInputStream(f1);
//		int i=fin.read();
//		while(i!=-1) {
//			System.out.print((char)i);
//			i=fin.read();
//		}		
//		fin.close();
		
//********Writing using fileOutputStream**********
//		FileOutputStream fout;
//		fout=new FileOutputStream(f1,true);
//		
//		String s="Hello this is prince kumar singh and i am writing to the file";
//		char [] ch=s.toCharArray();
//		
//		for(int i=0;i<ch.length;i++) {
//			fout.write(ch[i]);
//		}
//		fout.close();
		

	}

}
