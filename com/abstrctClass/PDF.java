package com.abstrctClass;

public class PDF extends Document {

	@Override
	public void openDocument() {
		System.out.println("Open document using PDF");

	}

	@Override
	public void readContent() {
		System.out.println("Read the  fixed content");

	}

}
