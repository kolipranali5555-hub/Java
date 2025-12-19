package com.customer;

public class CustomerDetails {
	public static void main(String[] args) {
		Customer c;
		c=new RegularCustomer();
		c.getDiscount();
		c.getDiliveryTime();
		
		c=new Premium();
		c.getDiscount();
		c.getDiliveryTime();
		
		c=new CorporateCustomer();
		c.getDiscount();
		c.getDiliveryTime();
		
		
	}
	
	

}
