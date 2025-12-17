package com.overload;
//	Q14
public class Operation {
	double result(int a, int b) {
		return a + b;

	}

	double result(int x, int y,int z) {
		return x + y+z;
	}
	public static void main(String[] args) {
		Operation op =new Operation();
		System.out.println(op.result(89, 90));
		System.out.println(op.result(06, 07, 6));
		
	}

}
