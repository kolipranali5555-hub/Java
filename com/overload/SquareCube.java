package com.overload;
//Q10
public class SquareCube {

	void Calculate(int a, int b) {
		System.out.println("Square of Number is:"+a*b);
	}
	void calculate(int a, int b, int c) {
		System.out.println("Cube of the Number is:"+a*b*c);
	}
	
	public static void main(String[] args) {
		SquareCube sc=new SquareCube();
		sc.Calculate(7, 7);
		sc.calculate(2, 2, 2);
	}
}
