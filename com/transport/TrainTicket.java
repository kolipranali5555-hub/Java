package com.transport;

public class TrainTicket extends TransportTicket {

	@Override
	public void calculateFare() {
		System.out.println("Fare is calculated by distance");
		
	}

}
