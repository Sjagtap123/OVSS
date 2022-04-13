package com.example.demo.entities;

import java.sql.Date;

public class InvoiceAdd {

	Date date;
	
	int order_id;
	
	int customerID;
	
	float totalBill;

	public InvoiceAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceAdd(Date date, int order_id, int customerID, float totalBill) {
		super();
		this.date = date;
		this.order_id = order_id;
		this.customerID = customerID;
		this.totalBill = totalBill;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public float getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(float totalBill) {
		this.totalBill = totalBill;
	}
	
	
}
