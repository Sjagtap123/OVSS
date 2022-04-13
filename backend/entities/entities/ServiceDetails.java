package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_details")
public class ServiceDetails {
   
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int servicedetID;
	
	@Column
	float price;
	
	@Column
	String description;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="service_id")
	Services service;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ownerID")
	Owner owner;

	public ServiceDetails() {
		super();
	}

	public ServiceDetails(int servicedetID, float price, String description, Services service, Owner owner) {
		super();
		this.servicedetID = servicedetID;
		this.price = price;
		this.description = description;
		this.service = service;
		this.owner = owner;
	}
	
	

	public ServiceDetails(float price, String description, Services service, Owner owner) {
		super();
		this.price = price;
		this.description = description;
		this.service = service;
		this.owner = owner;
	}

	public int getServicedetID() {
		return servicedetID;
	}

	public void setServicedetID(int servicedetID) {
		this.servicedetID = servicedetID;
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

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	
	
	
}
