package com.database;

public class Oracale extends DataBase {
	@Override
	public void connect() {
		System.out.println("Database is connected with Oracle");
	}

	@Override
	public void executeQuery() {
		System.out.println(" oracle Query is executed");
	}

}
