package com.pogoclass;

public class Employee extends Person {
	public double salary;

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	void show() {
		System.out.println("Name " + name);
		System.out.println("Age" + age);
		System.out.println("Salary " + salary);
	}

}
