package recursion;

public class DayOne {
	
	//Factorial using recursion
	public int fac(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return 1;
		}
		
		return n*fac(n-1);
	}
	
	//sum of the digit of a number
	
	int sumOfDigit(int num) {
		if(num<0) {
			return -1;
		}
		if(num<=0) {
			return 0;
		}
		return num%10+sumOfDigit(num/10);
	}
	
	//nth fibbonnachi number
	int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	
	//convert decimal to binary
	int decToBin(int num) {
		int res=0;
		if(num==0) {
			return 0;
		}
		res=num%2+10*decToBin(num/2);
		return res;
		
	}
	
	//Product of array
	int product(int arr[],int n) {
		if(n==0) {
			return arr[0];
		}
		return arr[n-1]*product(arr,n-1);
	}
	
	//GCD of two number
	int GCD(int a, int b) {
		if(a==0) {
			return b;
		}
		return GCD(b%a,a);	
	}
	
	//calculate the power of 2
	
	int power(int a,int n) {
		if(n==0) {
			return 1;
		}
		return a*power(a,n-1);
	}
	
	//print string in reverse order
	String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	
	//check if string is palindrome or not
	boolean isPalin(String str) {
		if(str.length()==0 ||str.length()==1) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return isPalin(str.substring(1,str.length()-1));
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		String s="RUBBUR";
		DayOne d=new DayOne();
		int n=3;
		boolean res;
		res=d.isPalin(s);
		System.out.println(res);

	}
	


}
