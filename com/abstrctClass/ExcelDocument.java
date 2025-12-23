package com.abstrctClass;

public class ExcelDocument extends Document{

	@Override
	public void openDocument() {
		System.out.println("Open the sheets");
		
	}

	@Override
	public void readContent() {
		System.out.println("Read the rows & columns content");
		
	}

}
