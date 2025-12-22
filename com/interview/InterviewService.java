package com.interview;

public class InterviewService {
	public static void main(String[] args) {
		System.err.println("Techinal Interview Details..!!");
		Interview i;
		i = new Tecnhical();
		i.schedule();
		i.reschedule();
		i.cancel();
		System.err.println("HR Interview Details..!!");

		i = new HR();
		i.schedule();
		i.reschedule();
		i.cancel();
	}

}
