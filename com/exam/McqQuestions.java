package com.exam;

public class McqQuestions implements OnlineExam {
	@Override
	public void startExam() {
		System.out.println("Mcq type Exam is start");
	}

	@Override
	public void applyNegativeMarks() {
		System.out.println("negative marking sytem");

	}

	@Override
	public void endExam() {
		System.out.println("End of the exam");

	}

}
