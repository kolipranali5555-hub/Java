package com.Practice;
//Q5
public class ArithmeticException {
	public static void main(String[] args) {
		try {
			int a=10/0;
			
		}catch(Exception e) {
			System.out.println(" this is a Catch block");
		}finally {
			int b=10/0;
		}
	}

}
