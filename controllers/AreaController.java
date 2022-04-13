package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.seervice.AreaService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AreaController {
  
	@Autowired
	AreaService aservice;
	
	@PostMapping("/addArea")
	public Area getArea(Area a)
	{
		return aservice.add(a);
	}
	
	@GetMapping("/getarea/{cid}")
	public List<Area> getAreaByCity(@PathVariable("cid") int id)
	{
		System.out.println(id);
		return  aservice.getAreaByCity(id);
	}
	
	
	@GetMapping("/getarea")
	public List<Area> getarea()
	{
		return  aservice.getarea();
	}

}
