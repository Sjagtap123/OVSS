package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.City;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Owner;
import com.example.demo.entities.Question;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	CustomerRepository crepo;
	
	public Customer add(Customer c)
	{
		return crepo.save(c);
	}
	
	
	public Customer getCustomer(int custID)
	{
		return crepo.findById(custID).get();
	}
	
	public List<Customer> getAll()
	{
		return crepo.findAll();
	}
}  

