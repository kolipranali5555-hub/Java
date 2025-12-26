package com.Pogo;
//Q1
public class Employee {//pojo class
	int empId;//fields
	String empName;
	String City;
	double Salary;
	
	
	public Employee() {//No args
		
	}
	public Employee(int empId,String empName,String city,double salary) {//args constructor
		this.empId=empId;
		this.empName=empName;
		this.City=city;
		this.Salary=salary;
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", City=" + City + ", Salary=" + Salary + "]";
//	}
	
	}


