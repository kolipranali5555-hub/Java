package com.overridingday2;

public class PushNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("Sending notification via Push notification");
	}

}
