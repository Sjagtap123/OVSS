package com.example.demo.seervice;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.OwnerRepository;



@Service
public class LoginService 
{
	@Autowired
	LoginRepository lrepo;
	
	@Autowired
	CustomerRepository crepo;
	
	@Autowired
	OwnerRepository orepo;
	
	@Autowired
	EmployeeRepository erepo;
	
	@Autowired
	AdminRepository arepo;
	
	
	
	public Login add(Login l)
	{
		return lrepo.save(l);
	}
	
	public Object checkLogin(String uid,String pwd)
	{
		Login l = lrepo.checkLogin(uid, pwd);
		
		if(l != null)
		{
			Object  o = null;
			if(l.getuserType().equals("customer"))
			{
				o= crepo.getCustomer(l);
			}
			else if(l.getuserType().equals("owner"))
			{
				o = orepo.getOwner(l);
			}
			
			else if(l.getuserType().equals("employee"))
			{
				o = erepo.getEmployee(l);
			}
			else if(l.getuserType().equals("admin"))
			{
				o = arepo.getAdmin(l);
			}
			return o;
			
		}
		
		else
		{
			return null;
		}
	}
}
