package com.po;

public class DegreeCourse extends Course{
	

	public DegreeCourse(String courseName, String duration) {
		super(courseName, duration);
		
	}

	@Override
	public void fees() {
			System.out.println("Fees custom..!!");
	}
	

}
