package com.overridingday2;

public class PrinterDetails {
	public static void main(String[] args) {
		Printer p;
		p = new LaserPrinter();
		p.print();
		p.printDocuments();

		p = new InkjetPrinter();
		p.print();
		p.printDocuments();
	}

}
