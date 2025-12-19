package com.course;

public class ClassroomCourse extends Course {
	@Override
	void courseType() {
		System.out.println("This is offline course..!");

	}

	@Override
	public void duration() {
		System.out.println("Course duration is:6 months");
	}

	@Override
	public void fees() {
		System.out.println("Course fee is 450000");
	}

}
