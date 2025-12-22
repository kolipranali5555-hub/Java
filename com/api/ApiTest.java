package com.api;

public class ApiTest {
	public static void main(String[] args) {
		System.out.println("BaseAPI..!!");
		APIservice a;
		a=new BaseAPIservice();
		a.callAPI();
		a.handleResponse();
		System.out.println(" ");
		
		System.out.println("PaymentAPI..!!");
		a=new PaymentapiService();
		a.callAPI();
		a.handleResponse();
		System.out.println(" ");
		
		System.out.println("WeatherapiService");
		a=new WeatherapiService();
		a.callAPI();
		a.handleResponse();
		
		
		}
	
			
		
	}


