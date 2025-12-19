package com.Security;

public class Securityinfo {
	public static void main(String[] args) {
	Security s;
	s=new FaceSecurity();
	s.unlock();
	s.verify();
	
	s=new FingerPrint();
	s.unlock();
	s.verify();
	
	}
}
