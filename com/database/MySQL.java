package com.database;

public class MySQL extends DataBase {
	@Override
	public void connect() {
		System.out.println("Database Conneceted with MySQL");
	}

	@Override
	public void executeQuery() {
		System.out.println(" MySQL Query execute");
	}

}
