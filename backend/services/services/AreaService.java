package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Area;
import com.example.demo.repository.AreaRepository;

@Service
public class AreaService {

	@Autowired
	AreaRepository arepo;
	
	public Area add(Area a)
	{
		return arepo.save(a);
	}
	
	public Area getArea(int areaID)
	{
		return arepo.findById(areaID).get();
	}
	
	public List<Area> getAreaByCity(int cityID)
	{
		return arepo.getAreaByCity(cityID);
	}

	public List<Area> getarea() {
		// TODO Auto-generated method stub
		return arepo.findAll();
	}
}
