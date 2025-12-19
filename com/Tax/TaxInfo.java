package com.Tax;

public class TaxInfo {
	public static void main(String[] args) {
	Tax t;
	t=new GST();
	t.taxType();
	t.calculateTax();
	
	
	t=new IncomeTax();
	t.taxType();
	t.calculateTax();
	

}
}
