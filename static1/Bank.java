package com.static1;

public class Bank {
	static float rateOfInterest=7.5f;
	String bankName;
	int bankBranches;
	
	Bank(String bankName,int bankBranches){
		this.bankName=bankName;
		this.bankBranches=bankBranches;
		
	}
	static void roi() {
		System.out.println("The ROI is 7.5f");
	}
	 public void display() {
		 System.out.println("Bank Name "+bankName);
		
		 System.out.println("BankBranches"+bankBranches);
	 }
	
	
	

}
