package com.blueyonder.team4.controller;
import com.blueyonder.team4.OrderTable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.service.AddCartService;
@RestController
@RequestMapping("/cart")
public class AddCartController {
	
		@Autowired
		private AddCartService AddcartService;
		
		
		
		@GetMapping("/get")
		public List<OrderTable> getAllProducts(){
			return AddcartService.getAllProducts();
		}
		
		
		
		@PostMapping("/addcart")
		public OrderTable addProduct(@RequestBody OrderTable cart){
			return  AddcartService.addProducts(cart);
		}
		
		/*@PutMapping("/update")
		public OrderTable updateProduct(@RequestBody OrderTable cart){
			return AddcartService.updateProduct(cart);
		}*/
		
		@DeleteMapping("/delete/{id}")
		public void deleteProduct(@PathVariable int id) {
			 AddcartService.deleteProduct(id);
		}
		
}
