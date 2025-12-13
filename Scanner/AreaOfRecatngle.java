package com.Scanner;
//Q7
import java.util.Scanner;

public class AreaOfRecatngle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length;
		int width;
		System.out.println("Enter length Of Rectangle");
		length=sc.nextInt();
		System.out.println("Enter Width Of Rectcangle");
		width=sc.nextInt();
		int Area=length*width;
		System.out.println("Area Of Recatngle:"+Area);
		
	}

}
