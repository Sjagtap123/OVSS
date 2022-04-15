package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;

@Repository
@EnableJpaRepositories
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

	@Query("select o from Owner o where login = :l")
	public Owner getOwner(Login l);
	
	@Query(value = "select * from owner where areaID = ?1",nativeQuery = true)
	public List<Owner> getOwnerbyArea(int areaID);
}
