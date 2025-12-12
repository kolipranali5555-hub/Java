package com.inheritancePractice;

public class NonTechStudent extends SchoolManagement{
	NonTechStudent(){
		super("Aarohi", 206, 19, "python developer", 950);
	}
	
	void submitAssignment() {
		System.out.println("Aarohi"+ " has submitted assignment");
	}
	
	
}
