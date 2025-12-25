package com.access;
//abstract Class
public  abstract class Person {
	public String name;
	
	Person(String name){
		this.name=name;
		
	}
	public  void showName() {
		System.out.println("Name"+name);
	}
	 public abstract void role();
}


