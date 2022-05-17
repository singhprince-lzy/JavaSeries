package fileHandeling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\input.txt");
		FileWriter fw=new FileWriter("C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\output.txt");
		String s="";
		int ch;
		while((ch=fr.read())!=-1){
			if((char)ch==','){
				String str=s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
				fw.append(str);
				fw.append(",");
				s="";
			}
			else{
				s+=(char)ch;
			}
			
		}
		String str=s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		fw.append(str);

		fr.close();
		fw.close();
		
		System.out.println("Succeded");
	}

}
