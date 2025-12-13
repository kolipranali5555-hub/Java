package com.Scanner;

import java.util.Scanner;

public class Square_Cube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		 int Square=num*num;
		int Cube=num*num*num;
		System.out.println("The square is:"+ Square);
		System.out.println("The Cube is:"+ Cube);
		
	}

}
