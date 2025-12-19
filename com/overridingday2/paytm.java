package com.overridingday2;

public class paytm extends Payment {
	@Override
	public void reward() {
		System.out.println("The payment cashback is 100rs from paytm");
	}

	@Override
	public void checkBalance() {
		System.out.println("The balance is rs100000");
	}

}
