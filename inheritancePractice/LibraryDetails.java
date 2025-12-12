package com.inheritancePractice;

public class LibraryDetails  {

	public static void main(String[] args) {
		System.err.println("LibraryDetails....!!!");
		StudentLibrary s=new StudentLibrary();
		s.labDetails();
		s.study();
		System.err.println("****************************");
		
		PublicLibrary p =new PublicLibrary();
		p.labDetails();
		p.accessNewsPaper();
		
	}

}
