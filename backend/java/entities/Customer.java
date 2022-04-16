package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customerID;
	@Column
	String firstname;
	@Column
	String middlename;
	@Column
	String lastname;
	@Column
	String contact;
	@Column
	String address;
	
	@OneToOne
	@JoinColumn(name="UserID")
	Login login;
	
	@ManyToOne
	@JoinColumn(name="areaID")
	Area areaID;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Customer(String firstname, String middlename, String lastname, String contact, String address, Login login,
			Area areaID) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.contact = contact;
		this.address = address;
		this.login = login;
		this.areaID = areaID;
	}
    
	

	public Customer(int customerID) {
		super();
		this.customerID = customerID;
	}




	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}




	public Area getAreaID() {
		return areaID;
	}




	public void setAreaID(Area areaID) {
		this.areaID = areaID;
	}


	
	
	
	
}
