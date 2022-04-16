package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.seervice.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
  
	@Autowired
	AdminService aservice;
}
