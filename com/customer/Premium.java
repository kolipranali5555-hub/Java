package com.customer;

public class Premium  extends Customer{
	
	@Override
	public void getDiscount() {
		System.out.println("Get 15% discount for Premium");
	}
	@Override
	public void getDiliveryTime() {
		System.out.println("Dilivery Time is :1-2 days");
	}
	

}
