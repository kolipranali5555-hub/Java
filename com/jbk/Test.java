package com.jbk;

public class Test extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.run();
	}
	

}
