package com.FoodApp;
//Q8
public class FoodDiliveryApp {
	public static void main(String[] args) {
		System.out.println("Zomato...");
		FoodDillivery f;
		f=new Zomato();
		f.placeOrder();
		f.prepareFood();
		f.diliverFood();
		
		System.out.println("***************");
		
		System.out.println("Swiggy...");
		f=new Swiggy();
		f.placeOrder();
		f.prepareFood();
		f.diliverFood();
		
		
	}

}
