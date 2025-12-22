package com.ATM;

public class SBIATM  implements ATM{
	@Override
	public void insertcard() {
		System.out.println("card inserted in SBI");
	}
	@Override
	public void withdraw() {
		System.out.println("Cash withdrawn from SBI");
	}
	@Override
	public void checkBalance() {
		System.out.println("Checking balance from SBI");

}
	}
