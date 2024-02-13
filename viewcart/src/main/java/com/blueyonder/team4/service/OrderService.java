package com.blueyonder.team4.service;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.OrderTable;
import com.blueyonder.team4.Dao.OrderRepository;




@Service
public class OrderService {
	
	@Autowired 
	OrderRepository orderrepository;

	public OrderTable getorderbyid(Integer i) {
		// TODO Auto-generated method stub
		return orderrepository.findById(i).orElse(null);
	}

	public OrderTable getbyid(int o_id) {
		// TODO Auto-generated method stub
		return orderrepository.findById(o_id).orElse(null);
		
	}

	
	
	}

