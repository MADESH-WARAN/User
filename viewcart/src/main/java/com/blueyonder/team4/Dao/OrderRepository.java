package com.blueyonder.team4.Dao;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.OrderTable;



@Repository
public interface OrderRepository extends JpaRepository<OrderTable,Integer> {

	Optional<OrderTable> findById(Integer i);

}