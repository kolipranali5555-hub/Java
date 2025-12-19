package com.overload;
//Q9
public class MainMethod {
	public static void main(String message) {
		System.out.println(" Main method");
	}

	public static void main(String name, int age) {
		System.out.println("name" + "  pranali");
		System.out.println("Age " +  20);
	}

	public static void main(String[] args) {
		MainMethod m = new MainMethod();
		m.main("Main method");
		m.main("Pranali", 20);

	}

}
