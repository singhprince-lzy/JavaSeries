package lab;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=10;i>=1;i--) {
			for(j=i;j<(2*i-1);j++) {
				System.out.print("*");
			}
			for(j=1;j<i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
