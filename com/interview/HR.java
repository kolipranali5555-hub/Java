package com.interview;

public class HR implements Interview {
	@Override
	public void schedule() {
		System.out.println("Scheduling HR Interview");
	}

	@Override
	public void reschedule() {
		System.out.println("Rescheduling HR Interview for some reason");
	}

	@Override
	public void cancel() {
		System.out.println("Cancelling A HR Interview");
	}

}
