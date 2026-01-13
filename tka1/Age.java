package com.tka1;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter age");
		int[] age = new int[5];
//		age[0]=20;
//		age[1]=22;
//		age[2]=23;
//		age[3]=26;
//		age[4]=28;
		for (int i = 0; i < age.length; i++) {
//			System.out.println(age[i]);
			age[i] = sc.nextInt();

		}
		System.err.println("***********************");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

	}
}
