package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.City;
import com.example.demo.repository.CityRepository;

@Service
public class CityService {
    
	
	@Autowired
	CityRepository cityrepo;
	
	public List<City> getAll()
	{
		return cityrepo.findAll();
	}
	
	
	public City add(City city)
	{
		return cityrepo.save(city);
	}
}
