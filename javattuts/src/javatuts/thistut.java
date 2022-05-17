package javatuts;

class thisex{
	private int var;
	thisex(){
		var=0;
		System.out.println("inside the constructor of the class this ex");
	}
	void set(int var) {
		this.var=var;
	}
	void show() {
		System.out.println("The value of the var is "+this.var);
	}
}

public class thistut extends thisex{

	public thistut() {
		System.out.println("Inside the constructor of the thistuts");
		// TODO Auto-generated constructor stub
	}
    void show() {
    	System.out.println("Inside the show of the class thistuts.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thistut t=new thistut();
		t.show();
		
			

	}

}
