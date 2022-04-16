package com.example.demo.entities;

public class UpdateStatus {

	String order_status;
	
	int order_id;

	public UpdateStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateStatus(String order_status, int order_id) {
		super();
		this.order_status = order_status;
		this.order_id = order_id;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	
}
