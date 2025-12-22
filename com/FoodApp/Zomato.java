package com.FoodApp;

public class Zomato implements FoodDillivery {
	@Override
	public void placeOrder() {
	System.out.println("Order placed by zomato..!!");
		
	}
	@Override
	public void prepareFood() {
		System.out.println("preparing food..!!");
	}
	@Override
	public void diliverFood() {
		System.out.println("Food dilivered successfully using zomato");
		
	}

}
