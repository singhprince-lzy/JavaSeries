package lab;

public class Lab8 {
	public String name;
	public double roll;
	public Lab8(String name,double roll) {
		this.name=name;
		
		this.roll=roll;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program for displaying this keyword");
		Lab8 ob=new Lab8("Prince",2818365);
		System.out.println("My name is "+ob.name+" and my roll is  "+ob.roll);

	}

}
