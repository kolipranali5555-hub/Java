package com.ATM;
//Q4
public class ATMAPP {
	public static void main(String[] args) {
		System.err.println("SBI ...!!!");
		SBIATM s;
		s=new SBIATM();
		s.insertcard();
		s.withdraw();
		s.checkBalance();
		System.err.println("*************");
		
		System.err.println("HDFC....!!!");
		HDFCATM h;
		h=new HDFCATM();
		h.insertcard();
		h.withdraw();
		h.checkBalance();
		System.out.println("****************");
		
		System.err.println("BOI...!!!");
		BOMATM b;
		b=new BOMATM();
		b.insertcard();
		b.withdraw();
		b.checkBalance();
		
	}

}
