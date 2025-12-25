package com.access;
//abstract  Class
public  abstract class Staff extends Person {
	protected double salary;
	Staff(String name, double salary){
		super(name);
		this.salary=salary;
	}
	public void salary() {
		System.out.println("salary"+salary);
	}
	public abstract void duty();

}
