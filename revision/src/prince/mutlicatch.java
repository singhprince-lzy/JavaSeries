package prince;

public class mutlicatch {

	public mutlicatch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
		try {
			
				if(i%2==0)
					throw new  ArrayIndexOutOfBoundsException();
				else
					throw new ArithmeticException() ;
			}
			
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
			if(e.getClass().getName()=="java.lang.ArithmeticException")
				System.out.println("Arithmetic exception");
			else
				System.out.println("Index exception");
				
		}

	}}

}
