package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_details")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int vehicleID;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerID")
	Customer customerID;
	@Column
	String vehiclenumber;
	@Column
	String company;
	@Column
	String model;
	@Column
	String vehicle_type;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(Customer customerID, String vehiclenumber, String company, String model, String vehicle_type) {
		super();
		this.customerID = customerID;
		this.vehiclenumber = vehiclenumber;
		this.company = company;
		this.model = model;
		this.vehicle_type = vehicle_type;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public Customer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Customer customerID) {
		this.customerID = customerID;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	
	
	

}
