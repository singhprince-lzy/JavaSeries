package except;

import java.util.Scanner;

class DepositException extends Exception{
	public DepositException(String msg) {
		super(msg);
	}
}

public class Bank {
	
	public void Deposit(double amount) throws DepositException {
		if(amount>50000.00) {
			throw new DepositException("Over Salaried");
		}
		else if(amount>20000 && amount<50000) {
			throw new DepositException("Normal salaried");
		}
		else {
			throw new DepositException("Low salaried");
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the deposit Amount");
		double amount= sc.nextDouble();
		Bank b= new Bank();
		try {
			b.Deposit(amount);
		}
		catch(DepositException d) {
			System.out.println(d.getMessage());
		}

	}

}
