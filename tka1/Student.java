package com.tka1;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.err.println("Enter names");
		String[] student = new String[10];
//		System.err.println("Names..!!");
//		student[0] = "Pranali";
//		student[1] = "Prisha";
//		student[2] = "Payal";
//		student[3] = "Pragti";
//		student[4] = "Prem";
//		student[5] = "Pranil";
//		student[6] = "Apporva";
//		student[7] = "Amisha";
//		student[8] = "Avantika";
//		student[9] = "neha";

//		for (int i = 0; i < student.length; i++) {
//			System.out.println(student[i]);
//		}
		for(int i=0;i<student.length;i++) {
			student[i]=sc.nextLine();
			
		}
		System.out.println("*****************************************");
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}

	}

}
