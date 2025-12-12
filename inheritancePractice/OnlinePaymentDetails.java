package com.inheritancePractice;

public class OnlinePaymentDetails {

	public static void main(String[] args) {
		System.err.println("OnlinePayment Details...!!!");
		Googlepay g=new Googlepay();
		g.makePayment();
		g.googlepay();
		
		
		System.out.println();
		PhonePe p=new PhonePe();
		p.makePayment();
		p.phonepe();
		
	}

}
