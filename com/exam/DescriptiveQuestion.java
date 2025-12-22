package com.exam;

public class DescriptiveQuestion implements OnlineExam {
	@Override
	public void startExam() {
		System.out.println(" Descriptive type Exam started now..");

	}

	@Override
	public void applyNegativeMarks() {
		System.out.println("exam includes Negative Marking system");

	}

	@Override
	public void endExam() {
		System.out.println("time is over");

	}

}
