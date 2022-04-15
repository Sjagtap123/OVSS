package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Vehicle;
import com.example.demo.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	VehicleRepository vrepo;
	
	
	
	
	public Vehicle addVehicle(Vehicle v)
	{
		return vrepo.save(v);
	}
	
	public List<Vehicle> getVehicle(Customer cid)
	{
		return vrepo.getVehicle(cid);
	}
	
	public Vehicle GetVehicle(int vehicleID)
	{
		return vrepo.findById(vehicleID).get();
	}

}
