package com.overridingday2;

public class LaserPrinter extends Printer {
	@Override
	public void print() {
		System.out.println("LaserPrinter print the pages...");
	}

	@Override
	public void printDocuments() {
		System.out.println("The document printing using laser printer...!");
	}

}
