package com.inheritancePractice;

public class SocialMedia {

		String Username;
		String Password;
		int Followers;
		int totalLikes;
		
		public SocialMedia (String Username,String Password,int Followers,int totalLikes) {
			this.Username=Username;
			this.Password=Password;
			this.Followers=Followers;
			this.totalLikes=totalLikes;
		}
		void createacc() {
			System.out.println("Account created Successfully");
		}
		
		void uploadPost(){
			System.out.println("Post Upload Successfully");
			
			
			
		}
		
		
}
