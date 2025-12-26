package com.pogoclass;

public class User {
	public String name;
	public int userID;

public User(String name, int userID) {
		super();
		this.name = name;
		this.userID = userID;
	}
public void displayUser() {
	System.out.println("UserName "+name);
	System.out.println("UserId "+userID);
}
}






