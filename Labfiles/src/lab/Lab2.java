package lab;

public class Lab2 {

	public static void main(String[] args) {
		
		int a=1000,b=20,c=100,large;
		
		System.out.println("Program for Finding largest of three numbers ");
		
		large=(a>b?a:b);
		large=(large>c?large:c);
		
		System.out.println("Largest number is "+ large);
	}}
