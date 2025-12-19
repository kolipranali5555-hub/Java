package com.overriding;
//Q4
public class Developer extends Employee {
	@Override
	public void calculateSalary() {
		System.out.println("The salary calculation is 1500000");
		
	}
	public static void main(String[] args) {
		System.err.println("Employee");
		Employee emp=new Employee();
		emp.calculateSalary();
		System.err.println("Manager");
		Mananger m=new Mananger();
		m.calculateSalary();
		System.err.println("Developer");
		Developer d=new Developer();
		d.calculateSalary();
		
	}

}
