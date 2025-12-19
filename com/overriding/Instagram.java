package com.overriding;
//Q5
public class Instagram  extends SocialMedia{
	@Override
	void screeningtime() {
		System.out.println("The screening time of Instagram is 3 hr daily");
		super.screeningtime();
	}

}
