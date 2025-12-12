package com.inheritancePractice;

public class Library {
	String LibraryName;
	int totalBooks;
	int totalMembers;
	
	
	public Library(String LibraryName,int totalBooksint,  int totalMembers) {
		this.LibraryName=LibraryName;
		this.totalBooks=totalBooks;
		this.totalMembers=totalMembers;
		
	}
	void labDetails() {
		System.out.println("LibraryName:"+LibraryName);
		System.out.println("totalBooks:"+"totalbooks");
		System.out.println("TotalMembers:"+"totalmembers");
	}


}
