package com.pogoclass;

import java.util.Scanner;

public class InfoStudent {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	Student s1=new Student();
	
	System.err.println("Student Information..");
	
	System.out.println("Enter Student Name");
	s1.setName(sc.nextLine());
	
	System.out.println("Enter student age");
	s1.setAge(sc.nextInt());
	
	System.out.println("Enter student DOB");
	s1.setDOB(sc.next());
	
	
	
	
	System.out.println("Student Name " + s1.getName());
	System.out.println("Student age  "+s1.getAge());
	System.out.println("Student DOB  "+s1.getDOB());
	
	}
}
