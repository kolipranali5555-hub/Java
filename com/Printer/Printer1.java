package com.Printer;
//Q7
public class Printer1 {
	public static void main(String[] args) {
		Printer p;
		p=new LaserPrinter();
		p.print();
		
		p=new InkJetPrinter();
		p.print();
	}

}
