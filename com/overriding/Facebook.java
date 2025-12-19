package com.overriding;
//Q5
public class Facebook  extends SocialMedia{
	@Override
	void screeningtime() {
		System.out.println("The screening time of facebook is 2 hr daily");
		super.screeningtime();
	}
	public static void main(String[] args) {
		System.err.println("SocialMedia");
		SocialMedia sm=new SocialMedia();
		sm.screeningtime();
		System.err.println("Instagram");
		Instagram i=new Instagram();
		i.screeningtime();
		
		System.err.println("Facebook");
		Facebook f=new Facebook();
		f.screeningtime();
	}

}
