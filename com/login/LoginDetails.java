package com.login;
//Q2
public class LoginDetails {
	public static void main(String[] args) {
		//Refernce Creation
		System.err.println("OTP...!!");
		OTPLogin ol;
		ol=new OTPLogin();
		ol.authenticate();
		ol.logout();
		System.out.println("********************** ");
		
		System.err.println("GOOGLElOGIN..!!");
		GoogleLogin g;
		g=new GoogleLogin();
		g.authenticate();
		g.logout();
		System.out.println(" ***************");
		
		System.err.println("PasswordLogin..!!");
		PasswordLogin p;
		p=new PasswordLogin();
		p.authenticate();
		p.logout();
		
	}

}
