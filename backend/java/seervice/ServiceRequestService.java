package com.example.demo.seervice;

import java.util.List;

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
	
	public ServiceRequest GetOrderID(int order_id)
	{
		return srrepo.findById(order_id).get();
	}
	
	public List<ServiceRequest> ViewPendingRequests(int owner_id)
	{
		return srrepo.ViewPendingRequests(owner_id);
	}
	
	public List<ServiceRequest> ViewAssignedRequest(int emp_id)
	{
		return srrepo.ViewAssignedRequest(emp_id);
	}
	
	public List<ServiceRequest> TrackOrder(int customerID)
	{
		return srrepo.TrackOrder(customerID);
	}

}

