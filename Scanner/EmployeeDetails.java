package com.Scanner;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empName");
		String empName=sc.nextLine();
		System.out.println("Enter empId");
		int empId=sc.nextInt();
		System.out.println("Enter a empSalary");
		double Salary=sc.nextDouble();
		
		
		System.err.println("Employee Details.......!!!");
		
		
		
		System.err.println("Name");
		System.out.println(empName);
		System.err.println("ID" );
		System.out.println(empId);
		System.err.println("Salary"); 
		System.out.println("empSalary");
	}

}
