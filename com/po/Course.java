package com.po;

public  abstract class Course   {
	  String courseName;
	 String duration;
	public abstract void fees();
	
	
	public Course(String courseName, String duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	
	

}
