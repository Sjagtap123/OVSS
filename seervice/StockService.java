package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StockRepository;
import com.example.demo.entities.Stock;

@Service
public class StockService 
{
	@Autowired
	StockRepository strepo;
	
	public Stock add(Stock s)
	{
		return strepo.save(s);
	}
	
	public List<Stock> GetStock()
	{
		return strepo.findAll();
	}
}
