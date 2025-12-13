package com.Scanner;

import java.util.Scanner;

public class TimeConvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a time in Seconds");
		int seconds=sc.nextInt();
		int minutes=seconds/60;
		 int sec =seconds % 60;
		 System.out.println(minutes +"minutes "+ sec +"seconds");
		
		
		
	}

}
