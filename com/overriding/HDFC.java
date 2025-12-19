package com.overriding;
//Q1
public class HDFC extends Bank {
	@Override
	public void getInterest() {
		System.out.println("the rate of interest of bank is 9%");
		super.getInterest();
	}

}
