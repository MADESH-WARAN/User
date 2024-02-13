package com.blueyonder.team4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.OrderTable;
import com.blueyonder.team4.Dao.OrderTableDao;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ViewCartService {
	@Autowired
	OrderTableDao cartdao;
	public List<OrderTable> getcart() {
		//List<OrderTable> l=cartdao.findAll();
		//return l.stream().filter(Order -> Order.getStatus().equals("Not Placed")).collect(Collectors.toList());
		return cartdao.findAll().stream().filter(Order -> Order.getStatus().equals("Not Placed")).collect(Collectors.toList());
	}
}
