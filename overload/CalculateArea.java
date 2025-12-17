package com.overload;
//Q3
public class CalculateArea {
	void area(double pi, double radius1, double radius2) {
		System.out.println("Area of Circle: "+ pi*radius1*radius2);
		
	}
	void area(int length1,int length2) {
		System.out.println("Area Of REctangle: "+length1*length2);
	}

	public static void main(String[] args) {
		CalculateArea ca=new CalculateArea();
		ca.area(3.14, 5, 7);
		ca.area(6, 9);
	}
}
