package com.overload;
//Q8
public class Parameters {
	void print(int a) {
		System.out.println("one parameter:"+a);
	}
	void print(int a, int b) {
		System.out.println("Two parameters:"+a + "," +b);
	}
	public static void main(String[] args) {
		Parameters p=new Parameters();
		p.print(10);
		p.print(20, 30);
	}

	

}
