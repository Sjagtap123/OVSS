package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;


@Repository
@EnableJpaRepositories
public interface LoginRepository extends JpaRepository<Login, Integer> 
{
  @Query("select l from Login l  where email=:uemail and password=:pwd")
  public Login checkLogin(String uemail,String pwd);
  
}
