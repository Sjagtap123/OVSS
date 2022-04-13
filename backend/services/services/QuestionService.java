package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Question;
import com.example.demo.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository qrepo;
	
	public Question add(Question q)
	{
		return qrepo.save(q);
	}
	public Question getQuestion(int questionID)
	{
		return qrepo.findById(questionID).get();
	}
	

	public List<Question> getAll()
	{
		return qrepo.findAll();
	}
}
