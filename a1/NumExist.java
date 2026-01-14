package com.a1;

public class NumExist {
	public static void main(String[] args) {
		int[] n = { 40, 50, 60, 70 };
		int num = 90;
		boolean isExist = false;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == num) {

				isExist = true;
				break;
			}
		}
		if (isExist) {
			System.out.println("Element exist in array");

		} else {
			System.out.println("Element not exist in array");
		}
	}

}
