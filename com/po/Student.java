package com.po;

public class Student {
	int studID;
	String name;
	Course c;
	
	final double REGESTRATION_FEE=1000;
	public Student(int studID, String name, Course c) {
		super();
		this.studID = studID;
		this.name = name;
		this.c = c;
	}
	
	void viewDetails() {
		System.out.println("StudentName "+name);
		
	System.out.println("studentID " +studID);
	System.out.println("Course Name "+course.CourseName);
	System.out.println();
	 
	
	}
	
	
	
	
	
	
	

}
