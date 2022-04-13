package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Feedback;
import com.example.demo.entities.Owner;
import com.example.demo.entities.ServiceDetails;


@Transactional
@Repository

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
  
	 @Query("select f from Feedback f  where ownerID =:oid")
	 public List<Feedback> getfeedback(int oid);
}
