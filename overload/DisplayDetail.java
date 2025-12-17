package com.overload;
//Q12
public class DisplayDetail {
	void details(String name) {
		System.out.println(" Name:" + name);
	}

	void details(String name, int age) {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}

	public static void main(String[] args) {
		DisplayDetail d = new DisplayDetail();
		d.details("Pranali");
		d.details("Pranali", 20);

	}

}
