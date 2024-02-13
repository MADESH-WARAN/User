package com.blueyonder.team4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.Customer;
import com.blueyonder.team4.OrderTable;
import com.blueyonder.team4.service.CustomerService;
import com.blueyonder.team4.service.OrderService;
import com.blueyonder.team4.service.ViewCartService;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("viewcart")
public class ViewCartController {
	@Autowired
	ViewCartService viewcartserv;
	@GetMapping("showcart")
	public List<OrderTable> getcart() {
		return viewcartserv.getcart();
	}
	
	
	
	CustomerService customerservice;
	
	//view order history
	@Autowired
	OrderService orderservice;
	@GetMapping("/customer/{id}")
	public ResponseEntity<?> customerorders(@PathVariable Integer id)
	{
		
		Customer c=customerservice.getcustomerbyid(id);
		List<OrderTable> ans =new ArrayList<>() ;
		if (c!=null) {
		List<Integer> x=c.getO_id();
		 
		for(Integer i :x)
		{
			System.out.println("hello");
			OrderTable o = orderservice.getorderbyid(i);
			ans.add(o);
		}
		return ResponseEntity.ok(ans);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("customer not found");
		}
		
	}
	
	
	//track order status 
	@GetMapping("/getstatus/{o_id}")
	public ResponseEntity<?> getStatus(@PathVariable int o_id)
    {
		OrderTable o=orderservice.getbyid(o_id);
		if(o!=null)
		{
			return ResponseEntity.ok(o.getStatus());
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("order not found");
		}
	}
}
