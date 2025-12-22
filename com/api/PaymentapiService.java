package com.api;

public class PaymentapiService  implements APIservice {
	@Override
	public void callAPI() {
		System.out.println("calling  payment API by PaymentService..!!!");
	}
	@Override
	public void handleResponse() {
		System.out.println("Handling Payment API response ..!!!");
		
		
	}

}
