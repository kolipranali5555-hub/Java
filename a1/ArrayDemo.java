package com.a1;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[5];
		System.err.println("Enter any five numbers ");
		for (int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are ");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
	}
	

}
