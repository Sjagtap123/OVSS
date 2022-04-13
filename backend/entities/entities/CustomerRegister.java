package com.example.demo.entities;



public class CustomerRegister {
	
	String email;
	String password;
	String user_type;
	int isactive;
	int questionID;
	String answer;
	String firstname;
	String middlename;
	String lastname;
	String contact;
	String address;
	int areaID;
	String vehiclenumber;
	String company;
	String model;
	String vehicle_type;
	public CustomerRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*public CustomerRegister(String email, String password, String user_type, int isactive, int questionID,
			String answer, String firstname, String middlename, String lastname, String contact, String address,
			int areaID) {
		super();
		this.email = email;
		this.password = password;
		this.user_type = user_type;
		this.isactive = isactive;
		this.questionID = questionID;
		this.answer = answer;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.contact = contact;
		this.address = address;
		this.areaID = areaID;
	}*/
	
	
	

	public CustomerRegister(String email, String password, String user_type, int isactive, int questionID,
			String answer, String firstname, String middlename, String lastname, String contact, String address,
			int areaID, String vehiclenumber, String company, String model, String vehicle_type) {
		super();
		this.email = email;
		this.password = password;
		this.user_type = user_type;
		this.isactive = isactive;
		this.questionID = questionID;
		this.answer = answer;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.contact = contact;
		this.address = address;
		this.areaID = areaID;
		//this.customerID = customerID;
		this.vehiclenumber = vehiclenumber;
		this.company = company;
		this.model = model;
		this.vehicle_type = vehicle_type;
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
	public String getuser_type() {
		return user_type;
	}
	public void setuser_type(String user_type) {
		this.user_type = user_type;
	}
	public int getisactive() {
		return isactive;
	}
	public void setisactive(int isactive) {
		this.isactive = isactive;
	}

	public String getanswer() {
		return answer;
	}
	public void setanswer(String answer) {
		this.answer = answer;
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

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public int getAreaID() {
		return areaID;
	}

	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}

	public String getVehiclenumber() {
		return vehiclenumber;
	}

	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	
	
	
	

}
