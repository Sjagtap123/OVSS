package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Stock;
import com.example.demo.seervice.StockService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StockController 
{
	@Autowired
	StockService stservice;
	@PostMapping("/getStock")
	public Stock AddStock(@RequestBody Stock ss)
	{
		Stock s=new Stock(ss.getStock_name(),ss.getStock_price(),ss.getStock_qty());
		return stservice.add(ss);
	}
	@GetMapping("/AllStock")
	public List<Stock> getStock()
	{
		return stservice.GetStock();
	}
	
	@PutMapping("/updatestock")
	public Stock updatestock(@RequestBody Stock s )
	{
		return stservice.add(s);
	}

}
