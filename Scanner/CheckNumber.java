package com.Scanner;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NUmber");
		int num1=sc.nextInt();
		
		if (num1>0) {
			System.out.println("The Number is Positive");
		}else if(num1<0) {
			System.out.println("The NUmber is Negative");
		}else{
			System.out.println("The number is zero");
			
		}
	}

}
