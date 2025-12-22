package com.login;

public class OTPLogin implements Login {
	@Override
	public void authenticate() {
		System.out.println("Login using OTP");
	}
	@Override
	public void logout() {
		System.out.println("Logout using OTP");
	}

}
