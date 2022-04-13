package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeRegister;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.Question;
import com.example.demo.seervice.EmployeeService;
import com.example.demo.seervice.LoginService;
import com.example.demo.seervice.OwnerService;
import com.example.demo.seervice.QuestionService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController 
{
	@Autowired
	EmployeeService eservice;
	@Autowired
	LoginService lservice;
	@Autowired
	OwnerService oservice;
	
	@Autowired
	QuestionService qservice;
	
	@PostMapping("/regemp")
	public Employee RegisterEmployee(@RequestBody EmployeeRegister er)
	{

		
		Question q = qservice.getQuestion(er.getQuestionID());
		Owner o=oservice.getOwner(er.getOwnerID());
		Login l=new Login(er.getEmail(),er.getPassword(),"employee",1,q,er.getAnswer());
		Login inserted=lservice.add(l);
			
		Employee e=new Employee(er.getFirstname(),er.getLastname(),er.getAddress(),er.getContact(),er.getJoindate(),inserted,o);
		return eservice.add(e);
	}
}
