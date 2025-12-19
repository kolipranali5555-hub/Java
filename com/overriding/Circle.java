package com.overriding;
//Q2
public class Circle extends Shape {
	@Override
	 public void area() {
		System.out.println("The area of circle is pi*r*r");
		super.area();
	}
	

	}
