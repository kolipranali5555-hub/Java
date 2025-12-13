package com.Scanner;

import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st String");
		String s=sc.nextLine();
		System.out.println("Enter a 2nd String");
		String  s1=sc.nextLine();
		 String Concatation= s + s1;
		 System.out.println("Concatenated String:"+ Concatation);

	}

}
