package com.Pogo;

public class Student {
	String studName;
	int rollNo;
	int studAge;
	String collgeName;
	String city;

	public Student() {
		
	}

	public Student(String studName, int rollNo, int studAge, String collgeName, String city) {
		super();
		this.studName = studName;
		this.rollNo = rollNo;
		this.studAge = studAge;
		this.collgeName = collgeName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", rollNo=" + rollNo + ", studAge=" + studAge + ", collgeName="
				+ collgeName + ", city=" + city + ", getStudName()=" + getStudName() + ", getRollNo()=" + getRollNo()
				+ ", getStudAge()=" + getStudAge() + ", getCollgeName()=" + getCollgeName() + ", getCity()=" + getCity()
				+ "]";
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public String getCollgeName() {
		return collgeName;
	}

	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
