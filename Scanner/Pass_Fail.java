package com.Scanner;

import java.util.Scanner;

public class Pass_Fail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Marks");
		float marks=sc.nextFloat();
		if(marks>35) {
			System.out.println("The Student is Pass..");
		}else {
			System.out.println("The student is Fail..");
		}
	}

}
