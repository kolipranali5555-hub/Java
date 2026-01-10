package com.Practice;

//Q2
public class MainAge {
	public static void main(String[] args) {
		int age = 15;
		try {
			if (age < 18) {
				throw new InvalidAgeException("Age is not valid.. must be above 18 !!!");
			} else {
				System.out.println("Age is valid...");
			}
		} catch (InvalidAgeException e) {
			System.err.println("Exception :");
			System.out.println(e.getMessage());
		}
	}
}
