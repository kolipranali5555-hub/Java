package com.transport;
//Q4
public class TicketAPP {
	public static void main(String[] args) {
		
	
	TransportTicket t;
	t=new TrainTicket();
	t.calculateFare();
	t.PriceTikket();
	
	System.err.println("*******************************************************");
	t=new FlightTicket();
	t.calculateFare();
	t.PriceTikket();
	

}
}
