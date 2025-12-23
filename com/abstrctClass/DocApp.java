package com.abstrctClass;
//Q1
public class DocApp {
	public static void main(String[] args) {
		System.err.println("Documents..!!");
		Document d;
		System.err.println("PDF");
		d = new PDF();
		d.openDocument();
		d.readContent();
		d.FileName();
		System.out.println("*****************************");
		System.out.println("WordDocument");
		d = new WordDocument();
		d.openDocument();
		d.readContent();
		d.FileName();
		System.out.println("******************************");

		System.out.println("ExcelDocument");
		d = new ExcelDocument();
		d.openDocument();
		d.readContent();
		d.FileName();
	}

}
