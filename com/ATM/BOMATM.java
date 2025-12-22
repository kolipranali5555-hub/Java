package com.ATM;

public class BOMATM implements ATM {
	@Override
	public void insertcard() {
		System.out.println("Card inserted in BOI");
	}
	@Override
	public void withdraw() {
		System.out.println("Cash withdrawn from BOI");
	}
	@Override
	public void checkBalance() {
		System.out.println("checking balance in BOI Bank");
	}

}
