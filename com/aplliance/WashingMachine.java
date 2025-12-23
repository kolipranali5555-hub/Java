package com.aplliance;

public class WashingMachine extends Appliance {

	@Override
	public void consumePower() {
		System.out.println("Washing machine consume medium power ");

	}

	@Override
	public void performOperation() {
		System.out.println("Washing machine for wash clothes..");

	}

}
