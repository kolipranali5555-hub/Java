package com.overload;
//Q2
public class Multiplication {
	void multiply(int x, int y) {
		System.out.println("Multiplication:" + x*y);
	}
	void multiply(int x, int y, int z) {
		System.out.println("Multiplication: "+ x*y*z);
	}
	
	
	public static void main(String[] args) {
		Multiplication mul=new Multiplication();
		mul.multiply(9, 6);
		mul.multiply(3, 5, 7);
	}

}
