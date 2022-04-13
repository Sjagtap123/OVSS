package com.example.demo.entities;

import java.security.Timestamp;
import java.sql.Date;

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
@Table(name="feedbacks")
public class Feedback {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int feedbackID;
	
	@Column
	String feedback_text;
	
	@Column
	Date created_on;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerID")
	Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ownerID")
	Owner owner;

	public Feedback() {
		super();
	}
   
	

	

	public Feedback(String feedback_text, Date created_on, Customer customer, Owner owner) {
		super();
		this.feedback_text = feedback_text;
		this.created_on = created_on;
		this.customer = customer;
		this.owner = owner;
	}





	public int getFeedbackID() {
		return feedbackID;
	}

	public void setFeedbackID(int feedbackID) {
		this.feedbackID = feedbackID;
	}

	public String getFeedback_text() {
		return feedback_text;
	}

	public void setFeedback_text(String feedback_text) {
		this.feedback_text = feedback_text;
	}

	public Date  getCreatedOn() {
		return created_on;
	}

	public void setCreatedOn(Date   createdOn) {
		this.created_on = createdOn;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	
	
	
	
}
