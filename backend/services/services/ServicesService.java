package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Question;
import com.example.demo.entities.Services;
import com.example.demo.repository.ServicesRepository;

@Service
public class ServicesService {
	
	@Autowired
	ServicesRepository srepo;

	public Services add(Services s)
	{
		return srepo.save(s);
		
	}
	
	public List<Services> getAll()
	{
		return srepo.findAll();
	}
	
	public Services getService(int service_id)
	{
		return srepo.findById(service_id).get();
	}
	
	public List<Services> getAllbyCat(int category_id)
	{
		return srepo.getAllbyCat(category_id);
	}
}
