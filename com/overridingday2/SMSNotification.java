package com.overridingday2;

public class SMSNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("Sending notifiaction via SMS");
	}

}
