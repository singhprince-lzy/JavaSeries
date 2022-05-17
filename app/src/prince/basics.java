package prince;

class one {
	int a,b,c;
	String name;
	public void setName(basics obj) {
		this.name=obj.name;
	}
	
	
}

public class basics {
	String name="Prince kumar singh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basics o= new basics();
		
		one obj=new one();
		
		System.out.println("The name is :"+ obj.name);
		
		

	}

}
