package prince;

class test{
	public int  arr3[]= {1,4,6,8,9};
	int arr5[]= {3,3,2,1,0};
	public void getm() throws ArithmeticException{
		for(int i=0;i<5;i++) {
			System.out.println("Result is "+arr3[i]/arr5[i]);
			
		}
		
	}
}

public class exhandl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= { 1,2,3,4,5 }; 
		int arr2[]= {0,1,0,2,0};
		int res;
		test ob=new test();
		
		
	
		try {
			ob.getm();
//			res=arr1[i]/arr2[i];
//			System.out.println(arr1[i]+"/"+arr2[i]+" is "+res);
			//System.out.println();
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("This is to end the connection");
		}
		
		
				
					

}}
