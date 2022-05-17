package javatuts;

class parent11{

	public void showa() {
		System.out.println("Inside parent 1 ");
	}
}


class parent2 extends parent11{
	
	public void showb() {
		System.out.println("inside parent 2");
	}
}

class parent3 extends parent2{
	
	public void showc() {
		System.out.println("inside parent 3");
	}
}

public class lab1b extends parent3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 parent3 lab=new parent3();
	 lab.showc();
	 lab.showa();
	 lab.showb();
	 
	 
	 

	}

}
