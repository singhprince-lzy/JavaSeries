package lambdaExp;

@FunctionalInterface
interface Addable{
	int add(int a,int b);
	
}

public class LamdaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Addable a1= (a,b)->10+20;
		
		System.out.println(a1.add(10,20));

	}

}
