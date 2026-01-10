package com.jbk;

public class Vote {
	public static void age(int age) throws Exception {
		if (age < 18) {
			throw new Exception("It is not eligible for voting...");
		} else {
			System.out.println("It is Eligible for Voting..!!!");
		}

	}

	public static void main(String[] args) {
		try {
			age(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
