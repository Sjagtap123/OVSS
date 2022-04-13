package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int questionID;
	
	@Column
	String question;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionID, String question) {
		super();
		this.questionID = questionID;
		this.question = question;
	}

	public Question(String question) {
		super();
		this.question = question;
	}
	

	public Question(int questionID) {
		super();
		this.questionID = questionID;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	

}
