package com.example.demo.entities;

public class OwnerRegister {
	
	String email;
	String password;
	String user_type;
	int isactive;
	int questionID;
	String answer;
	String ownerName;
	String addressLine1;
	String addressLine2;
	int pincode;
	String contact;
	int areaID;
	public OwnerRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OwnerRegister(String email, String password, String user_type, int isactive, int questionID, String answer,
			String ownerName, String addressLine1, String addressLine2, int pincode, String contact, int areaID) {
		super();
		this.email = email;
		this.password = password;
		this.user_type = user_type;
		this.isactive = isactive;
		this.questionID = questionID;
		this.answer = answer;
		this.ownerName = ownerName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.contact = contact;
		this.areaID = areaID;
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
	public int getAreaID() {
		return areaID;
	}
	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}
	
	
	

}
