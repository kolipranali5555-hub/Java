package com.database;

public class DataBaseDetails {
	public static void main(String[] args) {
	DataBase d;
	d=new MySQL();
	d.connect();
	d.executeQuery();
	
	
	d=new  Oracale();
	d.connect();
	d.executeQuery();
	}	

}
