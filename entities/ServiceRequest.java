package com.example.demo.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="service_request")
public class ServiceRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int order_id;
	@ManyToOne
	@JoinColumn(name="customerID")
	Customer customerID;
	@ManyToOne
	@JoinColumn(name="ownerID")
	Owner ownerID;
	@ManyToOne
	@JoinColumn(name="vehicleID")
	Vehicle vehicleID;
	@ManyToOne
	@JoinColumn(name="emp_id")
	Employee emp_id;
	@Column
	String order_status;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column
	Date requested_date;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column
	Date servicing_date;
	
	@OneToMany(mappedBy = "ser_req_det_id",cascade = CascadeType.ALL)
	List<ServiceRequestDetails> srs;
	
	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ServiceRequest(Customer customerID, Owner ownerID, Vehicle vehicleID, Employee emp_id, String order_status,
			Date requested_date, Date servicing_date, List<ServiceRequestDetails> srs) {
		super();
		this.customerID = customerID;
		this.ownerID = ownerID;
		this.vehicleID = vehicleID;
		this.emp_id = emp_id;
		this.order_status = order_status;
		this.requested_date = requested_date;
		this.servicing_date = servicing_date;
		this.srs = srs;
		for(ServiceRequestDetails d : srs)
			d.setOrder_id(this);
	}


	public ServiceRequest(Customer customerID, Owner ownerID, Vehicle vehicleID, Employee emp_id, String order_status,
			Date requested_date, Date servicing_date) {
		super();
		this.customerID = customerID;
		this.ownerID = ownerID;
		this.vehicleID = vehicleID;
		this.emp_id = emp_id;
		this.order_status = order_status;
		this.requested_date = requested_date;
		this.servicing_date = servicing_date;
	}
	


	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Customer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Customer customerID) {
		this.customerID = customerID;
	}
	public Owner getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(Owner ownerID) {
		this.ownerID = ownerID;
	}
	public Vehicle getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(Vehicle vehicleID) {
		this.vehicleID = vehicleID;
	}
	public Employee getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Employee emp_id) {
		this.emp_id = emp_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public Date getRequested_date() {
		return requested_date;
	}
	public void setRequested_date(Date requested_date) {
		this.requested_date = requested_date;
	}
	public Date getServicing_date() {
		return servicing_date;
	}
	public void setServicing_date(Date servicing_date) {
		this.servicing_date = servicing_date;
	}


	public List<ServiceRequestDetails> getSrs() {
		return srs;
	}


	public void setSrs(List<ServiceRequestDetails> srs) {
		this.srs = srs;
		for(ServiceRequestDetails d : srs)
			d.setOrder_id(this);
	}
	
	
	
	

}
