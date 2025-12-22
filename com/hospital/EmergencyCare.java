package com.hospital;

public class EmergencyCare implements Hosptial{
	@Override
	public void treatment() {
		System.out.println("Emergency treatment");
		
	}
	@Override
	public void generateBill() {
		System.out.println("Bill generated for emergency ward");
	}
	
	

}
