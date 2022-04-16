package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Invoice;
import com.example.demo.entities.InvoiceAdd;
import com.example.demo.entities.ServiceRequest;
import com.example.demo.seervice.CustomerService;
import com.example.demo.seervice.InvoiceService;
import com.example.demo.seervice.ServiceRequestService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class InvoiceController {
	
	@Autowired
	InvoiceService iservice;
	@Autowired
	ServiceRequestService srservice;
	@Autowired
	CustomerService cservice;
	
	@PostMapping("/AddInvoice")
	public Invoice AddInvoice(@RequestBody InvoiceAdd ia)
	{
		ServiceRequest order_id=srservice.GetOrderID(ia.getOrder_id());
		Customer c=cservice.getCustomer(ia.getCustomerID());
		
		Invoice i=new Invoice(ia.getDate(),order_id,c,ia.getTotalBill());
		
		return iservice.AddInvoice(i);
	}
	
	@GetMapping("/getinvoice")
	public List<Invoice> Getinvoice()
	{
		return iservice.Getinvoice();
	}

}
