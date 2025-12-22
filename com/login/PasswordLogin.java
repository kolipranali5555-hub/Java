package com.login;

public class PasswordLogin implements Login{
	@Override
	public void authenticate() {
		System.out.println("Login using username and Password");
	}
	@Override
	public void logout() {
		System.out.println("Logout using password");
	}

}
