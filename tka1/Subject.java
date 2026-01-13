package com.tka1;

import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject");
		String []Subject=new String[5];
//		Subject[0]="ComputerScience";
//		Subject[1]="English";
//		Subject[2]="History";
//		Subject[3]="Biology";
//		Subject[4]="Physics";
		for(int i=0;i<Subject.length;i++) {
//			System.out.println(Subject[i]);
			Subject[i]=sc.nextLine();
		}
		
		System.err.println("*****************************************");
		for(int i=0;i<Subject.length;i++) {
			System.out.println(Subject[i]);
		}
		
		
		
		
		
	}

}
