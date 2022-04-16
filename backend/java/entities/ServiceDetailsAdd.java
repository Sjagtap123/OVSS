package com.example.demo.entities;


public class ServiceDetailsAdd {
	
	
	int service_id;
	int ownerid;
	float price;
	String description;
	public ServiceDetailsAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceDetailsAdd(int service_id, int ownerid, float price, String description) {
		super();
		this.service_id = service_id;
		this.ownerid = ownerid;
		this.price = price;
		this.description = description;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
