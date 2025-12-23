package com.Vehicle;

public class BankApp {
	public static void main(String[] args) {
		Bank b;
		b=new SBI("SBI",800000);
		
		b.withdraw(50000);
		
		System.out.println("*************************************");
		b=new Axis("Axis",600000);
		b.withdraw(60000);
		
		
		
		
	
		
		
	}

}
