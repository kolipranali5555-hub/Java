package com.Ride;

public class AutoRide implements Ride{
	@Override
	public void bookRide() {
		System.out.println("AutoRide is booked");
	}@Override
	public void calculateFare() {
		System.out.println("AutoRide fare is calculated");
	}

}
