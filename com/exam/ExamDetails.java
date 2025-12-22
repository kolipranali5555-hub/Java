package com.exam;

public class ExamDetails {
	public static void main(String[] args) {

		OnlineExam oe;
		System.out.println("Online Examination..!!!");
		oe = new McqQuestions();
		oe.startExam();
		oe.applyNegativeMarks();
		oe.endExam();

		System.err.println("*************************");

		oe = new DescriptiveQuestion();
		oe.startExam();
		oe.applyNegativeMarks();
		oe.endExam();

	}
}
