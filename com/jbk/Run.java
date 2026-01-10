package com.jbk;

public class Run implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running using runnable interface..!");
	}
	
	public static void main(String[] args) {
		Run r=new Run();
		
		Thread t=new Thread(r);
		t.start();
		
	}
	

}
