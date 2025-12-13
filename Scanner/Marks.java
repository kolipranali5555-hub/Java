package com.Scanner;
//Q6
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Marks1, Marks2, Marks3, Marks4, Marks5;
		int total;
		double percentage;

		System.out.println("Enter Marks Of 5 Subject");
		int Mark1 = sc.nextInt();
		int Mark2 = sc.nextInt();
		int Mark3 = sc.nextInt();
		int Mark4 = sc.nextInt();
		int Mark5 = sc.nextInt();

		total = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
		percentage = total / 5.0;

		System.out.println("Total Marks:" + total);
		System.out.println("Percentage:" + percentage);

	}

}
