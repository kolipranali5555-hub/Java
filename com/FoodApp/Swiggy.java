package com.FoodApp;

public class Swiggy implements FoodDillivery {
	@Override
	public void placeOrder() {
		System.out.println("Order placed successfully..!!");
		
	}
	@Override
	public void prepareFood() {
	System.out.println("Preparing food swiggy");
	}@Override
	public void diliverFood() {
		System.out.println("Food dilivered  using swiggy..!!!");
	}

}
