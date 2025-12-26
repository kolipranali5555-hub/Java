package com.pogoclass;
//Q1
public class Student {
	private String name;
	private int age;
	private String dOB;

	public Student() {

	}

	public Student(String name, int age, String dOB) {
		super();
		this.name = name;
		this.age = age;
		this.dOB = dOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDOB() {
		return dOB;
	}

	public void setDOB(String dOB) {
		this.dOB = dOB;
	}

}
