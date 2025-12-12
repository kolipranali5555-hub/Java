package com.inheritancePractice;

public class OnlinePayment {

	String tranctionId;
	String bankName;
	
	
	public OnlinePayment(String tranctionId,String bankName) {
		this.bankName=bankName;
		this.tranctionId=tranctionId;
	}
	void  makePayment()
	{
		System.out.println("Payment is being processed");
		System.out.println("Tranctioid"+"transactionId");
		System.out.println("BankName"+bankName);
		
	}

}
