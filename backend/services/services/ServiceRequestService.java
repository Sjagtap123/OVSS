package com.example.demo.seervice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ServiceRequest;
import com.example.demo.repository.ServiceRequestRepository;

@Service
public class ServiceRequestService {

	@Autowired
	ServiceRequestRepository srrepo;
	
	public ServiceRequest Add(ServiceRequest sr)
	{
		return srrepo.save(sr);
	}
	
	public int AssignEmployee(int empid,int order_id)
	{
		return srrepo.AssignEmployee(empid,order_id);
	}
	
	public int UpdateStatus(String status,int order_id)
	{
		return srrepo.UpdateStatus(status,order_id);
	}
	

}

