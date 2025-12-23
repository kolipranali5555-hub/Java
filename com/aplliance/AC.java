package com.aplliance;

public class AC extends Appliance {

	@Override
	public void consumePower() {
		System.out.println("AC consume high power");

	}

	@Override
	public void performOperation() {
		System.out.println("AC is the cooling the room");

	}

}
