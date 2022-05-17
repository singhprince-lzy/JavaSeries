package lab;

public class Lab7 {
	public int n;
	public Lab7() {
		System.out.println("Default constructor gives the vale of n ="+ n);
		// TODO Auto-generated constructor stub
	}
	public Lab7(int num) {
		System.out.println("Overloded constuctor value is ="+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab7 l1=new Lab7();
		l1=new Lab7(10);

	}

}
