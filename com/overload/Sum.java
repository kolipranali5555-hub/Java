package com.overload;
//Q5
public class Sum {
	void sum( int a, int b) {
		System.err.println(" Sum of Integer Value");
		System.out.println(a+b);
		
	}
	void sum(float a, float b) {
		System.err.println(" Sum of Float Value");
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Sum s=new Sum();
		s.sum(5, 8);
		s.sum(34.6f, 78f);
	}

}
