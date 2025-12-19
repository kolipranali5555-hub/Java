package com.overriding;
//Q3
public class Car extends Vehicle {
	@Override
	public void maxSpeed() {
		System.out.println("The maximum spped is 80km hr");
		super.maxSpeed();
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.maxSpeed();
		
		Car c=new Car();
		c.maxSpeed();
		
		Bike b=new Bike();
		b.maxSpeed();
	}
	

}
