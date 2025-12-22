package com.pay;

public class UpiPayment extends BankPayment {
	
	String UpiID;
	//construstor,super
	UpiPayment(String bankName, String UpiID){
		super(bankName);
		this.UpiID=UpiID;
	}
	public void makepayment(double amount) {//override interface method
		System.out.println("making payment"   + amount + " using    UpiID  " +   UpiID  );
	}
	//overriding abstract method
	void paymentType() {
		System.out.println("type:"+"UPI");
	}
}
