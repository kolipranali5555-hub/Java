package com.overridingday2;

public class RideDetails {
	public static void main(String[] args) {
		Ride r;
		r=new MiniRide();
		r.calculateFare();
		
		r=new SedanRide();
		r.calculateFare();
		
		r=new Autoride();
		r.calculateFare();
		
		
	}
	

}
