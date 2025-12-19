package com.overload;
//Q7
public class Student {
	void name(String name) {
		System.out.println("name:"  );
		System.out.println(name);

	}

	void id( String name, int ID) {
		System.out.println("ID");
	
		System.out.println(ID);
	}

	public static void main(String[] args) {
		Student s = new Student();
	s.name("Pranali");
	s.id("Pranali", 101);
	}

}
