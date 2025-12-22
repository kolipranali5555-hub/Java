package com.pay;

public class PayApp {
	public static void main(String[] args) {
		BankPayment payment=new UpiPayment("BOI","pranali@upi");//polymorphism
		payment.showBank();//parent
		payment.paymentType();//child
		payment.makepayment(70000);//interface method
	}

}
