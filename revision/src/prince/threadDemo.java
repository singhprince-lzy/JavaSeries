package prince;
class mythrd implements Runnable{
	String thrd;
	mythrd(String str){
		thrd=str;
	}
	
	public void run() {
		System.out.println(thrd+" Starting");
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(400);
				System.out.println("in "+thrd+" count is "+i);
				
			}
		}catch(InterruptedException e) {
			System.out.println(thrd+" interrupted");
		}
		System.out.println(thrd+" terminating");
	}
}

public class threadDemo {

	public threadDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started");
		mythrd mt1= new mythrd("child #1");
		mythrd mt2= new mythrd("child #2");
		mythrd mt3= new mythrd("child #3");
		mythrd mt4= new mythrd("child #4");
		Thread nt1= new Thread(mt1);
		Thread nt2= new Thread(mt2);
		Thread nt3= new Thread(mt3);
		Thread nt4= new Thread(mt4);
		//setting priority
		nt1.setPriority(4);
		nt2.setPriority(2);
		nt3.setPriority(3);
		nt4.setPriority(1);
		//getting priority
		System.out.println(nt1.getPriority());
		System.out.println(nt2.getPriority());
		System.out.println(nt3.getPriority());
		System.out.println(nt4.getPriority());
		//Thread nt5= new Thread(mt1);
		nt1.start();
		nt2.start();
		nt3.start();
		nt4.start();
		//nt.run();//if we will use run() method inside the main the  it will not concurrent execution.
		try {
			for(int i=0;i<50;i++) {
				System.out.print(".");
				Thread.sleep(100);
				
			}
		}catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		
		System.out.println("Main thread terminated");

	}

}
