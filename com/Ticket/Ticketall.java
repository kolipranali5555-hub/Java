package com.Ticket;

public class Ticketall {
	public static void main(String[] args) {
	Ticket t;
	t=new BusTicket();
	t.bookTicket();
	t.ticketPrice();
	
	t=new TrainTicket();
	t.bookTicket();
	t.ticketPrice();
	
	t=new FlightTicket();
	t.bookTicket();
	t.ticketPrice();
	
	}
}
