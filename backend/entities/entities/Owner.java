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
@Table(name="owner")
public class Owner {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ownerid;
	
	@Column
	String ownerName;
	
	@Column
	String addressLine1;
	
	@Column
	String addressLine2;
	
	@Column
	int pincode;
	
	@Column
	String contact;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="UserID")
	Login login;
	
	@ManyToOne
	@JoinColumn(name="areaID")
	Area areaID;

	public Owner() {
		super();
	}

	

	public Owner(String ownerName, String addressLine1, String addressLine2, int pincode, String contact, Login login,
			Area areaID) {
		super();
		this.ownerName = ownerName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.contact = contact;
		this.login = login;
		this.areaID = areaID;
	}
   
	
	


	public Owner(int ownerid) {
		super();
		this.ownerid = ownerid;
	}



	public int getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

