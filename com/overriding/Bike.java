package com.overriding;
//Q3
public class Bike extends Vehicle {
	@Override
	public void maxSpeed() {
		System.out.println("The maximum speed is 90kmhr");
		super.maxSpeed();
	}

}
