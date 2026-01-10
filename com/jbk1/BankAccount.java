package com.jbk1;

public class BankAccount {
private String BankName;
private double balance;
public BankAccount(double Startingbalance) {
	balance=Startingbalance;
}
public void deposit(double amount) {
	if(amount>0) {
		balance=balance+amount;
		System.out.println("deposit:"+amount);
	}else {
		System.out.println("invalid amount..!");
	}
}
public void withdraw(double amount) {
	if(amount>0 && amount<=balance) {
		balance=balance-amount;
		System.out.println("withdraw "+amount);
	}
}
public double getBalance() {
	return balance;
}

	
}
	


