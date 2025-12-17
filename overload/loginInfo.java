package com.overload;
//Q15
public class loginInfo {
	void login(String userName) {
		System.out.println("userName:"+userName);
		
	}
	void login(String userName, String password) {
		System.err.println("userName:"+userName);
		System.out.println("Password:"+password);
	}
	
	public static void main(String[] args) {
		loginInfo l=new loginInfo();
		l.login("Pranali");
		l.login("Pranali", "p@123");
	}

}
