package com.payment;
//Q3
public class PaymentApplication {
	public static void main(String[] args) {
		//Object Creation
//		System.err.println("Gpay");
//		Gpay g = new Gpay();
//		g.makePayment();
//		System.out.println(" ");
//		
//		System.err.println("PhonePe");
//		PhonePe p = new PhonePe();
//		p.makePayment();
//		System.out.println(" ");
//		
//		System.err.println("Paytm");
//		Paytm p1 = new Paytm();
//		p1.makePayment();
		
		
		//Refernce Creation
		Gpay g;
		g = new Gpay();
		g.makePayment();

		PhonePe p;
		p = new PhonePe();
		p.makePayment();

		Paytm p1;
		p1 = new Paytm();
		p1.makePayment();

	}

}
