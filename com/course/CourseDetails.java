package com.course;

public class CourseDetails {
	public static void main(String[] args) {
	Course c;
	c=new OnlineCourse();
	c.courseType();
	c.duration();
	c.fees();
	
	c=new ClassroomCourse();
	c.courseType();
	c.duration();
	c.fees();
	
	

}
}
