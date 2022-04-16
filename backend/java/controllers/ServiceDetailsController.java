package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.Owner;
import com.example.demo.entities.ServiceDetails;
import com.example.demo.entities.ServiceDetailsAdd;
import com.example.demo.entities.Services;
import com.example.demo.seervice.OwnerService;
import com.example.demo.seervice.ServiceDetailsService;
import com.example.demo.seervice.ServicesService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ServiceDetailsController {
	
	@Autowired
	ServiceDetailsService sdservice;
	
	@Autowired
	OwnerService oservice;
	
	@Autowired
	ServicesService sservice;
	
	
	@GetMapping("/getservicedetails/{oid}")
	public List<ServiceDetails> getServiceDetails(@PathVariable("oid") int id)
	{
		System.out.println(id);
		
	    Owner o = oservice.getOwner(id);
		return sdservice.servicedetails(o);
	}
	
    

	
	@GetMapping("/getallservicedet")
	public List<ServiceDetails> getAll()
	{
		return sdservice.getAll();
	} 
	
	@PostMapping("/addServiceDetails")
	public ServiceDetails add(@RequestBody ServiceDetailsAdd sda)
	{		
		System.out.println(sda.getPrice()+" "+sda.getDescription()+" "+sda.getService_id()+" "+sda.getOwnerid());
		
		Services s=sservice.getService(sda.getService_id());
		Owner o=oservice.getOwner(sda.getOwnerid());
		ServiceDetails sd=new ServiceDetails(sda.getPrice(),sda.getDescription(),s,o);
		
		
		return sdservice.add(sd);
	}

	
	
}
