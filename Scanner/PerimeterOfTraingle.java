package com.Scanner;

import java.util.Scanner;

public class PerimeterOfTraingle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first side x");
		double x=sc.nextDouble();
		System.out.println("Enter a second side y");
		double y=sc.nextDouble();
		System.out.println("Enter a third side z");
		double z=sc.nextDouble();
		double Perimeter=x+y+z;
		System.out.println("Permiter of Triangle= " + Perimeter+"cm");
		
	}

}
