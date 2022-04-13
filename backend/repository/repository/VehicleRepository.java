package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Owner;
import com.example.demo.entities.ServiceDetails;
import com.example.demo.entities.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	  @Query("select v from Vehicle v  where customerID =:cid")
	  public List<Vehicle> getVehicle(Customer cid);
	  
	  
}
