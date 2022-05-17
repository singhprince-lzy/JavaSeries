package prince;
class ptest implements Runnable{
	Thread thrd;
	int count;
	
	static boolean stop =false;
	static String currentname;
	
	ptest(String name){
		thrd=new Thread(this,name);
		count=0;
		currentname=name;
	}
	synchronized public void run() {
		System.out.println(thrd.getName()+" started");
		do {
			count++;
			
			if(currentname.compareTo(thrd.getName())!=0) {
				currentname=thrd.getName();
				System.out.println("in "+currentname);
			}
		}while(stop==false  && count<100);
		stop=true;
		
		System.out.println(thrd.getName()+" terminating");
	}
}

public class priority {

	public static void main(String[] args) {
		ptest p1=new ptest("High priority");
		ptest p2=new ptest("Low priority");
		ptest p3=new ptest("Normal priority 1");
		ptest p4=new ptest("Normal priority 2");
		ptest p5=new ptest("Normal priority 3");
		
		p1.thrd.setPriority(Thread.NORM_PRIORITY+2);
		p2.thrd.setPriority(Thread.NORM_PRIORITY-1);
		
		p1.thrd.start();
		p2.thrd.start();
		p3.thrd.start();
		p4.thrd.start();
		p5.thrd.start();
		
		try {
			p1.thrd.join();
			p2.thrd.join();
			p3.thrd.join();
			p4.thrd.join();
			p5.thrd.join();
		}catch(InterruptedException e)
		{
			System.out.println("main thread interrupted");
		}
		System.out.println("High priority thread counted "+p1.count);
		System.out.println("Low priority thread counted "+p2.count);
		System.out.println("Normal 1 priority thread counted "+p3.count);
		System.out.println("Normal 2 priority thread counted "+p4.count);
		System.out.println("Normal 3 priority thread counted "+p5.count);

	}

}
