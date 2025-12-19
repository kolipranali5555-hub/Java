package com.customer;

public class RegularCustomer  extends Customer{
	@Override
	public void getDiscount() {
		System.out.println("Get discount 25% for regular");
	}
	@Override
	public void getDiliveryTime() {
		System.out.println("Dilivery time is:3-5Days");
	}
	
	

}
