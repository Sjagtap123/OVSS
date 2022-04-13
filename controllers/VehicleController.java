package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Vehicle;
import com.example.demo.seervice.CustomerService;
import com.example.demo.seervice.VehicleService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class VehicleController {
	
	@Autowired
	VehicleService vservice;
	
	@Autowired
	CustomerService cservice;
	
    
	@GetMapping("getvehicle/{cid}")
	public List<Vehicle> getVehicle(@PathVariable ("cid") int cid)
	{
		Customer c=  cservice.getCustomer(cid);
		
		return vservice.getVehicle(c);
	}
	

}
