package st;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Class1 {

	public static void main(String[] args) {
		//command line arguments
//		int s=Integer.parseInt(args[0]);
//		int s1=Integer.parseInt(args[1]);
//		int s2=Integer.parseInt(args[2]);
//		
//		System.out.println(s+" "+s1+" "+s2);
		
		
		
		// arraylist example
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(100);
		arr.add(0);
		arr.add(1);
		arr.add(111);
		arr.add(10);
		arr.add(20);
		arr.add(200);
		Collections.sort(arr);
		
		ArrayList<Integer>arr2=new ArrayList<>();
		arr2.add(100);
		arr2.add(0);
		arr2.add(1);
		arr2.add(111);
		arr2.add(10);
		arr2.add(20);
		arr2.add(200);
		Collections.sort(arr2);
		
		
		
		//sepcial for loop
//		for(int i:arr) {
//			System.out.println(i);
//		}
//		
//		System.out.println(arr.get(arr.size()-1));
//		arr.set(1, 1000);
//		arr.remove(1);
//		System.out.println(arr.get(1));
		
		//
//		ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
//		arr1.add(arr);
//		arr1.add(arr2);
//	
//		System.out.print(arr1);
		
		ArrayList<String>al=new ArrayList<>();
		al.add("Prince");
		al.add("Prince1");
		al.add("Prince2");
		al.add("Prince3");
		ArrayList<String>a;
		
		//serialization
		//Deserialization
		try {
		FileInputStream fos=new FileInputStream("Name");
		ObjectInputStream oos=new ObjectInputStream(fos);
		oos.readObject();
		oos.close();
		
		fos.close();}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

		
		
	}

}
