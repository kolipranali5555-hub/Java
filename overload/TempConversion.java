package com.overload;
//Q13
public class TempConversion {
	double convert(double celcius) {
		return(celcius*9/5)+32;//celcius to F
		
	}
	double convert(int fahrenheit) {
		return(fahrenheit-32)*5.0/9;
	}
	public static void main(String[] args) {
		TempConversion t=new TempConversion();
		System.out.println("Celcius to Fahrenheit:" +t.convert(20.2));
		System.out.println("Fahrenheit to celcius:"+ t.convert(90 ));
		
	}
	

}
