package com.overridingday2;

public class Phonepe extends Payment {
	@Override
	public void reward() {
		System.out.println("The payment cashback is 700rs from Phonepe");
	}

	@Override
	public void checkBalance() {
		System.out.println("The balance is rs100000");
	}

}
