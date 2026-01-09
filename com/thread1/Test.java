package com.thread1;

public class Test {
	public static void main(String[] args) throws InterruptedException {

		MyClass mc = new MyClass();

		Thread t1 = new Thread(mc);
		t1.start();

//		// sleep
		// mc.start();
//		
//		// join
//		mc.join();
//		
		// current Thread
//		System.out.println("Current thread" + Thread.currentThread().getName());
//		
//		// GetName and setName
		// mc.setPriority(12);
		// mc.start();
//		
//		// IsAlive
		// System.out.println(mc.isAlive());
		// mc.start();
//		
		// yeild
		mc.start();

	}

}
