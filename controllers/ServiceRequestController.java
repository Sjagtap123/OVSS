package com.example.demo.controllers;


import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.BookingServices;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Owner;
import com.example.demo.entities.ServiceRequest;
import com.example.demo.entities.ServiceRequestDetails;
import com.example.demo.entities.Vehicle;
import com.example.demo.seervice.CustomerService;
import com.example.demo.seervice.OwnerService;
import com.example.demo.seervice.ServiceRequestDetService;
import com.example.demo.seervice.ServiceRequestService;
import com.example.demo.seervice.ServicesService;
import com.example.demo.seervice.VehicleService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ServiceRequestController {

	@Autowired
	ServiceRequestService srservice;
	@Autowired
	CustomerService cservice;
	@Autowired
	OwnerService oservice;
	@Autowired
	VehicleService vservice;
	@Autowired
	ServiceRequestDetService srdservice;
	
	@Autowired
	ServicesService ss;
	
	@PostMapping("/placeorder")
	public ServiceRequest AddOrder(@RequestBody BookingServices bs) throws Exception
	{
		Customer c=cservice.getCustomer(bs.getCustomerID());
		Owner o=oservice.getOwner(bs.getOwnerID());
		Vehicle v=vservice.GetVehicle(bs.getVehicleID());
		//java.util.Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(Calendar.getInstance().getTime().toString());
		//Date d1 = new Date(utilDate.getTime());
		
		LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        java.util.Date utildate = new SimpleDateFormat("yyyy-MM-dd").parse(dateObj.format(formatter));
        Date d1 = new Date(utildate.getTime());
        
        System.out.println(d1);
        
        
		List<ServiceRequestDetails> list = new ArrayList<>();
		 for(int i : bs.getService_id())
		 {
			 list.add(new ServiceRequestDetails(ss.getService(i)));
		 } 
		 
		 ServiceRequest obj = new ServiceRequest(c,o,v,null,"Not Assigned",d1,bs.getServicing_date(),list);
		return srservice.Add(obj);   //	1 record - SR, multiple records - SRDetails
			
	
	}
	
	@GetMapping("/AssignEmp/{empid}/{order_id}")
	public int AssignEmployee(@PathVariable("empid") int empid,@PathVariable("order_id") int order_id)
	{
		return srservice.AssignEmployee(empid,order_id);
	}
	
	@GetMapping("/UpdateStatus/{status}/{order_id}")
	public int UpdateStatus(@PathVariable("status") String status,@PathVariable("order_id") int order_id)
	{
		return srservice.UpdateStatus(status,order_id);
	}
	
	
}
