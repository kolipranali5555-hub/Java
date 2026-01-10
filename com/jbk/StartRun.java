package com.jbk;

public class StartRun extends Thread {
	@Override
	public void run() {
		System.out.println("It is run method..!!");

	}

	public static void main(String[] args) {
		StartRun s = new StartRun();
		s.run();
		// s.start();
	}

}
