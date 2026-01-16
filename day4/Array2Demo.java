package com.day4;

import java.util.Arrays;

public class Array2Demo {
	public static void main(String[] args) {
		
		//2D Array
//		int [][]num= {{10,20,40},{50,69,78}};
		
		    //column  0  1  2
//rows--- 0		     10 20 40
//	      1	         50 69 78
		
		//System.out.println(num.length);
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i].length);//rows
//			
//			for(int j=0;j<num[i].length;j++) {
//				System.out.print(num[i][j] + "  ");
//		
//	System.out.println(num.length);
//
//	}
//			System.out.println( );
//		
//		
//	}
		
		//by using inbulit method
//		System.out.println(Arrays.deepToString(num));
		
		
		//3D Array
	//length =1	
		int[][][] arr= {{{12,34,56},{67,89,90},{8,67,54}}};
//		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i].length);
			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j].length);
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k] + " ");
					
				}
				System.out.println( );
			}
		}
		}
		
		
		

}

