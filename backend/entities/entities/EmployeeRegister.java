package com.example.demo.entities;

import java.util.Date;

public class EmployeeRegister 
{
	
	String email;
	String password;
	String user_type;
	int isactive;
	int questionID;
	String answer;
	String firstname;
	String lastname;
	String address;
	String contact;
	Date joindate;
	int login;
	int OwnerID;
	public EmployeeRegister() {
		super();
	}
	public EmployeeRegister(String email, String password, String user_type, int isactive, int questionID,
			String answer, String firstname, String lastname, String address, String contact, Date joindate, int login,
			int ownerID) {
		super();
		this.email = email;
		this.password = password;
		this.user_type = user_type;
		this.isactive = isactive;
		this.questionID = questionID;
		this.answer = answer;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.contact = contact;
		this.joindate = joindate;
		this.login = login;
		this.OwnerID = ownerID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public int getIsactive() {
		return isactive;
	}
	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
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
	
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getOwnerID() {
		return OwnerID;
	}
	public void setOwnerID(int ownerID) {
		OwnerID = ownerID;
	}
	
	

	
	
}