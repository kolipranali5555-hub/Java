package com.tka1;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of employees: ");
		int n = sc.nextInt();
		double[] salary = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter salary of employee");
			salary[i] = sc.nextDouble();
		}
		System.err.println("salaries of employees:");
		for (int i = 0; i < n; i++) {

			System.out.println(salary[i]);
		}
	}

}
