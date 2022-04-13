package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cityID;
	@Column
	String cityNM;
	
	
	public City() {
		super();
	}


	public City(int cityID, String cityNM) {
		super();
		this.cityID = cityID;
		this.cityNM = cityNM;
	}


	public int getCityID() {
		return cityID;
	}


	public void setCityID(int cityID) {
		this.cityID = cityID;
	}


	public String getCityNM() {
		return cityNM;
	}


	public void setCityNM(String cityNM) {
		this.cityNM = cityNM;
	}
	
	
	
}
