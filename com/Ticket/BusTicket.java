package com.Ticket;

public class BusTicket  extends Ticket{
	@Override
	void bookTicket() {
		System.out.println("Booking ticket is booked");
	}
	@Override
	void ticketPrice() {
		System.out.println("ticket price is starting from 50 rs");
	}

}
