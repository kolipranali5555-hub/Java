package com.overriding;
//Q1
public class SBI extends Bank {
	@Override
	public void getInterest() {
		System.out.println("The rate of interset is 7%");
		super.getInterest();
	}	
public static void main(String[] args) {
	Bank b= new Bank();
	b.getInterest();
	
	SBI s=new SBI();
	s.getInterest();
	
	HDFC h=new HDFC();
	h.getInterest();
	
}

	
	

}
