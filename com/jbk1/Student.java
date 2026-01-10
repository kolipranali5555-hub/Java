package com.jbk1;

public class Student {
	String name;
	int studID;
	Student(){
		name="Unknown";
		studID=101;
		
	}Student(int i){
		studID=105;
		name="Not Assigned..";
	}
	
	Student(int i,String n){
		studID=i;
		name=n;
		
	}
	void show() {
		System.out.println(studID+ "  "+name);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(101);
		Student s3=new Student(105);
		s1.show();
		s2.show();
	}
}
