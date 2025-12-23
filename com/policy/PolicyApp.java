package com.policy;
//Q3
public class PolicyApp {
	public static void main(String[] args) {
		System.err.println("LifeInsurance....");
		InsurancePolicy  
		i=new LifeInsurance();
		i.calculatePremium();
		i.coverageDetails();
		i.PolicyDetails();
		
		System.err.println("***************************");
		System.err.println("Vehicle...");
		
		i=new VehicleInsurance();
		i.calculatePremium();
		i.coverageDetails();
		i.PolicyDetails();
		
	}

}
