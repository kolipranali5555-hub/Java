package com.inheritancePractice;

public class PublicLibrary extends Library{

	PublicLibrary(){
		super("Vivekanand", 5000, 100);
	}
	void accessNewsPaper() {
		System.out.println("public is reading newspaper");
	}

}
