package com.overriding;
//Q6
public class Studentlab extends Library {
	String labName;
	String labrarianName;
	String location;
	int totalBooks;
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		this.labName=labName;
		this.labrarianName=labrarianName;
		this.location=location;
		this.totalBooks=totalBooks;
		
	}
		
	public String getLabName() {
		return labName;
	}

	public String getLabrarianName() {
		return labrarianName;
	}

	public String getLocation() {
		return location;
	}

	public int getTotalBooks() {
		return totalBooks;
		
			
		}
	}


