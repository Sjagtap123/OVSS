package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.seervice.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController 
{
  
	@Autowired
	LoginService lservice;
	
	@PostMapping("/checkLogin")
	public Object checkLogin(@RequestBody Login l)
	{
		return lservice.checkLogin(l.getEmail(), l.getPassword());
	}
	
}
