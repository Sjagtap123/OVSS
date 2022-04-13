package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;


@Repository
@EnableJpaRepositories
public interface AdminRepository extends JpaRepository<Admin, Integer> {
  

	@Query("select a from Admin a where login = :l")
	public Admin getAdmin(Login l);
}
