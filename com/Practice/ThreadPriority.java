package com.Practice;

public class ThreadPriority extends Thread {
	ThreadPriority(String name) {
		super(name);
	}

	public void run() {
		System.out.println("Thraed Priority "  + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority("Low");
		ThreadPriority t2 = new ThreadPriority("Normal");
		ThreadPriority t3 = new ThreadPriority("High");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}
}
