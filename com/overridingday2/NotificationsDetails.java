package com.overridingday2;

public class NotificationsDetails {
	public static void main(String[] args) {
		Notification n;
		n=new EmailNotification();
		n.sendNotification();
		
		n=new SMSNotification();
		n.sendNotification();
		
		
		n=new PushNotification();
		n.sendNotification();
		
	}

}
