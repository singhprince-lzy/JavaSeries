package lab;
class threadx implements Runnable{
	String name;
	Thread t;
	threadx(String thrdname){
		 name=thrdname;
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
		
	}

	public void run() {
		try {
			for (int i=1;i<10;i++){
				System.out.println("Thread "+name+ " :"+i);
				Thread.sleep(400);
			}
			
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Exiting From Thread "+name);
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		threadx t1=new threadx("Prince");
		try {
				for (int i=1;i<10;i++){
					System.out.println("Thread main :"+i);
					Thread.sleep(100);
				}
				
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		
		System.out.println("Main Thread exitex.");
	}

}
