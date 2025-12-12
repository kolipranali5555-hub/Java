package com.inheritancePractice;

public class Amazon extends EcommerceSystem {
	Amazon(){
		super("Pradip", 5500);
		
	}
	void placeOrder() {
		System.out.println("order placed successfully");
	}

	
}
