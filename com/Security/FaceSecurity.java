package com.Security;

public class FaceSecurity extends Security {
	@Override
	public void unlock() {
		System.out.println("Unlock using faceSecurity");
	}

	@Override
	public void verify() {
		System.out.println("FaceSecurity verified");

	}
}
