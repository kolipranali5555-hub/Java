package com.day4;

public class Array3D {
	public static void main(String[] args) {
		int[][][] numbers = { { { 10, 29, 33 }, { 45, 60, 98 }, { 78, 54, 31 } } };
		// Q1 print all elements
//		for (int i = 0; i < numbers.length; i++) {// block
////			System.out.println(numbers[i].length);
//			for (int j = 0; j < numbers[i].length; j++) {// row
////				System.out.println(numbers[i][j].length);
//				for (int k = 0; k < numbers[i][j].length; k++) {// column
//					System.out.print(numbers[i][j][k] + " ");
//
//				}
//				System.out.println();
//				
//			}
//		}
		// Q2.Maximum Number
//		int max=numbers[0][0][0];
//		for (int i = 0; i < numbers.length; i++) {// block
//	//System.out.println(numbers[i].length);
//			for (int j = 0; j < numbers[i].length; j++) {// row
//		//	System.out.println(numbers[i][j].length);
//				for (int k = 0; k < numbers[i][j].length; k++) {// column
//					if(numbers[i][j][k]>max) {
//						max=numbers[i][j][k];
//					}
//				}
//					//System.out.print("maximum Number " + max);
//					}
//			System.out.print("maximum Number " + max);

		// Q3 Minimum Number
//		int min=numbers[0][0][0];
//		for (int i = 0; i < numbers.length; i++) {// block
//	//System.out.println(numbers[i].length);
//			for (int j = 0; j < numbers[i].length; j++) {// row
//		//	System.out.println(numbers[i][j].length);
//				for (int k = 0; k < numbers[i][j].length; k++) {// column
//					if(numbers[i][j][k]<min) {
//						min=numbers[i][j][k];
//					}
//				}
//					
//					}
//			System.out.print("minimum Number " + min);

		// Q4 Sum of all elements
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {// block
//		//	System.out.println(numbers[i].length);
//			for (int j = 0; j < numbers[i].length; j++) {// row
//			//	System.out.println(numbers[i][j].length);
//				for (int k = 0; k < numbers[i][j].length; k++) {// column
//					sum = sum + numbers[i][j][k];
//				}
//			}
//		}
//		System.out.println("Sum of all elements are " + sum);
		//Q5 Odd number
		System.err.println("odd numbers are:");
		int odd=0;
		for (int i = 0; i < numbers.length; i++) {// block
		//	System.out.println(numbers[i].length);
			for (int j = 0; j < numbers[i].length; j++) {// row
			//	System.out.println(numbers[i][j].length);
				for (int k = 0; k < numbers[i][j].length; k++) {// column
					if(numbers[i][j][k]%2==1) {
						System.out.println(numbers[i][j][k] + " ");
					}
				}
			}
		//	System.out.println("odd numbers are "+odd);
		}
		
		
		
		
	}
	
}
