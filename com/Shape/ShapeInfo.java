package com.Shape;
//	Q4
public class ShapeInfo {
	//Reference creation
	public static void main(String[] args) {
		System.out.println("Circle...!!");
	Circle c;
	c=new Circle();
	c.area();
	c.perimeter();
	
	System.err.println("**********************************************");
	
	System.out.println("Rectangle...!!!");
	Rectangle r;
	r=new Rectangle();
	r.area();
	r.perimeter();
	
	//Object creation
	Circle c1=new Circle();
	c1.area();
	c1.perimeter();
	
	Rectangle r1=new Rectangle();
	r1.area();
	r1.perimeter();
	}
}
