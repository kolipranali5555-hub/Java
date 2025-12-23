package com.Vehicle;

public class Axis extends Bank{
	Axis(String bankName,double Balance){
		super("Axis",800000.0);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("withdraw amount from Axis bank"+  20000);
	}
	
	
	

}
