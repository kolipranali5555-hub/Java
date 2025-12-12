package com.inheritancePractice;

public class SocialMediaDetails {

	public static void main(String[] args) {
	System.err.println("SocialMedia Details...!!!");
	
	Instagram i=new Instagram();
	i.createacc();
	i.uploadPost();
	i.sendMessage();
	
	System.err.println("*******************************************");
	
	Facebook fb=new Facebook();
	fb.createacc();
	fb.uploadPost();
	fb.followUser();
	
	}

}
