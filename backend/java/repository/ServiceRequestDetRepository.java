package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ServiceRequestDetails;
import com.example.demo.entities.Services;
@Repository
public interface ServiceRequestDetRepository extends JpaRepository<ServiceRequestDetails, Integer> {

	@Query(value="select service_id from service_request_details where order_id=?1",nativeQuery = true)
	public List<Integer> GetAll(int oid);
}
