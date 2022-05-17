package prince;

public class ioex {
	static int n;
	public static char getm() throws java.io.IOException{
		System.out.println("Enter any int number ");
		 n=System.in.read();
		 return (char )n;
	}

	public ioex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		char ch = 0;
		// TODO Auto-generated method stub
		try {
			ch=getm();
		}catch(java.io.IOException e) {
			System.out.println("IoException occured");
		}
		System.out.println("You entered the value: "+ ch );

	}

}
