package prince;
//this is for multilevel inheritance
class zero{
	private int po=19;
	String clnae="zero";
	zero( String  n){
		System.out.println("Constructor of zero printing "+n);
		System.out.println();
	}
}

//This is single inheritance 
class one extends zero{
	private int l=10;
	public String name;
	one(String nam,int p,String q){
		super(q);
		System.out.println("Constructor of the one excn");
		name=nam;
		l=p;
	}
	protected void something(int...i) {
		System.out.println("The value of the i is: "+i[0]+" and value of private l is "+l);
		System.out.println();
	}
}


public class inhert1 extends one {

	public inhert1(String name1,int l) {
		// TODO Auto-generated constructor stub
		//here is super is calling the base class constructor it shoud be first line of child 
		//constructor.
		
		super(name1,l,name1);
		super.something(1);
		System.out.println("Constructor of child excn");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inhert1 i =new inhert1("prince",10);
		System.out.println("Name of programmer is "+i.name);
		i.something(100);
		System.out.println("po and clname is "+ i.clnae);
		

	}

}
