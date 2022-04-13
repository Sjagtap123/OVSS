package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class Services {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int service_id;
	
	@Column
	String service_name;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	Category category_id;
	
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(String service_name, Category category_id) {
		super();
		this.service_name = service_name;
		this.category_id = category_id;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public Category getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Category category_id) {
		this.category_id = category_id;
	}
	
	
}
