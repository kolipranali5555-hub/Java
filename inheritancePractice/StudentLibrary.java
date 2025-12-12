package com.inheritancePractice;

public class StudentLibrary extends Library{

	

	StudentLibrary(){
		super("Shivaji", 10000, 250);
		
	}
	void study() {
		System.out.println("Student is studying in room");
	}

}
