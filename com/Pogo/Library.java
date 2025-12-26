package com.Pogo;
//Q2
public class Library {
	String labName;
	String labLocation;
	int totalBooks;
	int totalDept;
	
	
	
	 public Library(){
		
	}
	 public Library(String labName, String labLocation,int totalBooks,int totalDept) {
		 this.labName=labName;
		 this.labLocation=labLocation;
		 this.totalBooks=totalBooks;
		 this.totalDept=totalDept;
		 
	 }
	 public String getLabName() {
		 return labName;
	 }
	 public void setLabName(String labName) {
		 this.labName = labName;
	 }
	 public String getLabLocation() {
		 return labLocation;
	 }
	 public void setLabLocation(String labLocation) {
		 this.labLocation = labLocation;
	 }
	 public int getTotalBooks() {
		 return totalBooks;
	 }
	 public void setTotalBooks(int totalBooks) {
		 this.totalBooks = totalBooks;
	 }
	 public int getTotalDept() {
		 return totalDept;
	 }
	 public void setTotalDept(int totalDept) {
		 this.totalDept = totalDept;
	 }
	 @Override
	 public String toString() {
		return "Library [labName=" + labName + ", labLocation=" + labLocation + ", totalBooks=" + totalBooks
				+ ", totalDept=" + totalDept + "]";
	 }
	 

}
