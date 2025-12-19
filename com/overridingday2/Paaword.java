package com.overridingday2;

public class Paaword extends Authentication {
	@Override
	public void authennticating() {
		System.out.println("authenticating user using password");
	}

}
