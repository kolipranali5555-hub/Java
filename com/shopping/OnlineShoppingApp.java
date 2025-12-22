package com.shopping;

public class OnlineShoppingApp {
	public static void main(String[] args) {
		Shopping s;
		s=new AmazonOrder();
		s.OrderProcess();
		
		s=new FlipkartOrder();
		s.OrderProcess();
	}

}
