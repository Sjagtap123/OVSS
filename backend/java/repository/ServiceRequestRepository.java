package com.example.demo.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ServiceRequest;
@Transactional
@Repository
public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Integer> {

	@Modifying
	@Query(value="update service_request set emp_id = ?1 where order_id = ?2",nativeQuery = true)
	public int AssignEmployee(int empid, int order_id);
	
	@Modifying
	@Query(value="update service_request set order_status = ?1 where order_id = ?2",nativeQuery = true)
	public int UpdateStatus(String status, int order_id);
	
	@Query(value="select * from service_request where ownerID = ?1 and emp_id is null",nativeQuery = true)
	public List<ServiceRequest> ViewPendingRequests(int owner_id);
	
	@Query(value="select * from service_request where emp_id = ?1 and order_status in ('Pending','In Progress') ",nativeQuery = true)
	public List<ServiceRequest> ViewAssignedRequest(int emp_id);
	
	@Query(value="select * from service_request where customerID = ?1",nativeQuery = true)
	public List<ServiceRequest> TrackOrder(int customerID);
}
