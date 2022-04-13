package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Owner;
import com.example.demo.entities.ServiceDetails;
import com.example.demo.repository.ServiceDetailsRepository;

@Service
public class ServiceDetailsService {
   
	@Autowired
	ServiceDetailsRepository sdrepo;
	
	
	public ServiceDetails add(ServiceDetails sd)
	{
		return sdrepo.save(sd);
	}
	
	public List<ServiceDetails> servicedetails(Owner oid)
	{
		return sdrepo.servicedetails(oid);
	}
	 
	public List<ServiceDetails> getAll()
	{
		return sdrepo.findAll();
	}
	

	
}
