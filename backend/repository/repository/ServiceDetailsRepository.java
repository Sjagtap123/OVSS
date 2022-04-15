package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Owner;
import com.example.demo.entities.ServiceDetails;


@Transactional
@Repository
public interface ServiceDetailsRepository extends JpaRepository<ServiceDetails, Integer> {
   
	  @Query("select s from ServiceDetails s  where ownerID=:oid")
	  public List<ServiceDetails> servicedetails(Owner oid);
	  
      	  
}
