package pali;

public class sys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 123454321;
		int revnum = 0,i,rem,original=num;
		while(num!=0) {
			rem=num%10;
			revnum = revnum *10+rem;
			num = num/ 10;
		}
		if(revnum==original)
			System.out.println("Palindrom");
		else 
			System.out.println("Not Palindrom");

	}

}
