package com.example.demo.seervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
  
	@Autowired
	EmployeeRepository erepo;
	
	public Employee add(Employee e)
	{
		return erepo.save(e);
	}
	
	public List<Employee> GetAEmp(int ownerID)
	{
		return erepo.getAEmployee(ownerID);
	}
	
	public Employee getEmp(int empid)
	{
		return erepo.getById(empid);
	}
} 
