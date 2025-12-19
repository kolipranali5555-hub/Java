package com.customer;

public class CorporateCustomer  extends Customer{
	
	@Override
	public void getDiscount() {
		System.out.println("Get 10% discount for Corporate");
	}
	@Override
	public void getDiliveryTime() {
		System.out.println("Dilivery time: shecduled Dilivery");
	}

}
