package com.Tax;

public class GST extends Tax {
	@Override
	public void taxType() {
		System.out.println("This is goods and service Tax");
	}

	@Override
	public void calculateTax() {
		System.out.println("GST tax is calculating");
	}
}
