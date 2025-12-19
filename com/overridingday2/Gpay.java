package com.overridingday2;

public class Gpay extends Payment {
	@Override
	public void reward() {
		System.out.println("The payment cashback is 500rs from Gpay");

	}

	@Override
	public void checkBalance() {
		System.out.println("The balance is rs100000");

	}

}
