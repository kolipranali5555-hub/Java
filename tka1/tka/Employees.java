package com.tka;

import java.util.Scanner;

public class Employees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] Employee = { "Pranali", "Aarohi", "Aoorva", "Amisha" };
		int i = 0;
		System.err.println("Employees are");
		while (i < Employee.length) {
			System.out.println(Employee[i]);
			i++;
		}

	}
}
