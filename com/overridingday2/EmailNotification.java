package com.overridingday2;

public class EmailNotification extends Notification{
	@Override
	public void sendNotification() {
	System.out.println("Sending notifiaction via Email");	

}
}
