package com.pay;

public abstract class BankPayment implements Payment {
	String bankName;
	
	//constructor
	BankPayment (String bankName){
		this.bankName=bankName;
	}
	void showBank() {//concreate method
		System.out.println("Name:"+bankName);
	}
	abstract void paymentType();//abstract method

}
