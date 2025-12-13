package com.Scanner;

import java.util.Scanner;

public class TemperatureConvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Tempertaure in Celcious");
		double celcious=sc.nextDouble();
		double fahrenheit=(celcious*9/5)+32F;
		System.out.println("Tempertaure in Farhenheit"+fahrenheit+"F");

	}

}
