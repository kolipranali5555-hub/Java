package com.tka;

import java.util.Scanner;

public class Price {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		int[] price = { 100, 140, 121, 135, 199 };
//		for(int i=0;i<price.length;i++) {
//			System.out.println(price[i]);
//		}
		int i = 0;
		System.err.println("Prices are");
		while (i < price.length) {
			System.out.println(price[i]);
			i++;
		}

	}

}
