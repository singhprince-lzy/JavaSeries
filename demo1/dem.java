class first{
	int var1;
	public void get(int m) {
		var1=m;
	}
	void show() {
		System.out.println("The value of the var1 in the class first="+ var1);
	}
}
public class dem extends first{
	void show() {
		System.out.print("This is in class dem");
		
	}
	
	
	public static void main(String[] args) {
		dem obj1=new dem();
		obj1.get(20);
		obj1.show();
		
		

	}

}
