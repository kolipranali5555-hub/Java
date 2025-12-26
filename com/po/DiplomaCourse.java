package com.po;

public class DiplomaCourse extends Course {
	
	
	

	public DiplomaCourse(String courseName, String duration) {
		super(courseName, duration);
		
	}

	@Override
	public void fees() {
	System.out.println("Fees Standard..!!");
		
	}

}
