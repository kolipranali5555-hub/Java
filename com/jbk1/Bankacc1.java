package com.jbk1;

public class Bankacc1 {
	public static void main(String[] args) {
		BankAccount b=new BankAccount(5000);
		b.deposit(500);
		b.withdraw(1000);
		System.out.println("Current balance "+b.getBalance());
	}

}
