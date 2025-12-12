package com.inheritancePractice;

public class EcommerceSystem {

	String adminName;
	int totalUsers;
	
	public EcommerceSystem(String adminName, int totalUsers) {
	this.adminName=adminName;
	this.totalUsers=totalUsers;
}
	
	void viewDetails() {
		System.out.println("adminName="+adminName);
		System.out.println("totalUsers="+totalUsers);
	}
}
