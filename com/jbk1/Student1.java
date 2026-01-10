package com.jbk1;

public class Student1 {
	int id;
	String name;
	Address Address;
	public Student1(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		Address = address;
	}
	void show() {
		System.out.println(name+ "  "+name);
		System.out.println(id +" "+id);
		System.out.println(Address.city);
		System.out.println(Address.state);
	}
	

}
