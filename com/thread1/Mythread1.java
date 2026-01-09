package com.thread1;

public class Mythread1 {
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("mythread"+i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void m1() {
		for(int i=111;i<=200;i++) {
			System.out.println("m1 logic"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
