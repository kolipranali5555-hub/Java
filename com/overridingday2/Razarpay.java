package com.overridingday2;

public class Razarpay extends Payment {
	@Override
	public void reward() {
		System.out.println("The payment cashback is 300rs from Razarpay");
	}

	@Override
	public void checkBalance() {
		System.out.println("The balance is rs100000");
	}

}
