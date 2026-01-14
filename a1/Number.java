package com.a1;

public class Number {
	public static void main(String[] args) {
		int[] num = { 22, 34, 45, 56, 66, 77, 89 };
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}

//index start from 0
//		and length starts from 1

		// 1 reverse
//		for (int i = num.length - 1; i >= 0; i--) {
//			System.out.println(num[i]);
//		}

		// 2 Addition of all elements
//		int sum = 0;
//		for (int i = 0; i < num.length; i++) {
//			sum = sum + num[i];
//
//		}
//		System.out.println("total = " + sum);

//		System.out.println("*****************************");

		// 3Maximum element
//		int max=num[0];
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]>max) {
//				max=num[i];
//				System.out.println("Maximum num is="+max);
//			}
//		}
//		System.out.println("Maximum num is="+max);

		// 4 Minimum Number
//	int min=num[0];
//	for (int i = 0; i < num.length; i++) {
//		if(num[i]<min) {
//			min=num[i];
//
//	}
//	System.out.println("Minimum num is="+min);

		// 5 even Number
//	for(int i=0;i<num.length;i++) {
//		if(i%2==0) {
//			System.out.println(i);
		// 6 odd number
//		if(i%2==1) {
//			System.out.println(i);

		// 7 total number of elemnts
		System.out.println("Total number of elements " + num.length);
	}

}
