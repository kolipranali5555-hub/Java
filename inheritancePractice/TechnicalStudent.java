package com.inheritancePractice;

public class TechnicalStudent extends SchoolManagement {
	TechnicalStudent(){
		super("Pranali", 205, 20, "javafullStack", 980);

	}
	void attendclass() {
		System.out.println("Pranali" +"is attending the class");
		
	}
}
