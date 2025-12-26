package com.Pogo;

import java.util.Scanner;

public class CollageInfo {
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	College c=new College();
	
	System.err.println("College Details...!!");
	
	
	System.out.println("Enter  College Name");
	c.setCollegeName(sc.nextLine());
	System.out.println("Enter University");
	c.setUniversity(sc.nextLine());
	System.out.println("Enter total students");
	c.setTotalStudents(sc.nextInt());
	System.out.println("Enter total teachers");
	c.setTotalTeachers(sc.nextInt());
	System.out.println("is a Ladies room in college");
	c.setLadiesRoom(sc.nextBoolean());
	
	
	
	System.out.println("College Name " + c.getCollegeName());
	System.out.println("University " +c.getUniversity());
	System.out.println("Students " + c.getTotalStudents());
	System.out.println("Teachers "+c.getTotalTeachers());
	System.out.println("Ladies room " + c.isLadiesRoom() );
	
	
	

}
}
