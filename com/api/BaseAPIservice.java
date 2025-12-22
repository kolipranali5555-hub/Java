package com.api;

public class BaseAPIservice implements APIservice{
	@Override
	public void callAPI() {
		System.out.println("Calling payment API");
	}
	@Override
	public void handleResponse() {
		System.out.println("Handling Payment API response");
		
		
	}

}
