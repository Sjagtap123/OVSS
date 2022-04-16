package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ServiceRequestDetails;
import com.example.demo.entities.Services;
import com.example.demo.seervice.ServiceRequestDetService;
import com.example.demo.seervice.ServicesService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ServiceReqDetController {

	@Autowired
	ServiceRequestDetService srdservice;
	@Autowired
	ServicesService sservice;
	
	@GetMapping("/GetAllSRDet/{oid}")
	public List<Services> GetAll(@PathVariable("oid") int oid)
	{
		List<Integer> lservice=srdservice.GetAll(oid);
		List<Services> list=new ArrayList<Services>();
		for(int i : lservice)
		{
			list.add(sservice.getService(i));
		}
		return list;
	}
}
