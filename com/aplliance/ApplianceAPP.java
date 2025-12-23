package com.aplliance;

//Q2
public class ApplianceAPP {
	public static void main(String[] args) {
		System.err.println("Appliance Details..!!!");
		Appliance a;
		a = new AC();
		a.consumePower();
		a.performOperation();
		a.PowerON();

		System.out.println("********---------------------******************");
		a = new Fridge();
		a.consumePower();
		a.performOperation();
		a.PowerON();

		System.out.println("*********************-------------**********************");
		a = new WashingMachine();
		a.consumePower();
		a.performOperation();
		a.PowerON();
	}

}
