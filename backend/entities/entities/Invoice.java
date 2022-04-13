package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int invoiceID;
	@Column
	Date date;
	
	@OneToOne
	@JoinColumn(name="order_id")
	ServiceRequest order_id;
	
	@OneToOne
	@JoinColumn(name="customerID")
	Customer customerID;
	
	@Column
	float totalBill;
	
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(Date date, ServiceRequest order_id, Customer customerID, float totalBill) {
		super();
		this.date = date;
		this.order_id = order_id;
		this.customerID = customerID;
		this.totalBill = totalBill;
	}

	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ServiceRequest getOrder_id() {
		return order_id;
	}

	public void setOrder_id(ServiceRequest order_id) {
		this.order_id = order_id;
	}

	public Customer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Customer customerID) {
		this.customerID = customerID;
	}

	public float getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(float totalBill) {
		this.totalBill = totalBill;
	}
	
	
	
}
