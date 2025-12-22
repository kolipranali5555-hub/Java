package com.Notification;

public class EmailNotification implements Notification {
	@Override
	public void send() {
		System.out.println("Sendong Email notification..!");
		
	}

}
