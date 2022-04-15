package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ServiceRequestDetails;
@Repository
public interface ServiceRequestDetRepository extends JpaRepository<ServiceRequestDetails, Integer> {

}
