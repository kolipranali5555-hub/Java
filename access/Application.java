package com.access;

public class Application {
	public static void main(String[] args) {
		Student s=new Student("Pranali");
		s.showName();
		s.role();
		s.followAttendence();
		
		
		
		Teacher t=new Teacher("Sachin Sir",50000);
		t.showName();
		t.role();
		t.salary();
		t.duty();
		t.followAttendence();
		t.administrativeRules();
		
		
		
	}
	

}
