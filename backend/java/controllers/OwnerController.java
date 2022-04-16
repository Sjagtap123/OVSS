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
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.OwnerRegister;
import com.example.demo.entities.Question;
import com.example.demo.seervice.OwnerService;
import com.example.demo.seervice.AreaService;
import com.example.demo.seervice.LoginService;
import com.example.demo.seervice.QuestionService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OwnerController {
  
	@Autowired
	OwnerService oservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	AreaService aservice;
	
	@Autowired
	QuestionService qservice;
	
	@PostMapping("/addowner")
	public Owner registerOwner(@RequestBody OwnerRegister or)
	{
		
		Question q = qservice.getQuestion(or.getQuestionID());
        Area a = aservice.getArea(or.getAreaID());
		
		Login l=new Login(or.getEmail(),or.getPassword(),"owner",1,q,or.getAnswer());
		Login inserted =lservice.add(l);
		
		Owner o=new Owner(or.getOwnerName(),or.getAddressLine1(),or.getAddressLine2(),or.getPincode(),or.getContact(),inserted,a);
		return oservice.add(o);
	}
	
	@GetMapping("/getOwnerbyArea/{aid}")
	public List<Owner> getOwnerbyArea(@PathVariable("aid") int areaID)
	{
		System.out.println(areaID);
		return oservice.getOwnerbyArea(areaID);
	}
}
