package com.hospital;

public class HospitalDetails {
	public static void main(String[] args) {
		System.out.println("HospitalServices..!!");
		System.out.println("OPD");
		Hosptial h;
		h=new OPD();
		h.treatment();
		h.generateBill();
		
		System.err.println("*************************");
		System.out.println("Emergenc Care");
		h=new EmergencyCare();
		h.treatment();
		h.generateBill();
		
	}

}
