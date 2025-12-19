package com.Ticket;

public class FlightTicket extends Ticket {
	@Override
	void bookTicket() {
		System.out.println("Flight Tikcket is booked");
	}
	@Override
	void ticketPrice() {
		System.out.println("Flight ticket is starting from 7000");
	}

}
