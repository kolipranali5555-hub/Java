package com.overridingday2;

public class OTP extends Authentication {
	@Override
	public void authennticating() {
		System.out.println("Authenticate using OTP");
	}
}
