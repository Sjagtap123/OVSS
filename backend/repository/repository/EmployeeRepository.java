package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Login;


@Repository
@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("select e from Employee e where login = :l")
	public Employee getEmployee(Login l);

}
