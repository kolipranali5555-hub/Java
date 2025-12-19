package com.Tax;

public class IncomeTax extends Tax {
	@Override
	public void taxType() {
		System.out.println("This is Income Tax");
	}

	@Override
	public void calculateTax() {
		System.out.println("Income tax is calculating");
	}

}
