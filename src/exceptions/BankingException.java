package exceptions;

import java.util.Scanner;

class MinBalanceException extends Exception{	
	String msg;
	public MinBalanceException(String msg)
	{
		//		super(msg);
		this.msg=msg;
	}
	@Override
	public String toString() {

		return msg;
	}
}
public class BankingException {
	static int balance=1500;

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amount=sc.nextInt();
		sc.close();
		try {
			int currentBalance = balance - amount;
			if(currentBalance<500){
				throw new MinBalanceException("Insufficient balance!\nMinimum balace in account is: 500\nYour current balance is: "+balance);
			}
			else{
				System.out.println("plz take money: "+amount);
				System.out.println("Available balance: " +currentBalance);
			}
		}
		catch(MinBalanceException e){
			System.out.println(e);
		}
	}

}