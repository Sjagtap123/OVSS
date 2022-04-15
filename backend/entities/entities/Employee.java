package com.example.demo.entities;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empid;
	@Column
	String firstname;
	@Column
	String lastname;
	@Column
	String address;
	@Column
	String contact;
	@Column
	Date joindate;
	
	@OneToOne
	@JoinColumn(name="UserID")
	Login login;
	
	@OneToOne
	@JoinColumn(name="OwnerID")
	Owner OwnerID;
	
	public Employee() {
		super();
	}
	public Employee(int empid, String firstname, String lastname, String address, String contact, Date joindate,Login login,Owner OwnerID) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.contact = contact;
		this.joindate = joindate;
		this.login=login;
		this.OwnerID=OwnerID;
	}
	public Employee(String firstname, String lastname, String address, String contact, Date joindate,Login login,Owner OwnerID) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.contact = contact;
		this.joindate = joindate;
		this.login=login;
		this.OwnerID=OwnerID;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Owner getOwnerID() {
		return OwnerID;
	}
	public void setOwnerID(Owner ownerID) {
		this.OwnerID = ownerID;
	}
	public Login getUserId() {
		return login;
	}
	public void setUserId(Login login) {
		this.login = login;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	
	
	
	
	
}
