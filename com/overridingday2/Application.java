package com.overridingday2;

public class Application {
	public static void main(String[] args) {
		Payment p;
		p=new Gpay();
		p.reward();
		p.checkBalance();
		
		p=new Phonepe();
		p.reward();
		p.checkBalance();
		
		p=new paytm();
		p.reward();
		p.checkBalance();
		
		p=new Razarpay();
		p.reward();
		p.checkBalance();
		
	}

}
