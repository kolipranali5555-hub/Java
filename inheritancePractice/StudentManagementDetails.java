package com.inheritancePractice;

public class StudentManagementDetails {
	public static void main(String[] args) {
		System.err.println("Student Management Details....!!!");
		TechnicalStudent t= new TechnicalStudent();
		t.showDetails();
		t.attendclass();
		System.err.println("***************************************************");
		
		NonTechStudent nt=new NonTechStudent();
		nt.showDetails();
		nt.submitAssignment();
	}

	

	

}
