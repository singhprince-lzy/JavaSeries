package com.prince;

class MyClass{
 int x; 
 String MyString ="Prince kumar singh";	
 boolean w= 3>2;
 MyClass()
 {
	 System.out.println("This section denotes that how to initalize the object");
 }
 void getData(int y)
 {
	 x=y;
 }
 void ShowData()
 {
	 System.out.println("X ="+x);
 }
}
public class TestDemo {

	public TestDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	MyClass obj1 = new MyClass();
	//Calling obj
	obj1.getData(10);
	System.out.println("Value of string is "+ obj1.MyString);
	System.out.println("Value of boolean is "+ obj1.w);
	obj1.ShowData();
	

	}

}
