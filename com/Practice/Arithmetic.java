package com.Practice;
//Q1
public class Arithmetic {
	public static void main(String[] args) {

		try {
			System.out.println(2 / 2);
			System.out.println(6 / 2);
			System.out.println(45 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Diveded by zero not allowed");

		}
		System.out.println(8 / 4);

		System.out.println("the program flow continues..");

	}
}
