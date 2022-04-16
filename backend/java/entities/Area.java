package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class Area {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int areaID;
	@Column
	String areaNM;
	
	@ManyToOne
	@JoinColumn(name = "cityID")
	City cityID;

	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Area(int areaID, String areaNM, City cityID) {
		super();
		this.areaID = areaID;
		this.areaNM = areaNM;
		this.cityID = cityID;
	}

	public Area(String areaNM, City cityID) {
		super();
		this.areaNM = areaNM;
		this.cityID = cityID;
	}

	public Area(int areaID, String areaNM) {
		super();
		this.areaID = areaID;
		this.areaNM = areaNM;
	}

	public Area(String areaNM) {
		super();
		this.areaNM = areaNM;
	}

	public int getAreaID() {
		return areaID;
	}

	public void setAreID(int areaID) {
		this.areaID = areaID;
	}

	public String getAreaNM() {
		return areaNM;
	}

	public void setAreaNM(String areaNM) {
		this.areaNM = areaNM;
	}

	public City getCityID() {
		return cityID;
	}

	public void setCityID(City cityID) {
		this.cityID = cityID;
	}
	
	
	
	
	
	

}
