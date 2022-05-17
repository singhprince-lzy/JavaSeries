package prince;
class e{
	 static public void m() {
		System.out.println("Prince kumar singh");
	}
}

class use implements Runnable{

   Thread thrds;// a reference to the thread is stored in thrs.
	
	//constructing a new thread using this runnable and giving it a name.
	use(String name){
		thrds= new Thread(this,name);
	}
	//it is a factory method that create and start a thread.
	public static thrd createandstart(String name) {
		thrd threads= new thrd(name);
		threads.thrds.start();
		return threads;
		
	}
	public void run() {
		System.out.println("in "+thrds.getName());
		for(int i=0;i<10;i++)
			e.m();
	}
}


public class syncthread {

	public static void main(String[] args) {

		System.out.println("main thread started here");
		thrd mt= thrd.createandstart("child 1");
		thrd mt1= thrd.createandstart("child 2");
		thrd mt2= thrd.createandstart("child 3");
		
		
		

	}

}
