package com.policy;

public class LifeInsurance  extends InsurancePolicy{

	@Override
	public void calculatePremium() {
		System.out.println("It is based on age and policy term");
		
	}

	@Override
	public void coverageDetails() {
		System.out.println("It provides finiacial security to family..!!!");
		
	}

}
