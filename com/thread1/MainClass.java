package com.thread1;

public class MainClass {
	public static void main(String[] args) {
		Mythread1 mt = new Mythread1();

		mt.m1();
		Thread t = new Thread();
		t.start();

	}

}
