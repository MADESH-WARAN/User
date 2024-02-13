package com.blueyonder.team4.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.blueyonder.team4.Customer;
import com.blueyonder.team4.Dao.CustomerRepository;




@Service
public class CustomerService {

	@Autowired 
	CustomerRepository customerrepository;
	 
	public List<Customer> getallcustomers() {
		// TODO Auto-generated method stub
		List<Customer> c=customerrepository.findAll();
		return c;
	}

	public Customer getcustomerbyid(Integer id) {
		// TODO Auto-generated method stub
		return customerrepository.findById(id).orElse(null);
	}
	
	


}