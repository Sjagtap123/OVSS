package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adminID;
	
	@Column
	String firstname;
	
	@Column
	String lastname;
	
	@OneToOne
	@JoinColumn(name="UserID")
	Login login;

	public Admin() {
		super();
	}

	public Admin(int adminID, String firstname, String lastname, Login login) {
		super();
		this.adminID = adminID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
}
