package com.abstrctClass;

public class WordDocument extends Document {

	@Override
	public void openDocument() {
		System.out.println("Open document in Wordfile");

	}

	@Override
	public void readContent() {
		System.out.println("The content can be Editable");

	}

}
