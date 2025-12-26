package com.Pogo;

public class College {
	String collegeName;
	String university;
	int totalStudents;
	int totalTeachers;
	boolean ladiesRoom;
	
	
	
	College(){
		
	}



	public College(String collegeName, String university, int totalStudents, int totalTeachers, boolean ladiesRoom) {
		this.collegeName = collegeName;
		this.university = university;
		this.totalStudents = totalStudents;
		this.totalTeachers = totalTeachers;
		this.ladiesRoom = ladiesRoom;
	}



	public String getCollegeName() {
		return collegeName;
	}



	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public String getUniversity() {
		return university;
	}



	public void setUniversity(String university) {
		this.university = university;
	}



	public int getTotalStudents() {
		return totalStudents;
	}



	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}



	public int getTotalTeachers() {
		return totalTeachers;
	}



	public void setTotalTeachers(int totalTeachers) {
		this.totalTeachers = totalTeachers;
	}



	public boolean isLadiesRoom() {
		return ladiesRoom;
	}



	public void setLadiesRoom(boolean ladiesRoom) {
		this.ladiesRoom = ladiesRoom;
	}



	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", university=" + university + ", totalStudents=" + totalStudents
				+ ", totalTeachers=" + totalTeachers + ", ladiesRoom=" + ladiesRoom + "]";
	}
	
	



	
	}
	
	


