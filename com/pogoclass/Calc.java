package com.pogoclass;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Calculator c=new Calculator();
		System.out.println("Enter any two integers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		c.add(a,b);
		
		System.out.println("Enter any three numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		c.add(x, y, z);
		
		System.out.println("Enter any two doubles");
		double p=sc.nextDouble();
		double q=sc.nextDouble();
		c.add(p, q);
		
		
		
	}

}
