package com.Security;

public class FingerPrint extends Security {
	@Override
	public void unlock() {
		System.out.println("unlock using Fingerprint security");
	}

	@Override
	public void verify() {
		System.out.println("Fingerprint Verified");
	}

}
