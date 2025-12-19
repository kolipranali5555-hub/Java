package com.overridingday2;

public class InkjetPrinter extends Printer {
	@Override
	public void print() {
		System.out.println("The inkget printer prints the pages...");
	}

	@Override
	public void printDocuments() {
		System.out.println(" The Documents printing using InkJet Printer...!");
	}
}
