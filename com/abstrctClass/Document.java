package com.abstrctClass;

public abstract  class Document {
	
	//Abstract Methods
	public abstract void openDocument();
	public abstract void readContent();
	
	//Non abstract method
	void FileName() {
		System.out.println("File Name:Resume");
	}

}
