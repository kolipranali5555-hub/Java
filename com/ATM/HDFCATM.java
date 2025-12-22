package com.ATM;

public class HDFCATM implements ATM {
	@Override
	public void insertcard() {
		System.out.println("Card inserted in HDFC Bank");
	}
	@Override
	public void withdraw() {
		System.out.println("Cash withdrawn from HDFC");
	}
	@Override
	public void checkBalance() {
		System.out.println("Checking balnce in HDFC Bank");

}}
