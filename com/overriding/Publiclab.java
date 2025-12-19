package com.overriding;
//Q6
import java.util.Scanner;

public class Publiclab  extends Library{
	String labName;
	String labrarianName;
	String location;
	int totalBooks;
	
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
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


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter library Name");
		sc.nextLine();
		System.out.println("Enter Librarrian Name");
		sc.nextLine();
		System.out.println("Enter location");
		sc.nextLine();
		System.out.println("Enter totalNumber of Books");	
		sc.nextInt();
		
	}

}
