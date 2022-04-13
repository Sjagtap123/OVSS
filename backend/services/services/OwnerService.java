package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Owner;
import com.example.demo.repository.OwnerRepository;

@Service
public class OwnerService {
  
	@Autowired
	OwnerRepository orepo;
	
	public Owner add(Owner o)
	{
		return orepo.save(o);
	}
	
	public Owner getOwner(int ownerID)
	{
		return orepo.findById(ownerID).get();
	}
	
	public List<Owner> getOwnerbyArea(int areaID)
	{
		return orepo.getOwnerbyArea(areaID);
	}
} 
