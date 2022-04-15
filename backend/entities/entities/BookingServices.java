package com.example.demo.entities;

import java.sql.Date;
import java.util.List;

public class BookingServices {

	
    int customerID;    //localStorage
	
	int ownerID;   //select
	 
	int vehicleID;   //select
	
	Date servicing_date;  //input type-date
	
	List<Integer> service_id;  //select - multiple options can be selected

	public BookingServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingServices(int customerID, int ownerID, int vehicleID, Date servicing_date, List<Integer> service_id) {
		super();
		this.customerID = customerID;
		this.ownerID = ownerID;
		this.vehicleID = vehicleID;
		this.servicing_date = servicing_date;
		this.service_id = service_id;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public Date getServicing_date() {
		return servicing_date;
	}

	public void setServicing_date(Date servicing_date) {
		this.servicing_date = servicing_date;
	}

	public List<Integer> getService_id() {
		return service_id;
	}

	public void setService_id(List<Integer> service_id) {
		this.service_id = service_id;
	}

	@Override
	public String toString() {
		return "BookingServices [customerID=" + customerID + ", ownerID=" + ownerID + ", vehicleID=" + vehicleID
				+ ", servicing_date=" + servicing_date + ", service_id=" + service_id + "]";
	}
	
	
	
	
}
