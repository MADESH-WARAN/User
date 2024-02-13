package com.blueyonder.team4.service;
import java.util.List;
import com.blueyonder.team4.Dao.OrderTableDao;
import org.springframework.beans.factory.annotation.Autowired;
import com.blueyonder.team4.OrderTable;
public class AddCartService {
	@Autowired
	private OrderTableDao OrderRepository;
	
	public List<OrderTable> getAllProducts() {
		return OrderRepository.findAll();
	}

	/*public OrderTable updateProduct(OrderTable cart) {
		System.out.println(cart.getP_id());
		return productRepository.save(product);
	}*/

	public void deleteProduct(int id) {
		OrderRepository.deleteById(id);;
	}

	public OrderTable addProducts(OrderTable cart) {
		return OrderRepository.save(cart);
	}

	/*public Product getById(int id) {
		
		Optional<Product> product=productRepository.findById(id);
		return product.get();
	}*/
}
