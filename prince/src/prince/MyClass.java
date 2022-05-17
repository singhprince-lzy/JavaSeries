class prince
{
	char name;
	int age;
	int std;
	
	void get_name()
	{
		System.out.print("Enter you name boy: ");
		System.in.read();
	}
	
}


public class MyClass {


	public static void Main(String[] args) {
		prince p1= new prince();
		p1.age=18;
		p1.name='p';
		p1.std=12;
		
		p1.get_name();
		
		System.out.println(p1.name);
		System.out.println("AGE="+p1.age);
		System.out.println(p1.std);
		
	}

}
