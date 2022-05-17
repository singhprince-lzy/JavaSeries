package prince;
class thrd implements Runnable {
	Thread thrds;// a reference to the thread is stored in thrs.
	
	//constructing a new thread using this runnable and giving it a name.
	thrd(String name){
		thrds= new Thread(this,name);
	}
	//it is a factory method that create and start a thread.
	public static thrd createandstart(String name) {
		thrd threads= new thrd(name);
		threads.thrds.start();
		return threads;
		
	}
	public void run() {
	try {
		for(int i=0;i<10;i++) {
			System.out.println("in "+thrds.getName()+" count is "+i);
			Thread.sleep(400);
		}
	}catch(InterruptedException e) {
		System.out.println("child thread interrupted");
	}
	}
}




public class threaddemo2 {


	public static void main(String[] args) {
		System.out.println("main thread started here");
		thrd mt= thrd.createandstart("child 1");
		thrd mt1= thrd.createandstart("child 2");
		thrd mt2= thrd.createandstart("child 3");
		
		do {
			try {
				for(int i=0;i<50;i++) {
					System.out.print(".");
					Thread.sleep(100);
				}
			}catch(InterruptedException e) {
				System.out.println("main thread interrupted");
				
			}
			
		}while(mt.thrds.isAlive()||mt1.thrds.isAlive()||mt2.thrds.isAlive());
		
		System.out.println("Main thread terminated");
		
	}

}
