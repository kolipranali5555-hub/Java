package com.access;
//Normal class
public class Student extends Person implements Academicrules  {
	Student (String name){
		super(name);
	}
	@Override
	public void followAttendence() {
		System.out.println("Atendence must maintain 75%");
		
	}
	@Override
	public void role() {
	System.out.println("Role:Student");
		
	}
	@Override
	public void academicRules() {
		System.out.println("follow academic rules");
		
	}
}
		

//	@Override
//	public void academicRules() {
//		System.out.println("Follow the rules  is mandetory");
//		
//	}
//
//	@Override
//	public void deptWork() {
//		System.out.println("department work");
//		
//	}
//	@Override
//	public void administrativeRules() {
//		System.out.println("Follow the rules");
//		
//	}
//	public static void main(String[] args) {
//		Student s=new Student();
//		s.administrativeRules();
//		s.academicRules();
//		s.deptName("Computer science");
//		s.deptWork();
		
//	}
//
//	@Override
//	public void deptName() {
//		
//		
//	}
//	
//	
//}



