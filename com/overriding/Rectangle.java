package com.overriding;
//Q2
public class Rectangle extends Shape {
	@Override
	 public void area() {
		System.out.println("The area of rectangle is l*b");
		super.area();
	}
	public static void main(String[] args) {
		Shape s=new Shape();
		s.area();
		
		Rectangle r=new Rectangle();
		r.area();
		  
		
		Circle c=new Circle();
		c.area();
		
	}
	
	
	

		
	}


