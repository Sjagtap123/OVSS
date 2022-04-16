package com.example.demo.entities;

public class AssignEmp {

	int order_id;
	
	int empid;

	public AssignEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignEmp(int order_id, int empid) {
		super();
		this.order_id = order_id;
		this.empid = empid;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
