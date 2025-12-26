package com.pogoclass;

public class Employe {
	int id;
	String name;
	Address add;
	
	
	public Employe() {
		super();
		
	}


	public Employe(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	
	
	


}
