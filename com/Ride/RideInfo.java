package com.Ride;
//Q5
public class RideInfo {
	public static void main(String[] args) {
		
	System.err.println("Bike...!!!");
	BikeRide b;
	b=new BikeRide();
	b.bookRide();
	b.calculateFare();
	System.out.println("   ");
	
	System.err.println("AutoRide...!!!");
	AutoRide a;
	a=new AutoRide();
	a.bookRide();
	a.calculateFare();
	}
}
