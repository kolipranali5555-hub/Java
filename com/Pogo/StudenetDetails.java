package com.Pogo;

import java.util.Scanner;

public class StudenetDetails {
	public static void main(String[] args) {
		System.err.println("StudentDetails");

		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter student Name: ");
		s.setStudName(sc.nextLine());

		System.out.println("Enter roll no");
		s.setRollNo(sc.nextInt());

		System.out.println("Enter student age");
		s.setStudAge(sc.nextInt());

		System.out.println("Enter collage Name");
		s.setCollgeName(sc.next());

		System.out.println("Enter city");
		s.setCity(sc.next());

		System.out.println("name =  " + s.getStudName());
		System.out.println("Roll No =  " + s.getRollNo());
		System.out.println("Age =  " + s.getStudAge());
		System.out.println("college =  " + s.getCollgeName());
		System.out.println("city =  " + s.getCity());

	}

}
