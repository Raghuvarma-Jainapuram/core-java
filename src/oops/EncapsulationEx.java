package oops;

public class EncapsulationEx {
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		EncapsulationEx e=new EncapsulationEx();
		e.setBalance(10000);
		System.out.println("My balance: " + e.getBalance());
	}

}
