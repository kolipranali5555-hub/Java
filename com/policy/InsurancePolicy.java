package com.policy;

public  abstract class InsurancePolicy {
public abstract void calculatePremium();
public abstract void coverageDetails();

//Concreate Method
void PolicyDetails() {
	System.out.println("Insurance policy details displayed..!!!");
}
}
