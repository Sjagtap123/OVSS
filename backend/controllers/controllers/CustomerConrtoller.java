package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.Login;
import com.example.demo.entities.Question;
import com.example.demo.entities.Vehicle;
import com.example.demo.seervice.AreaService;
import com.example.demo.seervice.CustomerService;
import com.example.demo.seervice.LoginService;
import com.example.demo.seervice.QuestionService;
import com.example.demo.seervice.VehicleService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerConrtoller {
	
	@Autowired
	CustomerService cservice;
	
	@Autowired
	LoginService lservice;
	@Autowired
	QuestionService qservice;
	@Autowired
	AreaService aservice;
	@Autowired
	VehicleService vservice;
	@PostMapping("/register")
	public Vehicle registerCustomer(@RequestBody CustomerRegister cr)
	{

		
		Question q = qservice.getQuestion(cr.getQuestionID());
		Area a = aservice.getArea(cr.getAreaID());
		//Customer c1=cservice.getCustomerID(cr.getCustomerID());
		
		Login l=new Login(cr.getEmail(),cr.getPassword(),"customer",1,q,cr.getanswer());
		Login inserted =lservice.add(l);
		
		
		Customer c=new Customer(cr.getFirstname(),cr.getMiddlename(),cr.getLastname(),cr.getContact(),cr.getAddress(),inserted,a);
		Customer insert=cservice.add(c);
		Vehicle v=new Vehicle(insert,cr.getVehiclenumber(),cr.getCompany(),cr.getModel(),cr.getVehicle_type());
		return vservice.addVehicle(v);
	}
	
   
	@GetMapping("/getallcustomer")
	public List<Customer> getcities()
	{
		return cservice.getAll();
	}
	
	

}
