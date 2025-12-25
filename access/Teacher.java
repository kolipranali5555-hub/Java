package com.access;
//Normal Class
public  class Teacher extends Staff implements Academicrules, AdministrativeDetails {
	Teacher(String name,double salary){
		super(name,salary);
	}

	@Override
	public void duty() {
		System.out.println("Teaching students");
		
	}

	@Override
	public void role() {
		System.out.println("Role:Teacher");
	}
	@Override
	public void followAttendence() {
		System.out.println();
	}

	@Override
	public void administrativeRules() {
		System.out.println("Follow administrative rules");
		
	}

	@Override
	public void academicRules() {
		System.out.println("Must mandetory follow academic rules");
		
	}
}
	
	

//	@Override
//	public void personName() {
//		System.out.println("Sachin");
//		
//	}
//
//	@Override
//	public void personAge() {
//		System.out.println(27);
//		
//		
//	} 
//	public static void main(String[] args) {
//		Teacher t=new Teacher();
//		t.display();
//		t.personAge();
//		t.personName();
	

