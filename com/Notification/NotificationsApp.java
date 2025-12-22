package com.Notification;

public class NotificationsApp {
	public static void main(String[] args) {
		Notification n;
		n=new BaseNotification();
		n.send();
		
		n=new EmailNotification();
		n.send();
		
		n=new SMSNotification();
		n.send();
	}
	

}
