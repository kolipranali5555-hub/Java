package com.Ride;

public class BikeRide implements Ride {
	@Override
	public void bookRide() {
		System.out.println("Bike Ride is booked");
	}@Override
	public void calculateFare() {
	System.out.println("BikeRide fare is calculated");
		
	}

}
