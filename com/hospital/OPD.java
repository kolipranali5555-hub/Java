package com.hospital;

public class OPD implements Hosptial {
	@Override
	public void treatment() {
		System.out.println("OPD visit open");
	}
	@Override
	public void generateBill() {
		System.out.println("OPD bill generate successfully..!!!");
	}


}
