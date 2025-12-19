package com.course;

public class OnlineCourse extends Course {
	@Override
	void courseType() {
		System.out.println("This is Online Course");
	}
	@Override
	public void duration() {
	System.out.println("The course duration is:12 months");
	}
	@Override
	public void fees() {
		System.out.println("The fee is 80000");
	}

}
