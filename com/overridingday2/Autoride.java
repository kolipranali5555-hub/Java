package com.overridingday2;

public class Autoride  extends Ride{
	@Override
	public void calculateFare() {
		System.out.println("AutoRide fare is 100 rs");
	}

}
