package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;

@Transactional
@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
   
	@Query(value="select * from area where cityID=?1",nativeQuery = true)
	public List<Area> getAreaByCity(int cityID);
}
