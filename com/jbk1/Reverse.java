package com.jbk1;

public class Reverse {
	public static void main(String[] args) {
		String s="Pranali";
		String rev= " ";
		int len=s.length();
		//System.out.println("Reversed String is:"+rev);
		while(len>0) {
			rev=rev+s.charAt(len-1);
			len--;
		}
		System.out.println("Reversed String is:"+rev);
		
	}

}
