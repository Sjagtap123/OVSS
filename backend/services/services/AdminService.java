package com.example.demo.seervice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Customer;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
  
	@Autowired
	AdminRepository arepo;
	
	public Admin add(Admin a)
	{
		return arepo.save(a);
	}
}
