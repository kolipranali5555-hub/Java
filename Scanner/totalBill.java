package com.Scanner;

import java.util.Scanner;

public class totalBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Price");
		int price = sc.nextInt();
		System.out.println("Enter Quantity Of Product");
		int quantity = sc.nextInt();
		int totalBill = price * quantity;
		System.out.println("TotalBill=" + totalBill);
	}

}
