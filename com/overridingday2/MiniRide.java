package com.overridingday2;

public class MiniRide extends Ride {
	@Override
	public void calculateFare() {
		System.out.println("MiniRide Fare is 300rs..!");
	}

}
