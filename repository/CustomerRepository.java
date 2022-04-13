package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;


@Repository
@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer, Integer> 
{
	@Query("select c from Customer c where login = :l")
	public Customer getCustomer(Login l);
}
