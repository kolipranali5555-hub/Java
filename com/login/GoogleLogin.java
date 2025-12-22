package com.login;

public class GoogleLogin implements Login {
	@Override
	public void authenticate() {
		System.out.println("Login using google Account");
	}
	@Override
	public void logout() {
		System.out.println("Logout from google account");
		
	}

}
