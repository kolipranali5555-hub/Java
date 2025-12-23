package com.aplliance;

public class Fridge extends Appliance{

	@Override
	public void consumePower() {
		System.out.println("Fridge  consume low power");
	}

	@Override
	public void performOperation() {
		System.out.println("Fidge is keeping food cool");
		
	}

}
