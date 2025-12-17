package com.overload;
//Q6
public class Demo {
	 void show(int age, String name){ 
		 
		 System.out.println(age+" "+name); 
		
	}
	 void show(String name, int age) {
		 System.out.println(name+" " +age);}
	 
	 
	 public static void main(String[] args) {
		 Demo d=new Demo();
		 d.show(20, "pranali");
		 d.show("aarohi", 19);
		
	}
	
}
	 


