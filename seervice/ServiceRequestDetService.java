package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ServiceRequestDetails;
import com.example.demo.repository.ServiceRequestDetRepository;

@Service
public class ServiceRequestDetService {

	@Autowired
	ServiceRequestDetRepository srdrepo;
	
	public ServiceRequestDetails Add(ServiceRequestDetails srd)
	{
		return srdrepo.save(srd);
	}
	
	
}
