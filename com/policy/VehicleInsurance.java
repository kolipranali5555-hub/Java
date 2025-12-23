package com.policy;

public class VehicleInsurance extends InsurancePolicy {

	@Override
	public void calculatePremium() {
		System.out.println("It is based on vehicle type and value");
	
		
	}

	@Override
	public void coverageDetails() {
		System.out.println("It covers accident and vehicle damage...");
		
		
	}
	

}
