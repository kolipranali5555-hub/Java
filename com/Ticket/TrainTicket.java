package com.Ticket;

public class TrainTicket extends Ticket {
	
	@Override
	void bookTicket() {
	System.out.println("Train ticket is booked");
	}
	@Override
	void ticketPrice() {
		System.out.println("Train ticket price is 800");
		
	}
	

}
