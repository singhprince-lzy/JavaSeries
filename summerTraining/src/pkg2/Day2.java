package pkg2;

import java.util.stream.IntStream;
import java.util.*;
import java.io.*;

public class Day2 {

	public static void main(String[] args) {
		
//		try {
//			FileOutputStream fin=new FileOutputStream("abc.txt");
//			DataOutputStream dos=new DataOutputStream(System.out);
//			
//			System.out.println(dos.toString());
//			//dos.writeChars("Hi");
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		try {
			FileInputStream fin=new FileInputStream("abc.txt");
			//System.out.println(fin.readNBytes(10));
			DataInputStream dos=new DataInputStream(System.in);
			
			System.out.println(dos.readLine());//("My Name id Prince Kumar singh.");
			
		}catch(Exception e) {
			System.out.println(e);
		}
//		
		
//		StringTokenizer str=new StringTokenizer("Heelo prince you are placed."," ");
//		while(str.hasMoreTokens()) {
//			System.out.println(str.nextToken());
//		}
//		
//		StringTokenizer str1=new StringTokenizer("Heelo:prince:you:are:placed.",":");
//		while(str1.hasMoreTokens()) {
//			System.out.println(str1.nextToken());
//		}
//		
//		StringTokenizer str2=new StringTokenizer("Heeloprinceyoareplaced.","a");
//		while(str2.hasMoreTokens()) {
//			System.out.println(str2.nextToken());
//		}
//		
//		StringTokenizer str3=new StringTokenizer("Heelo prince: you are placed.");
//		while(str3.hasMoreTokens()) {
//			System.out.print(str3.nextToken());
//		}
		// string 
//		String str="Prince Kumar ";
//		System.out.println(str);
//		//concat
//		str=str.concat("Singh");
//		System.out.println(str);
//		//compare
//		boolean b=str.equalsIgnoreCase("Prince kumar singh");
//		System.out.println(b);
//		//repeat
//		str=str.repeat(5);
//		System.out.println(str);
//		//character at
//		System.out.println(str.charAt(10));
//		//split
//		System.out.println(str.split("P"));
		
		
		
		
		//string buffer
		
//		StringBuffer str1=new StringBuffer(" Hi there");
//		str1.insert(1, "R");
//		System.out.println(str1);
//		str1.append(" How Are You");
//		System.out.println(str1);
//		int i=str1.capacity();
//		System.out.println(i);
//		str1.delete(0, 10);
//		System.out.println(str1);
//		int n=str1.codePointCount(0,str1.length());
//		System.out.println(n);
//		System.out.println(str1.hashCode());
//		
//		
//		
//		System.out.println(str1.hashCode());
		

	}

}
