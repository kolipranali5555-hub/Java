package com.static1;
//Q1
public class Student {
	static  String collegeName="Zeal College";
	int id;
	String name;
	
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println("ID ="+id);
		System.out.println("Name ="+name);
		System.out.println("College Name ="+collegeName);
	}
	
	

}
