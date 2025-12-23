package com.aplliance;

public abstract class Appliance {
	public abstract void consumePower();
	public abstract void performOperation();
	
	void PowerON() {
		System.out.println("Appliance poer ON");
	}

}
