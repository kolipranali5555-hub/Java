package com.pogoclass;

public class B extends A {
	
	B(){
		this(5);
		System.out.println("Non parameterized constructor of class B");
		
	}
	
	B(int a){
		super();
		System.out.println("Prameterized contructor of class B");
	}
	
	
	

}
