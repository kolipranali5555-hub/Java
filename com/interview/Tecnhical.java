package com.interview;

public class Tecnhical implements Interview {
	@Override
	public void schedule() {
		System.out.println(" Technical Interview sechduled..!!");
	}

	@Override
	public void reschedule() {
		System.out.println(" Technical Interview Reschedule..!!");
	}

	@Override
	public void cancel() {
		System.out.println("Cancelling  Technical Interview for some problem..!");
	}

}
