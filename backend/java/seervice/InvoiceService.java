package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Invoice;
import com.example.demo.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRepository irepo;
	
	public Invoice AddInvoice(Invoice i)
	{
		return irepo.save(i);
	}
	
	public List<Invoice> Getinvoice()
	{
		return irepo.findAll();
	}
}
