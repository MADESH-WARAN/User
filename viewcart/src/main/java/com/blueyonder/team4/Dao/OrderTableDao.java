package com.blueyonder.team4.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.OrderTable;

@Repository
public interface OrderTableDao extends JpaRepository<OrderTable,Integer>  {
	
}
