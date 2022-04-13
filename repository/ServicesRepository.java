package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.Services;
@Repository
@Transactional
public interface ServicesRepository extends JpaRepository<Services, Integer> {

	@Query(value="select * from service where category_id=?1",nativeQuery = true)
	public List<Services> getAllbyCat(int category_id);
}
