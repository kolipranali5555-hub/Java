package com.tka1;

public class PaymentStatus {
	public static void main(String[] args) {
		boolean[]payment=new boolean[6];
		payment[0]=true;//transcation successful
		payment[1]=false;//transaction failed
		payment[2]=false;
		payment[3]=true;
		payment[4]=true;
		payment[5]=true;
		
		
		System.err.println("Payment status..!!");
		for(int i=0;i<payment.length;i++) {
			System.out.println(payment[i]);
		}
		
	}

}
