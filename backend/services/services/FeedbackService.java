package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Feedback;
import com.example.demo.repository.FeedbackRepository;

@Service
public class FeedbackService {
    
	@Autowired
	FeedbackRepository frepo;
	
	public Feedback add(Feedback f)
	{
		return frepo.save(f);
	}
	
	

	public List<Feedback> getFeedback(int oid)
	{
		return frepo.getfeedback(oid);
	}
	public List<Feedback> getFeedbacks()
	{
		return frepo.findAll();
	}
}
