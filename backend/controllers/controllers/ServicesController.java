package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.Services;
import com.example.demo.seervice.ServicesService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ServicesController {

	@Autowired
	ServicesService sservice;
	
	@PostMapping("/addServices")
	public Services add(Services s) 
	{
		return sservice.add(s);
	}
	
	@GetMapping("/getallservices")
	public List<Services> getAll()
	{
		return sservice.getAll();	
	}
	
	@GetMapping("/getallservicesbyCat/{catid}")
	public List<Services> getAllbyCat(@PathVariable("catid") int category_id)
	{
		return sservice.getAllbyCat(category_id);	
	}
	
	
	
}
