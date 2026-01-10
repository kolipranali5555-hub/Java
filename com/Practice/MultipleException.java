package com.Practice;

public class MultipleException {
	public static void main(String[] args) {

		try {
			int a = 20;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Diveded by zero is not allowed..!!!");
		} catch (NullPointerException e1) {
			System.out.println("sorry...");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error...." + "Array index out of bounds..!!!");

		} catch (Exception e) {
			System.out.println("Some other exception occured.." + e);
		}
	}
}
