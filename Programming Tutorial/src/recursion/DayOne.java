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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOne d=new DayOne();
		int n=3;
		double res=0;
		if(n<0) {
			res=d.power(3,Math.abs(n));
			res=1/res;
		}
		else {
			res=d.power(3,Math.abs(n));
		}
		
		System.out.println(res);

	}
	
	//GCD of two number
	int GCD(int a, int b) {
		if(a==0) {
			return b;
		}
		return GCD(b,a%b);
		
		
		
	}
	
	//calculate the power of 2
	
	int power(int a,int n) {
		if(n==0) {
			return 1;
		}
		return a*power(a,n-1);
	}

}
