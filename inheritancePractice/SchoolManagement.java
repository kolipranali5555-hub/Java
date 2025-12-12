package com.inheritancePractice;

public class SchoolManagement {

	String studentName;
	int StudentId;
	int age;
	String course;
	double Marks;
	
	
	public SchoolManagement(String studentName,int StudentId,int age,String course,double Marks) {
		this.studentName=studentName;
		this.StudentId=StudentId;
		this.age=age;
		this.course=course;
		this.Marks=Marks;
		
		
	}
	void showDetails() {
		System.out.println("StudenName:"+studentName);
		System.out.println("StudentId:"+StudentId);
		System.out.println("age:"+age);
		System.out.println("course:"+course);
		System.out.println("marks:"+Marks);
	}

}
