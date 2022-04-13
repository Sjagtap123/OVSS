package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.entities.Services;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository catrepo;
	
	public Category add(Category ct)
	{
		return catrepo.save(ct);
	}
	
	public List<Category> getAllCat()
	{
		return catrepo.findAll();
		
	}
	
	public Category getCategory(int category_id)
	{
		return catrepo.findById(category_id).get();
	}
}
