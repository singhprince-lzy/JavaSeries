package lab;
interface intOne{
	void run();
}

interface intTwo{
	void DontRun();
}

class Gym implements intOne , intTwo{
	public void run() {
		System.out.println("This is run method fron intOne and it says run.");
	}
	public void DontRun() {
		System.out.println("This is dontrun method of intTwo and it says not to run.");
		
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gym g1=new Gym();
		g1.run();
		g1.DontRun();

	}

}
