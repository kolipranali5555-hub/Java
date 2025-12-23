package com.Vehicle;
//Q6
public  abstract class Bank {

	 String bankName;
	 double accBalance;

 Bank(String bankName,double accBalance) {
	this.bankName=bankName;
	this.accBalance=accBalance;
 }
	 public abstract  void withdraw(double amount);//abstract
	 
	 void checkBalalance() {
		System.out.println("Your current balance is:");

}
	 

 

}
