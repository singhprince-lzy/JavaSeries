package javatuts;

//This is the example of the single inheritance in java.

 class parent1{
	public int a;
	parent1(){
		a=0;
	}
	public int seta(int num) {
		a=num;
		return a;
	}
	public void showa() {
		System.out.println("Value of the a = "+a);
	}
}

public class lab1 extends parent1{
	
	public static int var1;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab1 lab= new lab1();
		var1=lab.seta(10);
		System.out.println("Value of the  var1 is: "+var1);
		lab.showa();

	}

}
