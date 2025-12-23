package com.Vehicle;

public class VehicleApp {
	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		v.startEngine();
		v.fueltype();
		v.getSpeed();
		System.err.println("*************************");
		
		v=new Bike();
		v.startEngine();
		v.fueltype();
		v.getSpeed();
	}

}
