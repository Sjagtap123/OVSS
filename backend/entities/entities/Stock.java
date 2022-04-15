package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int stockID;
	@Column
	String stock_name;
	@Column
	double stock_price;
	@Column
	int stock_qty;
	
	public Stock() {
		super();
	}

	public Stock(int stockID, String stock_name, double stock_price, int stock_qty) {
		super();
		this.stockID = stockID;
		this.stock_name = stock_name;
		this.stock_price = stock_price;
		this.stock_qty = stock_qty;
	}

	public Stock(String stock_name, double stock_price, int stock_qty) {
		super();
		this.stock_name = stock_name;
		this.stock_price = stock_price;
		this.stock_qty = stock_qty;
	}

	public int getStockID() {
		return stockID;
	}

	public void setStockID(int stockID) {
		this.stockID = stockID;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public double getStock_price() {
		return stock_price;
	}

	public void setStock_price(double stock_price) {
		this.stock_price = stock_price;
	}

	public int getStock_qty() {
		return stock_qty;
	}

	public void setStock_qty(int stock_qty) {
		this.stock_qty = stock_qty;
	}
	
	
}
