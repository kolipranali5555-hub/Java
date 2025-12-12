package com.inheritancePractice;

public class Product {

	public static void main(String[] args) {
		System.err.println("EcommerceApp Details...!!!");
		
		Amazon a=new Amazon();
		a.viewDetails();
		a.placeOrder();
		
		
		System.err.println("***************************************");
		FlipCart f =new FlipCart();
		f.viewDetails();
		f.searchProduct();
		
		
		
	}

}
