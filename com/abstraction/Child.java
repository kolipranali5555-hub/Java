package com.abstraction;
//Q1
public class Child implements Father, Mother {
	@Override
	public void surname() {
		System.out.println("My Surname is Koli");
		
	}
	@Override
	public void cooking() {
		System.out.println("South Indian Dishes");
		
	}
	public static void main(String[] args) {
//		Child c;
//		c=new Child();
//		c.cooking();
//		c.surname();
		Child c=new Child();
		c.cooking();
		c.surname();
	}

}
