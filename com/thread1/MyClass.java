package com.thread1;

public class MyClass extends Thread {
//	@Override
//	public void run() {
//		System.out.println("Thread is running");
//	}

	// Sleep
	// @Override
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("Sleep method "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
	// }
	// }
	// }
	// join
//	@Override
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			System.out.println(Thread.currentThread().getName());
//		}

	// setPriority and getPriority
//	@Override
//	public void run() {
//		System.out.println(getPriority());
//		
//	}
	// Isalive
//	@Override
//	public void run() {
//		System.out.println("IsAlive Method");
//	}
	// yield
	@Override
	public void run() {
		for (int i = 1; i <= 15; i++)
			System.out.println("Yield method =" + i);
	}

}
