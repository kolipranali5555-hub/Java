package com.overload;
//Q4
public class PrintValue {
	void display(int x) {
		System.err.println("Integer Value");
		System.out.println(x);
		
	}
	void display( String name) {
		System.err.println("String Name");
		System.out.println("Pranali");
	}
	public static void main(String[] args) {
		PrintValue p=new PrintValue();
		p.display(55);
		p.display("Pranali");
	}

}
