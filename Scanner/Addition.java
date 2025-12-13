package com.Scanner;
//Q1
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number");
		int a=sc.nextInt();
		
		System.out.println("Enter a second Number");
		int b=sc.nextInt();
		int c=a+b;
		
		System.out.println("Addition is: "+c);
		
	}

}
