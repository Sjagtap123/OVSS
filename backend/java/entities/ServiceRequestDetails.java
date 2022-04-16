package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_request_details")
public class ServiceRequestDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ser_req_det_id;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	ServiceRequest order_id;
	@ManyToOne
	@JoinColumn(name="service_id")
	Services service_id;
	public ServiceRequestDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceRequestDetails(ServiceRequest order_id, Services service_id) {
		super();
		this.order_id = order_id;
		this.service_id = service_id;
	}
	
	
	
	
	public ServiceRequestDetails(Services service_id) {
		super();
		this.service_id = service_id;
	}
	
	
	public int getSer_req_det_id() {
		return ser_req_det_id;
	}
	public void setSer_req_det_id(int ser_req_det_id) {
		this.ser_req_det_id = ser_req_det_id;
	}
	public ServiceRequest getOrder_id() {
		return order_id;
	}
	public void setOrder_id(ServiceRequest order_id) {
		this.order_id = order_id;
	}
	public Services getService_id() {
		return service_id;
	}
	public void setService_id(Services service_id) {
		this.service_id = service_id;
	}
	
	
	
	

}
